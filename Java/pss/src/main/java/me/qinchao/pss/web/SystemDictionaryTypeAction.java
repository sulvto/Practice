package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.SystemDictionaryType;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.SystemDictionaryTypeQuery;
import me.qinchao.pss.service.ISystemDictionaryTypeService;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class SystemDictionaryTypeAction extends CRUDAction<SystemDictionaryType> {
	private static final long serialVersionUID = 1L;
	private ISystemDictionaryTypeService systemDictionaryTypeService;
	private SystemDictionaryType systemDictionaryType = new SystemDictionaryType();
	private PageResult<SystemDictionaryType> pageResult;
	private BaseQuery baseQuery = new SystemDictionaryTypeQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("dept", departmentService.getAll());
		this.pageResult = systemDictionaryTypeService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			systemDictionaryTypeService.update(systemDictionaryType);
		} else {
			systemDictionaryTypeService.save(systemDictionaryType);
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
				systemDictionaryTypeService.delete(id);
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
			systemDictionaryType = new SystemDictionaryType();
		} else {
			systemDictionaryType = systemDictionaryTypeService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			systemDictionaryType = systemDictionaryTypeService.get(id);
		}
	}

	public SystemDictionaryType getModel() {
		return systemDictionaryType;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public ISystemDictionaryTypeService getSystemDictionaryTypeService() {
		return systemDictionaryTypeService;
	}

	public PageResult<SystemDictionaryType> getPageResult() {
		return pageResult;
	}


	public void setSystemDictionaryTypeService(ISystemDictionaryTypeService systemDictionaryTypeService) {
		this.systemDictionaryTypeService = systemDictionaryTypeService;
	}


	public void setPageResult(PageResult<SystemDictionaryType> pageResult) {
		this.pageResult = pageResult;
	}

}