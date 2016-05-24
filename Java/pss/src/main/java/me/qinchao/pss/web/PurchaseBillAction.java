package me.qinchao.pss.web;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.PurchaseBillQuery;
import me.qinchao.pss.service.IEmployeeService;
import me.qinchao.pss.service.IPurchaseBillService;
import me.qinchao.pss.service.ISupplierService;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.PurchaseBill;
import me.qinchao.pss.domain.PurchaseBillItem;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class PurchaseBillAction extends CRUDAction<PurchaseBill> {
	private static final long serialVersionUID = 1L;
	private IPurchaseBillService purchaseBillService;
	private ISupplierService supplierService;
	private IEmployeeService employeeService;
	private PurchaseBill purchaseBill = new PurchaseBill();
	private PageResult<PurchaseBill> pageResult;
	private BaseQuery baseQuery = new PurchaseBillQuery();

	@Override
	protected void list() {
		logger.debug("List");
		System.out.println("asdasdasdasddasddasddad");
//		putContext("allStatus", purchaseBillService.getAll());
		this.pageResult = purchaseBillService.findPageResult(baseQuery);
	}

	@Override
	@InputConfig(methodName = "input")
	public String save() throws Exception {
		logger.debug("save");
		Employee employee = (Employee) ServletActionContext.getRequest()
				.getSession().getAttribute(LOGIN_USER);

		BigDecimal totalAmount = new BigDecimal(0);
		BigDecimal totalNum = new BigDecimal(0);
		for (PurchaseBillItem billItem : purchaseBill.getItems()) {
			billItem.setBill(purchaseBill);
			billItem.setAmount(billItem.getPrice().multiply(billItem.getNum()));
			totalAmount = totalAmount.add(billItem.getAmount());
			totalNum = totalAmount.add(billItem.getNum());
		}

		purchaseBill.setTotalAmount(totalAmount);
		purchaseBill.setTotalNum(totalNum);
		if (id != null) {
			purchaseBillService.update(purchaseBill);
		} else {
			purchaseBill.setInputTime(new Date());
			purchaseBill.setInputUser(employee);
			purchaseBillService.save(purchaseBill);
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
				purchaseBillService.delete(id);
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
		// 供应商列表
		putContext("allSuppliers", supplierService.getAll());
		// /采购员列表
		putContext("allBuyers", employeeService.getBuyers());
		return INPUT;
	}

	@Override
	public void beforeSave() {

		if (id == null) {
			purchaseBill = new PurchaseBill();
		} else {
			purchaseBill = purchaseBillService.get(id);
			purchaseBill.setSupplier(null);
			purchaseBill.setBuyer(null);
			//映射文件的cascade="dll-delete-orphan"
			purchaseBill.getItems().clear();

		}
	}

	@Override
	public void beforeInput() {
		if (id != null) {
			purchaseBill = purchaseBillService.get(id);
		}else {
			purchaseBill = new PurchaseBill();
			purchaseBill.setVdate(new Date());
		}
	}

	public PurchaseBill getModel() {
		return purchaseBill;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

	public IPurchaseBillService getPurchaseBillService() {
		return purchaseBillService;
	}

	public PageResult<PurchaseBill> getPageResult() {
		return pageResult;
	}

	public void setPurchaseBillService(IPurchaseBillService purchaseBillService) {
		this.purchaseBillService = purchaseBillService;
	}

	public void setPageResult(PageResult<PurchaseBill> pageResult) {
		this.pageResult = pageResult;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setSupplierService(ISupplierService supplierService) {
		this.supplierService = supplierService;
	}

}