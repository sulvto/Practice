package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.SystemDictionaryDetailQuery;
import me.qinchao.pss.service.ISystemDictionaryDetailService;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.SystemDictionaryDetail;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class SystemDictionaryDetailAction extends CRUDAction<SystemDictionaryDetail> {
	private static final long serialVersionUID = 1L;
	private ISystemDictionaryDetailService systemDictionaryDetailService;
	private SystemDictionaryDetail systemDictionaryDetail = new SystemDictionaryDetail();
	private PageResult<SystemDictionaryDetail> pageResult;
	private BaseQuery baseQuery = new SystemDictionaryDetailQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("dept", departmentService.getAll());
		this.pageResult = systemDictionaryDetailService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			systemDictionaryDetailService.update(systemDictionaryDetail);
		} else {
			systemDictionaryDetailService.save(systemDictionaryDetail);
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
				systemDictionaryDetailService.delete(id);
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
			systemDictionaryDetail = new SystemDictionaryDetail();
		} else {
			systemDictionaryDetail = systemDictionaryDetailService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			systemDictionaryDetail = systemDictionaryDetailService.get(id);
		}
	}

	public SystemDictionaryDetail getModel() {
		return systemDictionaryDetail;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public ISystemDictionaryDetailService getSystemDictionaryDetailService() {
		return systemDictionaryDetailService;
	}

	public PageResult<SystemDictionaryDetail> getPageResult() {
		return pageResult;
	}


	public void setSystemDictionaryDetailService(ISystemDictionaryDetailService systemDictionaryDetailService) {
		this.systemDictionaryDetailService = systemDictionaryDetailService;
	}


	public void setPageResult(PageResult<SystemDictionaryDetail> pageResult) {
		this.pageResult = pageResult;
	}

}