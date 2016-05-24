package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Resource;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.ResourceQuery;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IResourceService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class ResourceAction extends CRUDAction<Resource> {
	private static final long serialVersionUID = 1L;
	private IResourceService resourceService;
	private Resource resource = new Resource();
	private PageResult<Resource> pageResult;
	private BaseQuery baseQuery = new ResourceQuery();

	@Override
	protected void list() {
		logger.debug("List");
		System.out.println("liat");
		// putContext("ids", pageResult.getRows().get(arg0).getAll());
		this.pageResult = resourceService.findPageResult(baseQuery);
		System.out.println(pageResult);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			resourceService.update(resource);
		} else {
			resourceService.save(resource);
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
				resourceService.delete(id);
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
		return INPUT;
	}

	@Override
	public void beforeSave() {

		if (id == null) {
			resource = new Resource();
		} else {
			resource = resourceService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			resource = resourceService.get(id);
		}
	}

	public Resource getModel() {
		return resource;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IResourceService getResourceService() {
		return resourceService;
	}

	public PageResult<Resource> getPageResult() {
		return pageResult;
	}

	public void setResourceService(IResourceService resourceService) {
		this.resourceService = resourceService;
	}

	public void setPageResult(PageResult<Resource> pageResult) {
		this.pageResult = pageResult;
	}

}