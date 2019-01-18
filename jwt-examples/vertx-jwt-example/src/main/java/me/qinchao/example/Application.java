package me.qinchao.example;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.web.Cookie;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.CorsHandler;
import me.qinchao.example.config.Constant;
import me.qinchao.example.model.User;
import me.qinchao.example.utils.Response;
import me.qinchao.example.utils.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

import static me.qinchao.example.utils.Response.error;
import static me.qinchao.example.utils.Response.success;

/**
 * Created by sulvto on 1/17/19.
 */
public class Application extends AbstractVerticle {
    private final Logger logger = LoggerFactory.getLogger(Application.class);

    private JDBCClient client;

    private void initJDBCClient() {
        // Create a JDBC client with a test database
        client = JDBCClient.createShared(vertx, new JsonObject()
                .put("url", "jdbc:mysql://localhost:3306/db_user")
                .put("user", "root")
                .put("password", "a111111")
                .put("driver_class", "com.mysql.jdbc.Driver"));
    }

    private void end(int statusCode, HttpServerResponse response) {
        response.setStatusCode(statusCode).end();
    }

    @Override
    public void start() {
        initJDBCClient();

        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);

        router.route().handler(CookieHandler.create());
        router.route().handler(CorsHandler.create("*")
                .allowedMethod(HttpMethod.GET)
                .allowedMethod(HttpMethod.POST)
                .allowedHeader("content-type")
                .allowedHeader("authorization"));

        router.route().handler(routingContext -> {
            HttpServerRequest request = routingContext.request();
            logger.info("request.uri {}", request.uri());
            routingContext.next();
        });

        // 处理http://localhost:8080/
        router.route("/").handler(routingContext -> {
            routingContext.response().end("Hello World!");
        });

        // 处理http://localhost:8080/date
        router.route("/date").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "text/plain");
            response.end("date: " + new java.util.Date());
        });

        router.options("/api/*")
            .handler(routingContext -> end(200, routingContext.response()));

        // BodyHandler /api
        router.route("/api/*").handler(BodyHandler.create()).failureHandler(routingContext -> {
            Throwable failure = routingContext.failure();
            logger.error("/api failure", failure);
        });

        // in order to minimize the nesting of call backs we can put the JDBC connection on the context for all routes
        // that match /api
        // this should really be encapsulated in a reusable JDBC handler that uses can just add to their app
        router.route("/api/*")
                .handler(BodyHandler.create())
                .handler(this::interceptor)
                .handler(this::jdbcHandler)
                .failureHandler(routingContext -> {
                    SQLConnection conn = routingContext.get(Constant.ATTR_SQL_CONNECTION);
                    if (conn != null) {
                        conn.close(v -> {
                        });
                    }
                });

        // login skip interceptor
        router.route("/api/login").handler(this::handleLogin);
        router.route("/api/me").handler(this::handleCurrentUserinfo);
        router.route("/api/logout").handler(this::handleLogout);

        server.requestHandler(router::accept).listen(8080);
    }

    /**
     *
     * @param routingContext
     */
    private void jdbcHandler(RoutingContext routingContext) {
        client.getConnection(res -> {
            if (res.failed()) {
                routingContext.fail(res.cause());
            } else {
                SQLConnection conn = res.result();

                // save the connection on the context
                routingContext.put(Constant.ATTR_SQL_CONNECTION, conn);

                // we need to return the connection back to the jdbc pool. In order to do that we need to close it, to keep
                // the remaining code readable one can add a headers end handler to close the connection.
                routingContext.addHeadersEndHandler(done -> conn.close(v -> {
                }));

                routingContext.next();
            }
        });
    }

    /**
     * login interceptor
     *
     * @param routingContext
     */
    private void interceptor(RoutingContext routingContext) {
        logger.info("enter interceptor");
        HttpServerResponse response = routingContext.response();
        HttpServerRequest request = routingContext.request();
        logger.info("check authorization");

        // 等到请求头信息authorization信息
        final String authHeader = request.getHeader("authorization");
        if ("/api/login".equalsIgnoreCase(request.uri())) {
            // login skip
            routingContext.next();
        } else if (authHeader == null || !authHeader.startsWith("bearer;")) {
            logger.warn("error authorization header: {}", authHeader);
            end(401, response);
        } else {
            final String token = authHeader.substring(7);

            try {
                Claims claims = TokenUtil.parseJWT(token);
                if (claims == null) {
                    logger.warn("claims is null: token -> {}", token);
                    end(401, response);
                } else {
                    routingContext.put(Constant.ATTR_CLAIMS, claims);
                    routingContext.put(Constant.ATTR_USER, Json.decodeValue(claims.getSubject(), User.class));
                    routingContext.put(Constant.ATTR_EXPIRATION, claims.getExpiration());

                    // next handler
                    routingContext.next();
                }
            } catch (ExpiredJwtException expiredJwtException) {
                logger.warn(expiredJwtException.getMessage(), expiredJwtException);
                end(401, response);
            } catch (final Exception e) {
                logger.error(e.getMessage(), e);
                end(401, response);
            }
        }
    }

    private void handleLogin(RoutingContext routingContext) {

        HttpServerResponse response = routingContext.response();

        User loginUser = routingContext.getBodyAsJson().mapTo(User.class);
        logger.info("loginUser: {}", loginUser.toString());

        SQLConnection connection = routingContext.get(Constant.ATTR_SQL_CONNECTION);
        connection.queryWithParams("SELECT id, username FROM user WHERE username = ? AND password = ?", new JsonArray().add(loginUser.getUsername()).add(loginUser.getPassword()), query -> {
            if (query.failed()) {
                logger.error("login query failed", query.cause());
                end(401, response);
            } else {
                logger.info("login query success");
                List<JsonObject> result = query.result().getRows();
                if (result.size() == 1) {
                    JsonObject user = result.get(0);
                    user.put("password", "");

                    String token = TokenUtil.createJWT(Constant.JWT_ID, TokenUtil.generalSubject(user), Constant.JWT_TTL);

                    JsonObject responseData = new JsonObject();
                    responseData.put("token", token);
                    responseData.put("type", "bearer");
                    responseData.put("userinfo", user);
                    routingContext.addCookie(Cookie.cookie("token", token));
                    response.end(success("登录成功", responseData));
                } else {
                    response.end(error(-1, "用户名或密码错误"));
                }
            }
        });
    }

    private void handleCurrentUserinfo(RoutingContext routingContext) {
        Object userinfo = routingContext.get(Constant.ATTR_USER);
        routingContext.response().end(success("", userinfo));
    }

    private void handleLogout(RoutingContext routingContext) {
        routingContext.removeCookie("token");
        routingContext.response().end(success());
    }


    public static void main(String[] args) throws IOException {
        String verticleID = Application.class.getName();
        runExample(verticleID);
    }

    public static void runExample(String verticleID) {
        VertxOptions options = new VertxOptions();

        Consumer<Vertx> runner = vertx -> vertx.deployVerticle(verticleID);

        // Vert.x实例是vert.x api的入口点，我们调用vert.x中的核心服务时，均要先获取vert.x实例，
        // 通过该实例来调用相应的服务，例如部署verticle、创建http server
        Vertx vertx = Vertx.vertx(options);
        runner.accept(vertx);
    }
}
