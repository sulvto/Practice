package me.qinchao.dao;

import java.util.List;

public interface IEmployeeDAO<Employee> extends IBaseDAO<Employee>{
	void save(Employee emp);

	void update(Employee emp);

	void delete(Long id);

	Employee get(Long id);

	List<Employee> getAll();
	List<Employee> query(int pageNo,int pageSize);
}
