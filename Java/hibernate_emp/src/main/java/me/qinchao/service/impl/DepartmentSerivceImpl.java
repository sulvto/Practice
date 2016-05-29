package me.qinchao.service.impl;

import java.util.List;

import me.qinchao.dao.IDepartmentDAO;
import me.qinchao.dao.impl.DepartmentDAOImpl;
import me.qinchao.domain.Department;
import me.qinchao.service.IDepartmentSerivce;
import me.qinchao.util.HibarnateUtil;

public class DepartmentSerivceImpl implements IDepartmentSerivce {
	private IDepartmentDAO<Department> dao = new DepartmentDAOImpl<Department>();

	@Override
	public void save(Department dept) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.save(dept);
		HibarnateUtil.INSTANCE.getSession().beginTransaction().commit();
	}

	@Override
	public void upload(Department dept) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.update(dept);
		HibarnateUtil.INSTANCE.getSession().beginTransaction().commit();
	}

	@Override
	public void delete(Long id) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.delete(id);
		HibarnateUtil.INSTANCE.getSession().beginTransaction().commit();
	}

	@Override
	public Department get(Long id) {
		return dao.get(id);
	}

	@Override
	public List<Department> getAll() {
		return dao.getAll();
	}

}
