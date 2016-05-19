package me.qinchao.hello;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServletConfig implements Servlet{
	private String name;
	@Override
	public void init(ServletConfig config) throws ServletException {
		Enumeration<String> names = config.getInitParameterNames();
		while(names.hasMoreElements()) {
			name = names.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name+" == "+value);
		}
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
			if("language".equals(name)) {
				System.out.println("你好");
			}		
	}

	@Override
	public String getServletInfo() {
	
		return null;
	}

	@Override
	public void destroy() {
		
		
	}

}
