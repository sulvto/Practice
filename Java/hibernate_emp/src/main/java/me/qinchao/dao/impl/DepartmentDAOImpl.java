package me.qinchao.dao.impl;

import me.qinchao.dao.IDepartmentDAO;
import me.qinchao.domain.Department;

public class DepartmentDAOImpl<T> extends BaseDAOImpl<Department> implements IDepartmentDAO<Department> {
	public DepartmentDAOImpl() {
		super(Department.class);
	}

}
