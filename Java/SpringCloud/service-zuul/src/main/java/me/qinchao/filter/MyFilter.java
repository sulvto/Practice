package me.qinchao.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by sulvto on 18-7-31.
 */
@Component
public class MyFilter extends ZuulFilter {
    private final static Logger logger = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info("{} >> {}", request.getMethod(), request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            logger.warn("token is empty");

            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);

            try {
                requestContext.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
            }
        }
        return null;
    }
}
