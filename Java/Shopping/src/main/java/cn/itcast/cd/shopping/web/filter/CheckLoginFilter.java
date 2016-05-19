package cn.itcast.cd.shopping.web.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//:/system/list
//:/system/xx/xx
//:/system/save
//:/xx
@WebFilter("/system/*")
public class CheckLoginFilter implements Filter {
	
	//设置不被CheckLoginFilter,拦截的资源
	private String[] uncheckedUrls = {"login.jsp","login"};
	public void init(FilterConfig config) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String requestUri = req.getRequestURI().substring(1);
		if(!Arrays.asList(uncheckedUrls).contains(requestUri)){
			Object user = req.getSession().getAttribute("USER_IN_SESSION");
			if (user == null) {//没登录
				resp.sendRedirect("/login.jsp");
				return;
			}
		}
		chain.doFilter(req, resp);
	}

	public void destroy() {
	}
}
