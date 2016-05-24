package me.qinchao.pss.query;

import org.apache.commons.lang3.StringUtils;

public class EmployeeQuery extends BaseQuery {
	private String name;
	private Integer age1;
	private Integer age2;
	private Long dept;

	public EmployeeQuery() {
		super("Employee");
	}

	@Override
	public void addWhere() {
		// System.out.println("dept " + dept);
		if (StringUtils.isNotBlank(name)) {
			addWhere(" o.name like ? ", "%" + name + "%");
		}
		if (age2 != null) {
			addWhere(" o.age<=?", age2);
		}
		if (age1 != null) {
			addWhere(" o.age>=?", age1);
		}
		if (dept != null && dept != -1L) {
			addWhere("o.department.id=?", dept);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge1() {
		return age1;
	}

	public void setAge1(Integer age1) {
		this.age1 = age1;
	}

	public Integer getAge2() {
		return age2;
	}

	public void setAge2(Integer age2) {
		this.age2 = age2;
	}

	public Long getDept() {
		return dept;
	}

	public void setDept(Long dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeQuery [name=" + name + ", age1=" + age1 + ", age2="
				+ age2 + ", department=" + dept + "]";
	}

}
