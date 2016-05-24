package me.qinchao.pss.service.impl;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.service.IEmployeeService;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements
		IEmployeeService {
	public boolean findByName(String name) {
		List<Long> list = baseDao.findByHql(
				"SELECT COUNT(o) FROM Employee o WHERE o.name=?", name);
		return list.get(0).intValue() > 0;
	}

	public Employee findByLogin(String name, String password) {
		List<Employee> list = baseDao.findByHql(
				"SELECT o FROM Employee o WHERE o.name=? AND o.password=?",
				name, password);
		return list.size() > 0 ? list.get(0) : null;
	}

	public List<String> getAllResourceMethods() {
		return baseDao.findByHql("SELECT o.method FROM Resource o ");
	}

	public List<String> findResourceMehtodsByLoginUser(Employee employee) {
		return baseDao.findByHql("SELECT DISTINCT res.method FROM Employee e "
				+ "JOIN e.roles r JOIN r.resources res WHERE e=? ", employee);
	}

	public List<Employee> getBuyers() {
		return baseDao.findByHql(
				"SELECT o FROM Employee o WHERE o.department.name=? ", "采购部");
	}
}
