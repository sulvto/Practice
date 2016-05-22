package me.qinchao.shopping.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.qinchao.shopping.domain.User;
import me.qinchao.shopping.exception.SystemException;
import me.qinchao.shopping.factory.BeanFactory;
import me.qinchao.shopping.service.IUserService;

//系统登录
@WebServlet("/login")
public class SystemLoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IUserService service;

	public void init() throws ServletException {
		service = BeanFactory.INSTANCE.getBean("userService", IUserService.class);
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("SystemLoginServlet.service()");
		resp.setContentType("text/json;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//1.接受请求参数
		String username = req.getParameter("username");//唯一
		String password = req.getParameter("password");
		System.out.println("p "+password);
		String type = req.getParameter("type");
		String ip = req.getRemoteAddr();
		//2.调用业务方法处理请求:检查登录
		System.out.println(type);
		try {
			User user = service.checkUser(username,password,ip);
			String result = "{\"success\":true,\"msg\":\"登陆成功\",\"type\":\""+type+"\"}";
			out.print(result);
			req.getSession().setAttribute("USER_IN_SESSION", user);
		} catch (SystemException e) {
			String result = "{\"success\":false,\"msg\":\""+e.getMessage()+"\",\"type\":\""+type+"\"}";
			out.print(result);
		} 
	}
}
