package me.qinchao.pss.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//采购单
public class PurchaseBill {
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
	private Employee buyer; // 采购员, 多对一
	private Employee inputUser; // 录入人, 多对一
	private Supplier supplier; // 供应商, 多对一
	private List<PurchaseBillItem> items = new ArrayList<PurchaseBillItem>(); // 单据明细

	/**
	 * @roseuid 54598F7301A6
	 */
	public PurchaseBill() {

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

	public Employee getBuyer() {
		return buyer;
	}

	public void setBuyer(Employee buyer) {
		this.buyer = buyer;
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

	public List<PurchaseBillItem> getItems() {
		return items;
	}

	public void setItems(List<PurchaseBillItem> items) {
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
