package me.qinchao.pss.domain;

//产品分类
public class ProductType {
	private Long id;
	private String name;
	private String descs;
	private ProductType parent;

	/**
	 * @roseuid 54598F7703C0
	 */
	public ProductType() {

	}

	public ProductType(Long id, String name) {
		this.id = id;
		this.name = name;
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

	public ProductType getParent() {
		return parent;
	}

	public void setParent(ProductType parent) {
		this.parent = parent;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}
}
