package me.qinchao.pss.domain;

import java.math.BigDecimal;

//产品
public class Product {
	private Long id;
	private String name;// 产品名称
	private String color;// 产品颜色
	private String pic;// 产品图片的相对路径
	private BigDecimal costPrice;// 成本价格
	private BigDecimal salePrice;// 销售价格
	private ProductType types;// 对应的产品类型
	private SystemDictionaryDetail unit;// 数据字典明细：单位
	private SystemDictionaryDetail brand;// 数据字典明细：品牌

	/**
	 * @roseuid 54598F77036D
	 */
	public Product() {

	}

	public Product(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public ProductType getTypes() {
		return types;
	}

	public void setTypes(ProductType types) {
		this.types = types;
	}

	public SystemDictionaryDetail getUnit() {
		return unit;
	}

	public void setUnit(SystemDictionaryDetail unit) {
		this.unit = unit;
	}

	public SystemDictionaryDetail getBrand() {
		return brand;
	}

	public void setBrand(SystemDictionaryDetail brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" + color
				+ ", pic=" + pic + ", costPrice=" + costPrice + ", salePrice="
				+ salePrice + "]";
	}

}
