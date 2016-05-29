package me.qinchao.service;

import java.util.List;

import me.qinchao.domain.Department;

public interface IDepartmentSerivce {
	void save(Department dept);

	void upload(Department dept);

	void delete(Long id);

	Department get(Long id);

	List<Department> getAll();
}
