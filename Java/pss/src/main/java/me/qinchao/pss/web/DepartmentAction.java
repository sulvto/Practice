package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Department;
import me.qinchao.pss.query.BaseQuery;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.query.DepartmentQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IDepartmentService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class DepartmentAction extends CRUDAction<Department> {
	private static final long serialVersionUID = 1L;
	private IDepartmentService departmentService;
	private Department department = new Department();
	private PageResult<Department> pageResult;
	private BaseQuery baseQuery = new DepartmentQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("dept", departmentService.getAll());
		this.pageResult = departmentService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			departmentService.update(department);
		} else {
			departmentService.save(department);
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
				departmentService.delete(id);
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
		// putContext("dept", departmentService.getAll());
		return INPUT;
	}

	@Override
	public void beforeSave() {

		if (id == null) {
			department = new Department();
		} else {
			department = departmentService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			department = departmentService.get(id);
		}
	}

	public Department getModel() {
		return department;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IDepartmentService getDepartmentService() {
		return departmentService;
	}

	public PageResult<Department> getPageResult() {
		return pageResult;
	}

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void setPageResult(PageResult<Department> pageResult) {
		this.pageResult = pageResult;
	}

}