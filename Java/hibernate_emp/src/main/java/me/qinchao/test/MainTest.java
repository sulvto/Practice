package me.qinchao.test;

import me.qinchao.service.impl.EmployeeSerivceImpl;
import me.qinchao.service.IDepartmentSerivce;
import org.junit.Test;

import me.qinchao.domain.Department;
import me.qinchao.domain.Employee;
import me.qinchao.service.IEmployeeSerivce;
import me.qinchao.service.impl.DepartmentSerivceImpl;

public class MainTest {
	private IDepartmentSerivce departmentserivce = new DepartmentSerivceImpl();
	private IEmployeeSerivce employeeserivce = new EmployeeSerivceImpl();

	@Test
	public void saveTest() {
		Department dept1 = new Department("部门1");
		Department dept2 = new Department("部门2");
		Department dept3 = new Department("部门3");
		Employee emp1 = new Employee("emp1",dept1);
		Employee emp2 = new Employee("emp2",dept2);
		Employee emp3 = new Employee("emp3",dept3);
		departmentserivce.save(dept1);
		departmentserivce.save(dept2);
		departmentserivce.save(dept3);
		employeeserivce.save(emp1);
		employeeserivce.save(emp2);
		employeeserivce.save(emp3);
	}

}
