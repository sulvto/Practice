package cn.itcast.cd.request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistHttpServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		System.out.println(req.getRequestURL());
		System.out.println(req.getLocalName()+"正在提交");
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String[] favs = req.getParameterValues("favs");
		String city = req.getParameter("city");
		String intro = req.getParameter("intro");
				
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(Arrays.asList(favs));
		System.out.println(city);
		System.out.println(intro);
		
		
		req.getRequestURI();
		
		
		
	}

}
