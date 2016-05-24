package me.qinchao.pss.web;

import java.util.HashMap;
import java.util.Map;

import me.qinchao.pss.domain.StockIncomeBillItem;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.StockIncomeBillItemQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IStockIncomeBillItemService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class StockIncomeBillItemAction extends CRUDAction<StockIncomeBillItem> {
	private static final long serialVersionUID = 1L;
	private IStockIncomeBillItemService stockIncomeBillItemService;
	private StockIncomeBillItem stockIncomeBillItem = new StockIncomeBillItem();
	private PageResult<StockIncomeBillItem> pageResult;
	private BaseQuery baseQuery = new StockIncomeBillItemQuery();

	@Override
	protected void list() {
		logger.debug("List");
		// putContext("alldept", departmentService.getAll());
		this.pageResult = stockIncomeBillItemService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			stockIncomeBillItemService.update(stockIncomeBillItem);
		} else {
			stockIncomeBillItemService.save(stockIncomeBillItem);
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
				stockIncomeBillItemService.delete(id);
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
			stockIncomeBillItem = new StockIncomeBillItem();
		} else {
			stockIncomeBillItem = stockIncomeBillItemService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			stockIncomeBillItem = stockIncomeBillItemService.get(id);
		}
	}

	public StockIncomeBillItem getModel() {
		return stockIncomeBillItem;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IStockIncomeBillItemService getStockIncomeBillItemService() {
		return stockIncomeBillItemService;
	}

	public PageResult<StockIncomeBillItem> getPageResult() {
		return pageResult;
	}


	public void setStockIncomeBillItemService(IStockIncomeBillItemService stockIncomeBillItemService) {
		this.stockIncomeBillItemService = stockIncomeBillItemService;
	}


	public void setPageResult(PageResult<StockIncomeBillItem> pageResult) {
		this.pageResult = pageResult;
	}

}