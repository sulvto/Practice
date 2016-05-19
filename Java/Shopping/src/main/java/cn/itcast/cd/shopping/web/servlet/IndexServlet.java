package cn.itcast.cd.shopping.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.cd.shopping.domain.Product;
import cn.itcast.cd.shopping.domain.ProductDir;
import cn.itcast.cd.shopping.service.IProductDirService;
import cn.itcast.cd.shopping.service.IProductService;
import cn.itcast.cd.shopping.service.impl.ProductDirServiceImpl;
import cn.itcast.cd.shopping.service.impl.ProductServiceImpl;

@WebServlet("/index")
public class IndexServlet extends BaseServlet{
	private IProductDirService dirService;
	private IProductService service;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		dirService = new ProductDirServiceImpl();
		service = new ProductServiceImpl();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<ProductDir> dirs = dirService.getByType(13);
		List<Product> newProducts = service.getByNew(8); 
		List<Product> hotProducts = service.getByHot(8);
		System.out.println(hotProducts);
		req.setAttribute("dirs", dirs);
		req.setAttribute("newProducts", newProducts);
		req.setAttribute("hotProducts", hotProducts);
	super.forward("/WEB-INF/views/front/main.jsp", req, resp);
	}
}
