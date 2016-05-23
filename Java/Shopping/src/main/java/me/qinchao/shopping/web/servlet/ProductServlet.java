package me.qinchao.shopping.web.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.qinchao.shopping.dao.IProductDAO;
import me.qinchao.shopping.dao.IProductDirDAO;
import me.qinchao.shopping.domain.Product;
import me.qinchao.shopping.domain.ProductDir;
import me.qinchao.shopping.factory.BeanFactory;
import me.qinchao.shopping.page.PageList;
import me.qinchao.shopping.query.ProductQueryObject;
import me.qinchao.shopping.util.CommUtil;
import me.qinchao.shopping.util.FileUtil;

@WebServlet("/system/pro")
public class ProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IProductDAO dao;
	private IProductDirDAO productDirDAO;

	public void init() throws ServletException {
		dao = BeanFactory.INSTANCE.getBean("productDAO", IProductDAO.class);
		productDirDAO = BeanFactory.INSTANCE.getBean("productDirDAO",
				IProductDirDAO.class);
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
		} else if ("toUploadUI".equals(cmd)) {
			this.toUploadUI(req, resp);
		} else if ("upload".equals(cmd)) {
			this.upload(req, resp);
		} else if ("changeRecommend".equals(cmd)) {
			this.changeRecommend(req, resp);
		} else {
			this.list(req, resp);
		}
	}
	
	//设置是否推荐商品
	protected void changeRecommend(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		Product pro = dao.get(Long.valueOf(id));
		pro.setRecommended(!pro.getRecommended());//把之前的是否推荐,取反:推荐--->不推荐, 不推荐-->推荐
		dao.update(pro);
		resp.sendRedirect("/system/pro");
	}

	//跳转到商品图片上传界面
	protected void toUploadUI(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		Product pro = dao.get(Long.valueOf(id));
		req.setAttribute("pro", pro);//用于在上传界面,显示被上传图片商品的名字
		super.forward("/WEB-INF/views/Product/upload.jsp", req, resp);
	}

	//处理图片上传
	protected void upload(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//封装普通表单数据:key:参数名称,value:参数值
		Map<String,String> fieldMap = new HashMap();
		//封装上传表单数据:key:参数名称,value:保存的相等路径
		Map<String,String> binaryMap = new HashMap();
		
		FileUtil.upload(req,fieldMap,binaryMap);
		System.out.println(fieldMap);
		String id = fieldMap.get("id");
		Product pro = dao.get(Long.valueOf(id));
		
		String bigPicPath = binaryMap.get("bigPath");
		pro.setBigPic(bigPicPath);
		pro.setSmallPic(binaryMap.get("smallPic"));
		dao.update(pro);
		resp.sendRedirect("/system/pro");
	}

	//列表
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("dirs", productDirDAO.getAll());
		//=========================高级查询==================================
		ProductQueryObject qo = new ProductQueryObject();
		super.request2Obj(req, qo);
		req.setAttribute("qo", qo);//传递给JSP,用于查询数据回显
		//=========================分页操作==================================
		PageList pList = dao.query(qo);//高级查询+分页
		req.setAttribute("pList", pList);
		//===========================================================
		super.forward("/WEB-INF/views/Product/list.jsp", req, resp);
	}

	//编辑
	protected void edit(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		if (CommUtil.hasLength(id)) {
			Product pro = dao.get(Long.valueOf(id));
			req.setAttribute("pro", pro);
		}
		req.setAttribute("dirs", productDirDAO.getAll());
		super.forward("/WEB-INF/views/Product/edit.jsp", req, resp);
	}

	//删除
	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		dao.delete(Long.valueOf(id));
		resp.sendRedirect(req.getContextPath() + "/system/pro");
	}

	//新增/更新
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Product pro = new Product();
		super.request2Obj(req, pro);

		String dirId = req.getParameter("dirId");
		ProductDir dir = new ProductDir();
		dir.setId(Long.valueOf(dirId));
		pro.setDir(dir);
		System.out.println(pro);
		if (pro.getId() != null) {
			System.out.println("update");
			dao.update(pro);
		} else {
			System.out.println("save");
			dao.save(pro);
		}
		resp.sendRedirect(req.getContextPath() + "/system/pro");
	}
}
