package cn.itcast.cd.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHttpServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println(req.getRemoteAddr());
		System.out.println(req.getRemotePort());
		System.out.println(req.getRemoteHost());
		System.out.println(req.getRemoteUser());
	
	}
}
