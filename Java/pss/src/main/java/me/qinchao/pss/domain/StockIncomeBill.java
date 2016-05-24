package me.qinchao.pss.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//采购单
public class StockIncomeBill {
	private Long id;
	private Date vdate;// 单据发生时间
	private BigDecimal totalAmount; // 总金额
	private BigDecimal totalNum; // 总数量
	private Date inputTime; // 录入时间
	private Date auditorTime; // 审核时间
	/*
	 * 0待审,1已审,-1作废
	 */
	private Integer status; // 状态
	private Employee auditor; // 审核人, 多对一
	private Employee keeper; // 采购员, 多对一
	private Employee inputUser; // 录入人, 多对一
	private Supplier supplier; // 供应商, 多对一
	private List<StockIncomeBillItem> items = new ArrayList<StockIncomeBillItem>(); // 单据明细
	private Depot depot;

	/**
	 * @roseuid 54598F7301A6
	 */
	public StockIncomeBill() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getVdate() {
		return vdate;
	}

	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(BigDecimal totalNum) {
		this.totalNum = totalNum;
	}

	public Date getInputTime() {
		return inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public Date getAuditorTime() {
		return auditorTime;
	}

	public void setAuditorTime(Date auditorTime) {
		this.auditorTime = auditorTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Employee getAuditor() {
		return auditor;
	}

	public void setAuditor(Employee auditor) {
		this.auditor = auditor;
	}

	public Employee getKeeper() {
		return keeper;
	}

	public void setKeeper(Employee keeper) {
		this.keeper = keeper;
	}

	public Depot getDepot() {
		return depot;
	}

	public void setDepot(Depot depot) {
		this.depot = depot;
	}

	public Employee getInputUser() {
		return inputUser;
	}

	public void setInputUser(Employee inputUser) {
		this.inputUser = inputUser;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<StockIncomeBillItem> getItems() {
		return items;
	}

	public void setItems(List<StockIncomeBillItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "PurchaseBill [id=" + id + ", vdate=" + vdate + ", totalAmount="
				+ totalAmount + ", totalNum=" + totalNum + ", inputTime="
				+ inputTime + ", auditorTime=" + auditorTime + ", status="
				+ status + "]";
	}

}
