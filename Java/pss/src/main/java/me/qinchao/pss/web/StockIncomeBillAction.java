package me.qinchao.pss.web;

import java.util.HashMap;
import java.util.Map;

import me.qinchao.pss.domain.StockIncomeBill;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.StockIncomeBillQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IStockIncomeBillService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class StockIncomeBillAction extends CRUDAction<StockIncomeBill> {
	private static final long serialVersionUID = 1L;
	private IStockIncomeBillService stockIncomeBillService;
	private StockIncomeBill stockIncomeBill = new StockIncomeBill();
	private PageResult<StockIncomeBill> pageResult;
	private BaseQuery baseQuery = new StockIncomeBillQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("alldept", departmentService.getAll());
		this.pageResult = stockIncomeBillService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			stockIncomeBillService.update(stockIncomeBill);
		} else {
			stockIncomeBillService.save(stockIncomeBill);
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
				stockIncomeBillService.delete(id);
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
			stockIncomeBill = new StockIncomeBill();
		} else {
			stockIncomeBill = stockIncomeBillService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			stockIncomeBill = stockIncomeBillService.get(id);
		}
	}

	public StockIncomeBill getModel() {
		return stockIncomeBill;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IStockIncomeBillService getStockIncomeBillService() {
		return stockIncomeBillService;
	}

	public PageResult<StockIncomeBill> getPageResult() {
		return pageResult;
	}


	public void setStockIncomeBillService(IStockIncomeBillService stockIncomeBillService) {
		this.stockIncomeBillService = stockIncomeBillService;
	}


	public void setPageResult(PageResult<StockIncomeBill> pageResult) {
		this.pageResult = pageResult;
	}

}