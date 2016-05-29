package me.qinchao.dao;

import java.util.List;

public interface IDepartmentDAO<Department> extends IBaseDAO<Department>{
	void save(Department dept);

	void update(Department dept);

	void delete(Long id);

	Department get(Long id);

	List<Department> getAll();
}
