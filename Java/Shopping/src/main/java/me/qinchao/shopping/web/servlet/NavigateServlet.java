package me.qinchao.shopping.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//导航框架集页面
@WebServlet("/system/nav")
public class NavigateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		String path = "/WEB-INF/views/system/index.html";
		if ("top".equals(cmd)) {
			path = "/WEB-INF/views/system/top.jsp";
		} else if ("foot".equals(cmd)) {
			path = "/WEB-INF/views/system/foot.html";
		}else if("menu".equals(cmd)){
			path = "/WEB-INF/views/system/menu.html";
		}else if("main".equals(cmd)){
			path = "/WEB-INF/views/system/main.html";
		}
		req.getRequestDispatcher(path).forward(req, resp);
	}
}
