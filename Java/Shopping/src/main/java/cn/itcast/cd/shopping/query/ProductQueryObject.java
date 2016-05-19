package cn.itcast.cd.shopping.query;

import java.math.BigDecimal;

//封装了Product的高级查询信息
public class ProductQueryObject extends BaseQueryObject {
	private String name;//商品名称
	private Long dirId;//商品分类编号
	private BigDecimal lowSalePrice;//最低零售价
	private BigDecimal highSalePrice;//最高零售价
	private String keyword;//关键字
	
	public ProductQueryObject() {
		super("t_product");//告诉父类,查询哪一张表
	}
	
	//商品的定制查询
	public void customizedQuery() {
		//商品名称
		if (hasLength(name)) {
			super.addQuery("name LIKE ?", "%" + name + "%");
		}
		//商品分类
		if (dirId != null && dirId != -1) {
			super.addQuery("dir_id = ?", dirId);
		}
		//最低零售价
		if (lowSalePrice != null) {
			super.addQuery("salePrice >= ?", lowSalePrice);
		}
		//最高零售价
		if (highSalePrice != null) {
			super.addQuery("salePrice <= ?", highSalePrice);
		}
		//关键字
		if(hasLength(keyword)){
			super.addQuery("name LIKE ? OR sn LIKE ?", "%"+keyword+"%","%"+keyword+"%");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getDirId() {
		return this.dirId;
	}

	public void setDirId(Long dirId) {
		this.dirId = dirId;
	}

	public BigDecimal getLowSalePrice() {
		return this.lowSalePrice;
	}

	public void setLowSalePrice(BigDecimal lowSalePrice) {
		this.lowSalePrice = lowSalePrice;
	}

	public BigDecimal getHighSalePrice() {
		return this.highSalePrice;
	}

	public void setHighSalePrice(BigDecimal highSalePrice) {
		this.highSalePrice = highSalePrice;
	}

	
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String toString() {
		return "ProductQueryObject [name=" + this.name + ", dirId="
				+ this.dirId + ", lowSalePrice=" + this.lowSalePrice
				+ ", highSalePrice=" + this.highSalePrice + "]";
	}
}
