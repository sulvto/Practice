package me.qinchao.pss.web;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.PurchaseBillItem;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.PurchaseBillItemQuery;
import me.qinchao.pss.service.IPurchaseBillItemService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class PurchaseBillItemAction extends CRUDAction<PurchaseBillItem> {
	private static final long serialVersionUID = 1L;
	private IPurchaseBillItemService purchaseBillItemService;
	private PurchaseBillItem purchaseBillItem = new PurchaseBillItem();
	private PageResult<PurchaseBillItem> pageResult;
	private PurchaseBillItemQuery baseQuery = new PurchaseBillItemQuery();

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String query() throws Exception {
		logger.debug("query");
		// o.bill.buyer.name
		// o.bill.supplier.name
		if (baseQuery.getStatus() == -2) {
			baseQuery.setStatus(null);
		}

		System.out.println(baseQuery.getGroupBy());
		List<Object[]> list = purchaseBillItemService.findGroupBy(baseQuery);
		putContext("list", list);
		System.out.println("list " + list.size());
		return SUCCESS;
	}

	// 处理FusionCharts报表
	// 1.显示一个页面
	public String chart1() throws Exception {
		return "chart1";
	}

	// 2.由上面的页面发出一个请求，返回json数据
	public String chart2() throws Exception {
		Map<String, Object> rootMap = new HashMap<String, Object>();

		Map<String, String> chart = new HashMap<String, String>();
		chart.put("caption", "采购报表");
		chart.put("xaxisname", "分组");
		chart.put("yaxisname", "采购合计");
		chart.put("numberprefix", "$");
		rootMap.put("chart", chart);

		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		List<Object[]> list = purchaseBillItemService.findGroupBy2(baseQuery);
		for (Object[] objects : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("label", objects[0].toString());
			map.put("value", objects[1].toString());
			data.add(map);
		}
		rootMap.put("data", data);

		putJson(rootMap);
		return AJAX_RESULT;
	}

	@Override
	public void list() {
		logger.debug("List");
		System.out.println("PurchaseBillItemList");
		this.pageResult = purchaseBillItemService.findPageResult(baseQuery);
	}

	public List<PurchaseBillItem> findPurchaseBillItem(Object object) {
		logger.debug("findPurchaseBillItem--><");
		return purchaseBillItemService.findPurchaseBillItems(baseQuery, object);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");

		if (id != null) {
			purchaseBillItemService.update(purchaseBillItem);
		} else {
			purchaseBillItemService.save(purchaseBillItem);
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
				purchaseBillItemService.delete(id);
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
			purchaseBillItem = new PurchaseBillItem();
		} else {
			purchaseBillItem = purchaseBillItemService.get(id);
		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			purchaseBillItem = purchaseBillItemService.get(id);
		}
	}

	public PurchaseBillItem getModel() {
		return purchaseBillItem;
	}

	public PurchaseBillItemQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(PurchaseBillItemQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IPurchaseBillItemService getPurchaseBillItemService() {
		return purchaseBillItemService;
	}

	public PageResult<PurchaseBillItem> getPageResult() {
		return pageResult;
	}

	public void setPurchaseBillItemService(
			IPurchaseBillItemService purchaseBillItemService) {
		this.purchaseBillItemService = purchaseBillItemService;
	}

	public void setPageResult(PageResult<PurchaseBillItem> pageResult) {
		this.pageResult = pageResult;
	}
}