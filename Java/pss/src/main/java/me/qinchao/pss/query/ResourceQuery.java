package me.qinchao.pss.query;

import org.apache.commons.lang3.StringUtils;

public class ResourceQuery extends BaseQuery {
	private String name;

	public ResourceQuery() {
		super("Resource");
	}

	@Override
	public void addWhere() {
		if (StringUtils.isNotBlank(name)) {
			addWhere(" o.name like ? ", "%" + name + "%");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ResourceQuery [name=" + name  + "]";
	}

}
