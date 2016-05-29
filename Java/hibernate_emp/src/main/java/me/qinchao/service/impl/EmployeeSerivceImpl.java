package me.qinchao.service.impl;

import java.util.List;

import me.qinchao.dao.IEmployeeDAO;
import me.qinchao.dao.impl.EmployeeDAOImpl;
import me.qinchao.domain.Employee;
import me.qinchao.service.IEmployeeSerivce;
import me.qinchao.util.HibarnateUtil;

public class EmployeeSerivceImpl implements IEmployeeSerivce {
	private IEmployeeDAO<Employee> dao = new EmployeeDAOImpl<Employee>();
	@Override
	public void save(Employee emp) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.save(emp);
		HibarnateUtil.INSTANCE.getSession().getTransaction().commit();
	}

	@Override
	public void update(Employee emp) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.update(emp);
		HibarnateUtil.INSTANCE.getSession().getTransaction().commit();		
	}

	@Override
	public void delete(Long id) {
		HibarnateUtil.INSTANCE.getSession().beginTransaction();
		dao.delete(id);
		HibarnateUtil.INSTANCE.getSession().getTransaction().commit();		
	}

	@Override
	public Employee get(Long id) {
		return dao.get(id);
	}

	@Override
	public List<Employee> getAll() {
		return dao.getAll();
	}

	@Override
	public List<Employee> query(int pageNo, int pageSize) {
		return dao.query(pageNo, pageSize);
	}
}
