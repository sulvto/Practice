package me.qinchao.example.interceptor;

import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import me.qinchao.example.config.Constant;
import me.qinchao.example.model.User;
import me.qinchao.example.utils.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sulvto on 01/16/19.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
    private final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    public  static  final  String  LAST_PAGE = "lastPage";

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) {
        logger.info("check authorization");

        // 等到请求头信息authorization信息
        final String authHeader = request.getHeader("authorization");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            if (authHeader == null || !authHeader.startsWith("bearer;")) {
                logger.warn("error authorization header: {}", authHeader);
                return false;
            }

            final String token = authHeader.substring(7);

            try {
                Claims claims = TokenUtil.parseJWT(token);
                if (claims == null) {
                    logger.warn("claims is null: token -> {}", token);
                    return false;
                } else {
                    request.setAttribute(Constant.ATTR_TOKEN, token);
                    request.setAttribute(Constant.ATTR_CLAIMS, claims);
                    request.setAttribute(Constant.ATTR_USER, JSON.parseObject(claims.getSubject(), User.class));
                    request.setAttribute(Constant.ATTR_EXPIRATION, claims.getExpiration());
                }
            } catch (ExpiredJwtException expiredJwtException) {
                logger.warn(expiredJwtException.getMessage(), expiredJwtException);
                return false;
            } catch (final Exception e) {
                logger.error(e.getMessage(), e);
                return false;
            }
        }
        return true;
    }
}
