package cn.itcast.cd.hello;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
			
	}

	
	public ServletConfig getServletConfig() {
	
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("hello");
		
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void destroy() {
	
		
	}


}
