package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.ProductType;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.ProductTypeQuery;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.service.IProductTypeService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class ProductTypeAction extends CRUDAction<ProductType> {
	private static final long serialVersionUID = 1L;
	private IProductTypeService productTypeService;
	private ProductType productType = new ProductType();
	private PageResult<ProductType> pageResult;
	private BaseQuery baseQuery = new ProductTypeQuery();

	@Override
	protected void list() {
		logger.debug("List");
		this.pageResult = productTypeService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			productTypeService.update(productType);
		} else {
			productTypeService.save(productType);
			baseQuery.setCurrentPage(Integer.MAX_VALUE);
		}
		addActionMessage("保存成功");
		return RELOAD;
	}

	@Override
	public String delete() throws Exception {
		logger.debug("delete");
		HttpServletResponse response = ServletActionContext.getResponse();
		// 类型改成json,编码方式UTF-8
		response.setContentType("text/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (id != null) {
			try {
				productTypeService.delete(id);
				out.print("{\"success\":true,\"msg\":\"删除成功\"}");
			} catch (Exception e) {
				out.print("{\"success\":false,\"msg\":\"" + e.getMessage()
						+ "\"}");
			}
		} else {
			out.print("{\"success\":false,\"msg\":\"没有删除的id\"}");
		}
		return null;// 返回null
	}

	@Override
	public String input() throws Exception {
		logger.debug("input");
//		putContext("dept", departmentService.getAll());
		return INPUT;
	}

	@Override
	public void beforeSave() {

		if (id == null) {
			productType = new ProductType();
		} else {
			productType = productTypeService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			productType = productTypeService.get(id);
		}
	}

	public ProductType getModel() {
		return productType;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public PageResult<ProductType> getPageResult() {
		return pageResult;
	}


	public void setProductTypeService(IProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}


	public void setPageResult(PageResult<ProductType> pageResult) {
		this.pageResult = pageResult;
	}

}