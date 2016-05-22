package me.qinchao.shopping.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.qinchao.shopping.domain.User;
import me.qinchao.shopping.factory.BeanFactory;
import me.qinchao.shopping.service.IUserService;
import me.qinchao.shopping.util.CommUtil;

@WebServlet("/system/user")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IUserService service;

	public void init() throws ServletException {
		service = BeanFactory.INSTANCE.getBean("userService", IUserService.class);
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		if ("edit".equals(cmd)) {
			this.edit(req, resp);
		} else if ("delete".equals(cmd)) {
			this.delete(req, resp);
		} else if ("save".equals(cmd)) {
			this.saveOrUpdate(req, resp);
		} else {
			this.list(req, resp);
		}
	}

	//列表
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<User> list = service.getAll();
		req.setAttribute("list", list);
		super.forward("/WEB-INF/views/User/list.jsp", req, resp);
	}

	//编辑
	protected void edit(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		if (CommUtil.hasLength(id)) {
			User user = service.get(Long.valueOf(id));
			req.setAttribute("user", user);
		}
		super.forward("/WEB-INF/views/User/edit.jsp", req, resp);
	}

	//删除
	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		service.delete(Long.valueOf(id));
		resp.sendRedirect(req.getContextPath() + "/system/user");
	}

	//新增/更新
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		User dir = new User();
		super.request2Obj(req, dir);
		if (dir.getId() != null) {
			service.update(dir);
		} else {
			service.save(dir);
		}
		resp.sendRedirect(req.getContextPath() + "/system/user");
	}
}
