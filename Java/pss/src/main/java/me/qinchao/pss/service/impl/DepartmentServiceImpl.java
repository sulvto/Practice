package me.qinchao.pss.service.impl;

import java.util.List;

import me.qinchao.pss.domain.Department;
import me.qinchao.pss.service.IDepartmentService;

public class DepartmentServiceImpl extends BaseServiceImpl<Department>
		implements IDepartmentService {
	public Department findByName(String name) {
		List<Department> list = baseDao.findByHql(
				"SELECT o FROM Department o WHERE o.name=?", name);
		return list.size() > 0 ? list.get(0) : null;
	}

}
