package me.qinchao.pss.domain;

import java.util.HashSet;
import java.util.Set;

public class Role {
	private Long id;
	private String name;
	private Set<Resource> resources = new HashSet<Resource>();
	private Set<Menu> menus = new HashSet<Menu>();

	public Role() {

	}

	public Role(Long id) {
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

	public Set<Resource> getResources() {
		return resources;
	}

	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "role [id=" + id + ", name=" + name + "]";
	}

}
