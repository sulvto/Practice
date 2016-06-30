package me.qinchao.pss.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.${entityDomain};
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.${entityDomain}Query;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IDepartmentService;
import me.qinchao.pss.service.I${entityDomain}Service;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class ${entityDomain}Action extends CRUDAction<${entityDomain}> {
	private static final long serialVersionUID = 1L;
	private I${entityDomain}Service ${lowerEntityDomain}Service;
	private ${entityDomain} ${lowerEntityDomain} = new ${entityDomain}();
	private PageResult<${entityDomain}> pageResult;
	private BaseQuery baseQuery = new ${entityDomain}Query();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("alldept", departmentService.getAll());
		this.pageResult = ${lowerEntityDomain}Service.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			${lowerEntityDomain}Service.update(${lowerEntityDomain});
		} else {
			${lowerEntityDomain}Service.save(${lowerEntityDomain});
			baseQuery.setCurrentPage(Integer.MAX_VALUE);
		}
		addActionMessage("保存成功");
		return RELOAD;
	}

	@Override
	public String delete() throws Exception {
		logger.debug("delete");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", false);
		if (id != null) {
			try {
				${lowerEntityDomain}Service.delete(id);
				System.out.println("删除成功");
				map.put("success", true);
				map.put("msg", "删除成功");			
			} catch (Exception e) {	
				System.out.println("异常");
				map.put("msg", "异常 " + e.getMessage());
			}
		} else {
			map.put("msg", "没有删除的id");
		}
		putContext("map", map);
		return AJAX_RESULT;
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
			${lowerEntityDomain} = new ${entityDomain}();
		} else {
			${lowerEntityDomain} = ${lowerEntityDomain}Service.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			${lowerEntityDomain} = ${lowerEntityDomain}Service.get(id);
		}
	}

	public ${entityDomain} getModel() {
		return ${lowerEntityDomain};
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public I${entityDomain}Service get${entityDomain}Service() {
		return ${lowerEntityDomain}Service;
	}

	public PageResult<${entityDomain}> getPageResult() {
		return pageResult;
	}


	public void set${entityDomain}Service(I${entityDomain}Service ${lowerEntityDomain}Service) {
		this.${lowerEntityDomain}Service = ${lowerEntityDomain}Service;
	}


	public void setPageResult(PageResult<${entityDomain}> pageResult) {
		this.pageResult = pageResult;
	}

}