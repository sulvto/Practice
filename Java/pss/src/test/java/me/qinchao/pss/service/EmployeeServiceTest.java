package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceTest extends BaseServiceTest<Employee> {
	@Autowired
	private IEmployeeService employeeService;

	@Test
	public void save() {
		Employee t = new Employee("name", "name");
		employeeService.save(t);
	}

	@Test
	public void byName() throws Exception {
		System.out.println(employeeService.findByName("admin"));
	}

	@Test
	public void byLogin() throws Exception {
		System.out.println(employeeService.findByLogin("", ""));
		System.out.println(employeeService.findByLogin(null, null));
		System.out.println(employeeService.findByLogin("admin", "admin"));
	}

	@Test
	public void by() throws Exception {
		List<String> methods = employeeService.getAllResourceMethods();
		for (String string : methods) {
			System.out.println(string);
		}
		Employee employee = new Employee();
		employee.setId(2L);
		List<String> resourceMehtods = employeeService
				.findResourceMehtodsByLoginUser(employee);
		for (String string : resourceMehtods) {
			System.out.println(string);
		}
	}
}
