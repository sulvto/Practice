package me.qinchao.shopping.domain;

//商品分类对象
public class ProductDir {
	private Long id;// 唯一标识
	private String name;//中文名称
	private String englishName;//英文名称
	private String intro;//商品描述
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
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "ProductDir [id=" + id + ", name=" + name + ", englishName="
				+ englishName + ", intro=" + intro + "]";
	}
	
	
}
