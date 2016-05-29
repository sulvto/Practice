package me.qinchao.dao.impl;

import me.qinchao.dao.IEmployeeDAO;
import me.qinchao.domain.Employee;


public class EmployeeDAOImpl<T> extends BaseDAOImpl<Employee> implements IEmployeeDAO<Employee>{
	public EmployeeDAOImpl() {
		super(Employee.class);
	}
}
