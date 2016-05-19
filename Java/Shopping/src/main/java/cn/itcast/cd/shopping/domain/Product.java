package cn.itcast.cd.shopping.domain;

import java.math.BigDecimal;
import java.util.Date;

//商品对象
public class Product {
	private Long id;// 唯一标识
	private String sn;// 商品编号:缅甸BURMA
	private String name;// 商品名称
	private BigDecimal marketPrice;// 市场价格
	private BigDecimal costPrice;// 成本价格
	private BigDecimal salePrice;// 零售价格
	private String place;// 生产场地
	private String model;// 商品规格:长25.8厘米/宽18.56厘米/高1.25毫米
	private Integer num;// 数量:仅此一件 
	private String intro;// 商品详细信息
	private String bigPic;// 商品大图的路径
	private String smallPic;// 商品小图的路径
	private ProductDir dir;// 商品分类
	private Integer viewTimes = 0;// 浏览次数
	private Boolean recommended = false;// 是否推荐
	private Double cutOff = 1.0;// 折扣
	private Date inputDate = new Date();// 录入时间
	private Integer status = 0;// 商品状态(0:热卖中/1:下架了.....)
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
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

	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getBigPic() {
		return bigPic;
	}
	public void setBigPic(String bigPic) {
		this.bigPic = bigPic;
	}
	public String getSmallPic() {
		return smallPic;
	}
	public void setSmallPic(String smallPic) {
		this.smallPic = smallPic;
	}
	public ProductDir getDir() {
		return dir;
	}
	public void setDir(ProductDir dir) {
		this.dir = dir;
	}
	public Integer getViewTimes() {
		return viewTimes;
	}
	public void setViewTimes(Integer viewTimes) {
		this.viewTimes = viewTimes;
	}
	public Boolean getRecommended() {
		return recommended;
	}
	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}
	public Double getCutOff() {
		return cutOff;
	}
	public void setCutOff(Double cutOff) {
		this.cutOff = cutOff;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sn=" + sn + ", name=" + name
				+ ", marketPrice=" + marketPrice + ", costPrice=" + costPrice
				+ ", salePrice=" + salePrice + ", place=" + place + ", model="
				+ model + ", num=" + num + ", intro=" + intro + ", bigPic="
				+ bigPic + ", smallPic=" + smallPic + ", dir=" + dir
				+ ", viewTimes=" + viewTimes + ", recommended=" + recommended
				+ ", cutOff=" + cutOff + ", inputDate=" + inputDate
				+ ", status=" + status + "]";
	}
}
