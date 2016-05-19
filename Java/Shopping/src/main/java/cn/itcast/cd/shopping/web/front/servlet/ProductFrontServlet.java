package cn.itcast.cd.shopping.web.front.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.cd.shopping.service.IProductService;
import cn.itcast.cd.shopping.service.impl.ProductServiceImpl;
import cn.itcast.cd.shopping.web.servlet.BaseServlet;
@WebServlet("/font/pro")
public class ProductFrontServlet extends BaseServlet{
	private static final long serialVersionUID = 1L;
	private IProductService dao = null;
	@Override
	public void init() throws ServletException {
		dao = new ProductServiceImpl();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String cmd = req.getParameter("cmd");
		if("views".equals(cmd)) {
			this.views(req, resp);
		}else {
			resp.sendRedirect("/index");
		}
	}
	protected void views(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		req.setAttribute("pro", dao.get(Long.valueOf(id)));
		super.forward("/WEB-INF/views/front/finally.jsp", req, resp);
	}
}
