package me.qinchao.pss.domain;

import java.math.BigDecimal;

//采购单详情
public class PurchaseBillItem {
	private Long id;
	private BigDecimal price;// 价格
	private BigDecimal num; // 数量
	private BigDecimal amount; // 金额
	private String descs; // 备注
	private PurchaseBill bill; // 所属单据
	private Product product; // 产品

	/**
	 * @roseuid 54598F7702D6
	 */
	public PurchaseBillItem() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getNum() {
		return num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public PurchaseBill getBill() {
		return bill;
	}

	public void setBill(PurchaseBill bill) {
		this.bill = bill;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "PurchaseBillItem [id=" + id + ", price=" + price + ", num="
				+ num + ", amount=" + amount + ", descs=" + descs  + "]";
	}

}
