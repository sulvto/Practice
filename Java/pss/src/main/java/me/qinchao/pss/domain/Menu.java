package me.qinchao.pss.domain;

//菜单
public class Menu {
	private Long id;
	private String name;
	private String icon;
	private String url;
	private Menu parent;

	// 额外添加输出属性
	public boolean getIsParent() {
		return parent == null;
	}

	public String getTarget() {
		return getIsParent() ? null : "main";
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", icon=" + icon
				+ ", url=" + url + "]";
	}

}
