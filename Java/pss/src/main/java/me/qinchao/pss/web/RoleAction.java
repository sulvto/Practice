package me.qinchao.pss.web;

import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Resource;
import me.qinchao.pss.domain.Role;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.RoleQuery;
import me.qinchao.pss.service.IResourceService;
import me.qinchao.pss.service.IRoleService;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class RoleAction extends CRUDAction<Role> {
	private static final long serialVersionUID = 1L;
	private IRoleService roleService;
	private IResourceService resourceService;
	private Role role = new Role();
	private PageResult<Role> pageResult;
	private BaseQuery baseQuery = new RoleQuery();
	private Long[] ids;

	@Override
	protected void list() {
		logger.debug("List");
		putContext("allResources", resourceService.getAll());
		this.pageResult = roleService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");
		for (Long id : ids) {
			Resource resource = new Resource(id);
			System.out.println("resource: "+resource);
			role.getResources().add(resource);
		}
		if (id != null) {
			roleService.update(role);
		} else {
			roleService.save(role);
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
				roleService.delete(id);
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
		putContext("allResources", resourceService.getAll());
		return INPUT;
	}

	@Override
	public void beforeSave() {

		if (id == null) {
			role = new Role();
		} else {
			role = roleService.get(id);// 持久状态
			role.getResources().clear();
		}
	}

	@Override
	public void beforeInput() {
		System.out.println(id);
		if (id != null) {
			role = roleService.get(id);
			Set<Resource> resources = role.getResources();
			ids = new Long[resources.size()];
			int index = 0;
			for (Resource resource : resources) {
				ids[index++] = resource.getId();
			}
			System.out.println(ids);
		}
	}

	public Role getModel() {
		return role;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IRoleService getRoleService() {
		return roleService;
	}

	public PageResult<Role> getPageResult() {
		return pageResult;
	}

	public void setResourceService(IResourceService resourceService) {
		this.resourceService = resourceService;
	}

	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}

	public void setPageResult(PageResult<Role> pageResult) {
		this.pageResult = pageResult;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

}