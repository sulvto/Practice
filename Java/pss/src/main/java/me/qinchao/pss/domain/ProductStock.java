package me.qinchao.pss.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 即时库存：账目库存，盘点的时候对比 业务要求：同一个仓库里面的产品是唯一的
 * 
 */
public class ProductStock {
	private Long id;
	/**
	 * 实际库存数量,表示仓库经理已审核后的数量
	 */
	private BigDecimal num;
	private BigDecimal storeNum = new BigDecimal(0);
	/**
	 * 成本平均价格,或者实际价格,该价格需要根据某一种算法来得到:加权平均法
	 */
	// 产品1 2月份 入库100件 ，价格 200
	// 产品1 5月份 入库200件 ，价格 300
	// 实际库存数量storeNum=300
	// 成本平均价格price=80000/(100+200)=266.67
	// 库存金额amount=100*200+200*300=80000
	private BigDecimal price;
	/**
	 * 库存金额
	 */
	private BigDecimal amount = new BigDecimal(0);
	private Date incomeDate = new Date();// 最近入库时间
	private Date outcomeDate;// 出库时间
	private Boolean warning = true;// 预警,自动计算:高于最高库存数topNum或者低于最低库存数，发出预警
	private BigDecimal topNum = new BigDecimal(10000);// 最高数
	private BigDecimal bottomNum = new BigDecimal(50);// 最低数
	// 同一个仓库里面的产品是唯一的
	private Depot depot;// 仓库
	private Product product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getNum() {
		return num;
	}

	public BigDecimal getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(BigDecimal storeNum) {
		this.storeNum = storeNum;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getIncomeDate() {
		return incomeDate;
	}

	public void setIncomeDate(Date incomeDate) {
		this.incomeDate = incomeDate;
	}

	public Date getOutcomeDate() {
		return outcomeDate;
	}

	public void setOutcomeDate(Date outcomeDate) {
		this.outcomeDate = outcomeDate;
	}

	public Boolean getWarning() {
		return warning;
	}

	public void setWarning(Boolean warning) {
		this.warning = warning;
	}

	public BigDecimal getTopNum() {
		return topNum;
	}

	public void setTopNum(BigDecimal topNum) {
		this.topNum = topNum;
	}

	public BigDecimal getBottomNum() {
		return bottomNum;
	}

	public void setBottomNum(BigDecimal bottomNum) {
		this.bottomNum = bottomNum;
	}

	public Depot getDepot() {
		return depot;
	}

	public void setDepot(Depot depot) {
		this.depot = depot;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}