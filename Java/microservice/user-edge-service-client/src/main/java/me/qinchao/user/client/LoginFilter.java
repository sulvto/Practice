package me.qinchao.user.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import me.qinchao.thrift.user.dto.UserDTO;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * Created by sulvto on 18-8-2.
 */
public abstract class LoginFilter implements Filter {
    private final static String USER_SERVICE_HOST = "user-service";
    private final static String USER_SERVICE_PORT = "8082";

    private Cache<String, UserDTO> userDTOCache = CacheBuilder
            .newBuilder()
            .maximumSize(10000)
            .expireAfterWrite(3, TimeUnit.MINUTES)
            .build();

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String token = request.getParameter("token");
        if (org.apache.commons.lang.StringUtils.isBlank(token)) {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("token".equalsIgnoreCase(cookie.getName())) {
                        token = cookie.getValue();
                    }
                }
            }
        }

        UserDTO userDTO = requestUserInfo(token);
        if (userDTO != null) {
            login(request, response, userDTO);
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            response.sendRedirect(USER_SERVICE_HOST + ":" + USER_SERVICE_PORT + "/user/login");
        }
    }

    protected abstract void login(HttpServletRequest request, HttpServletResponse response, UserDTO userDTO);

    private UserDTO requestUserInfo(final String token) {
        if (org.apache.commons.lang.StringUtils.isNotBlank(token)) {
            UserDTO result = userDTOCache.getIfPresent(token);
            if (result == null) {
                result = authentication(token);
                if (result != null) {
                    userDTOCache.put(token, result);
                }
            }
            return result;
        }
        return null;
    }

    private UserDTO authentication(String token) {
        HttpClient httpClient = HttpClientBuilder.create().build();

        String uri = USER_SERVICE_HOST + ":" + USER_SERVICE_PORT + "/user/authentication";
        HttpPost post = new HttpPost(uri);
        post.addHeader("token", token);


        InputStream inputStream = null;
        try {
            HttpResponse httpResponse = httpClient.execute(post);
            if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new RuntimeException("request user info failed! StatusLine:" + httpResponse.getStatusLine());
            }
            inputStream = httpResponse.getEntity().getContent();
            byte[] temp = new byte[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int length = 0;
            while ((length = inputStream.read(temp)) > 0) {
                stringBuilder.append(new java.lang.String(temp, 0, length));
            }

            return new ObjectMapper().readValue(stringBuilder.toString(), UserDTO.class);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    public void destroy() {

    }
}
