package me.qinchao.pss.query;

import java.util.Date;

public class PurchaseBillQuery extends BaseQuery {
	private Date beginDate;
	private Date endDate;
	private Integer status;

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

	public PurchaseBillQuery() {
		super("PurchaseBill");
	}

	@Override
	public void addWhere() {
		if (status != null && status != -2) {
			addWhere(" o.status =?", status);
		}
		if (beginDate != null) {
			addWhere(" o.vdate >=?", beginDate);
		}
		if (endDate != null) {
			addWhere(" o.vdate <=?", endDate);
		}
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
