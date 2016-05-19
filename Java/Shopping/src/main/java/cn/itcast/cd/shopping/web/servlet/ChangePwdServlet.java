package cn.itcast.cd.shopping.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.cd.shopping.domain.User;
import cn.itcast.cd.shopping.exception.SystemException;
import cn.itcast.cd.shopping.factory.BeanFactory;
import cn.itcast.cd.shopping.service.IUserService;

//修改密码
@WebServlet("/changePwd")
public class ChangePwdServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IUserService service;

	public void init() throws ServletException {
		service = BeanFactory.INSTANCE.getBean("userService",
				IUserService.class);
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		if ("changeUI".equals(cmd)) {
			this.changeUI(req, resp);
		} else {
			change(req, resp);
		}
	}

	//到密码修改界面
	protected void changeUI(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.forward("/WEB-INF/views/User/changePwd.jsp", req, resp);
	}

	//修改密码操作
	protected void change(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//1.接受请求参数
		String oldPwd = req.getParameter("oldPwd");
		String newPwd = req.getParameter("newPwd");
		String reNewPwd = req.getParameter("reNewPwd");
		//2.调用业务方法处理请求
		User user = (User) req.getSession().getAttribute("USER_IN_SESSION");
		try {
			service.changePwd(oldPwd, newPwd, reNewPwd, user);
			req.getSession().invalidate();
			//3.控制界面跳转
			resp.sendRedirect("/login.jsp");
		} catch (SystemException e) {
			req.setAttribute("errors", e.getMessage());
			super.forward("/WEB-INF/views/User/changePwd.jsp", req, resp);
		}

	}
}
