package me.qinchao.pss.web;

import java.util.HashMap;
import java.util.Map;

import me.qinchao.pss.domain.Depot;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.DepotQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IDepotService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class DepotAction extends CRUDAction<Depot> {
	private static final long serialVersionUID = 1L;
	private IDepotService depotService;
	private Depot depot = new Depot();
	private PageResult<Depot> pageResult;
	private BaseQuery baseQuery = new DepotQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("alldept", departmentService.getAll());
		this.pageResult = depotService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			depotService.update(depot);
		} else {
			depotService.save(depot);
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
				depotService.delete(id);
				logger.debug("删除成功");
				map.put("success", true);
				map.put("msg", "删除成功");			
			} catch (Exception e) {
				logger.debug("异常");
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
			depot = new Depot();
		} else {
			depot = depotService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			depot = depotService.get(id);
		}
	}

	public Depot getModel() {
		return depot;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IDepotService getDepotService() {
		return depotService;
	}

	public PageResult<Depot> getPageResult() {
		return pageResult;
	}


	public void setDepotService(IDepotService depotService) {
		this.depotService = depotService;
	}


	public void setPageResult(PageResult<Depot> pageResult) {
		this.pageResult = pageResult;
	}

}