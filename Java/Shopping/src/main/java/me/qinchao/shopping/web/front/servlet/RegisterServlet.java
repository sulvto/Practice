package me.qinchao.shopping.web.front.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.qinchao.shopping.domain.User;
import me.qinchao.shopping.exception.SystemException;
import me.qinchao.shopping.service.IUserService;
import me.qinchao.shopping.service.impl.UserServiceImpl;
import me.qinchao.shopping.web.servlet.BaseServlet;

@WebServlet("/register")
public class RegisterServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IUserService service = new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		System.out.println("RegisterServlet.service()");
		String cmd = req.getParameter("cmd");
		System.out.println(cmd);
		if("regist".equals(cmd)) {
			this.regist(req, resp);
		}else if("user".equals(cmd)){
			this.userLogin(req, resp);
		}else {
			this.toRegisterUI(req, resp);
		}
	}
	protected void toRegisterUI(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		forward("WEB-INF/views/front/register.jsp", req, resp);
	}
	protected void userLogin(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("type", "user");
		forward("/WEB-INF/views/front/login.jsp", req, resp);
	}
	protected void regist(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String rePwd = req.getParameter("rePwd");
		User user = new User();
		super.request2Obj(req, user);
		try {
//			System.out.println("user "+user);
			service.regist(user, rePwd);
//			System.out.println("111");
			forward("/WEB-INF/views/front/registerSuccess.jsp", req, resp);
		} catch (SystemException e) {
			req.setAttribute("error", e.getMessage()); 
//			System.out.println(e.getMessage());
			forward("/WEB-INF/views/front/register.jsp", req, resp);
		}
	}
}
