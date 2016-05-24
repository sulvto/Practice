package me.qinchao.pss.query;

import org.apache.commons.lang3.StringUtils;

public class DepotQuery extends BaseQuery {
	private String name;

	public DepotQuery() {
		super("Depot");
	}

	@Override
	public void addWhere() {
//		System.out.println("dept " + dept);
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
		return "DepotQuery [name=" + name  + "]";
	}

}
