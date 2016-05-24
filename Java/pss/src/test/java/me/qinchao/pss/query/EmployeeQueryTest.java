package me.qinchao.pss.query;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeQueryTest {
	@Autowired
	private IEmployeeService employeeService;

	@Test
	public void test() {
		EmployeeQuery baseQuery = new EmployeeQuery();
		// baseQuery.setAge1(1);
		// baseQuery.setAge2(25);
		baseQuery.setName("2");
		PageResult<Employee> result = employeeService.findPageResult(baseQuery);
		for (int i = 0; i < result.getRows().size(); i++) {
			System.out.println(result.getRows().get(i));
		}
	}
}
