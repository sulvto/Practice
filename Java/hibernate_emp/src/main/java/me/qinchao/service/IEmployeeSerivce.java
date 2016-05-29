package me.qinchao.service;

import java.util.List;

import me.qinchao.domain.Employee;

public interface IEmployeeSerivce {
	void save(Employee emp);

	void update(Employee emp);

	void delete(Long id);

	Employee get(Long id);

	List<Employee> getAll();

	List<Employee> query(int pageNo, int pageSize);
}
