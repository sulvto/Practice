package me.qinchao.shopping.web.front.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.qinchao.shopping.domain.CartItem;
import me.qinchao.shopping.domain.Product;
import me.qinchao.shopping.domain.ShoppingCart;
import me.qinchao.shopping.service.IProductService;
import me.qinchao.shopping.service.impl.ProductServiceImpl;
import me.qinchao.shopping.web.servlet.BaseServlet;

@WebServlet("/shoppingcart")
public class ShoppingCartServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IProductService service;

	@Override
	public void init() throws ServletException {
		service = new ProductServiceImpl();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		if ("add".equals(cmd)) {
			this.add(req, resp);
		} else if ("delete".equals(cmd)) {
			this.delete(req, resp);
		} else {
			this.list(req, resp);
		}
	}

	protected void add(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		// 1.c查询出被添加到购物车的商品对象
		Product pro = service.get(Long.valueOf(id));
		System.out.println(id);
		// 2.构建CartItem对象
		CartItem item = new CartItem();
		item.setId(Long.valueOf(id));
		item.setNum(1);
		item.setPrice(pro.getSalePrice());
		item.setPro(pro);
		// 3.把Caritem放入购物车中
		ShoppingCart cart = (ShoppingCart) req.getSession().getAttribute(
				"SHOPPINGCART_IN_SESSION");
		if (cart == null) {
			cart = new ShoppingCart();
			req.getSession().setAttribute("SHOPPINGCART_IN_SESSION", cart);
		}
		cart.save(item);
		// 4.跳转到购物车列表
		resp.sendRedirect("/shoppingcart");
	}

	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 获取session中购物车里所有的CartItem
		ShoppingCart cart = (ShoppingCart) req.getSession().getAttribute(
				"SHOPPINGCART_IN_SESSION");
		if (cart != null) {
			List<CartItem> items = cart.getItems();
			req.setAttribute("items", items);
		}
		super.forward("/WEB-INF/views/front/shoppingcart.jsp", req, resp);
	}

	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		ShoppingCart cart = (ShoppingCart) req.getSession().getAttribute("SHOPPINGCART_IN_SESSION");
		cart.delete(Long.valueOf(id));
		resp.sendRedirect("/shoppingcart");
	}
}
