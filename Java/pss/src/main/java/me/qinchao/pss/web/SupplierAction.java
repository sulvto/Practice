package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Supplier;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.SupplierQuery;
import me.qinchao.pss.service.ISupplierService;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.query.PageResult;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class SupplierAction extends CRUDAction<Supplier> {
	private static final long serialVersionUID = 1L;
	private ISupplierService supplierService;
	private Supplier supplier = new Supplier();
	private PageResult<Supplier> pageResult;
	private BaseQuery baseQuery = new SupplierQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("dept", departmentService.getAll());
		this.pageResult = supplierService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			supplierService.update(supplier);
		} else {
			supplierService.save(supplier);
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
				supplierService.delete(id);
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
			supplier = new Supplier();
		} else {
			supplier = supplierService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			supplier = supplierService.get(id);
		}
	}

	public Supplier getModel() {
		return supplier;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public ISupplierService getSupplierService() {
		return supplierService;
	}

	public PageResult<Supplier> getPageResult() {
		return pageResult;
	}


	public void setSupplierService(ISupplierService supplierService) {
		this.supplierService = supplierService;
	}


	public void setPageResult(PageResult<Supplier> pageResult) {
		this.pageResult = pageResult;
	}

}