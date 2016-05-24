package me.qinchao.pss.query;

import java.util.Date;

public class PurchaseBillItemQuery extends BaseQuery {
	private Date beginDate;
	private Date endDate;
	private Integer status;
	private String groupBy;

	public PurchaseBillItemQuery() {
		super("PurchaseBillItem");
	}

	@Override
	public void addWhere() {
		if (status != null) {
			addWhere(" o.bill.status =?", status);
		}
		if (beginDate != null) {
			addWhere(" o.bill.vdate >=?", beginDate);
		}
		if (endDate != null) {
			addWhere(" o.bill.vdate <=?", endDate);
		}
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PurchaseBillItemQuery [beginDate=" + beginDate + ", endDate="
				+ endDate + ", status=" + status + ", groupBy=" + groupBy + "]";
	}

}
