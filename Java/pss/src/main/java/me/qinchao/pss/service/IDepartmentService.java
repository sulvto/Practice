package me.qinchao.pss.service;

import me.qinchao.pss.domain.Department;

public interface IDepartmentService extends IBaseService<Department> {
	Department findByName(String name);
}
