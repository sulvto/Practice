package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.Employee;

public interface IEmployeeService extends IBaseService<Employee> {
	boolean findByName(String name);

	Employee findByLogin(String name, String password);

	Employee findByUid(Long uid);

	List<String> getAllResourceMethods();

	List<String> findResourceMehtodsByLoginUser(Employee employee);

	List<Employee> getBuyers();
}
