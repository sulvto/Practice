package me.qinchao.shopping.domain;

import java.math.BigDecimal;

//购物车中的商品对象
public class CartItem {
	private Long id;//唯一标识
	private BigDecimal price;//购买商品当时的价格
	private Integer num;//数量
	private Product pro;
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
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	
}
