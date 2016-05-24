package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.qinchao.pss.domain.Menu;

public class MenuServiceTest extends BaseServiceTest<Menu> {
	@Autowired
	private IMenuService menuService;

	@Test
	public void test() throws Exception {
		List<Menu> findParentByLogin = menuService.findParentByLogin(1L);
		for (Menu menu : findParentByLogin) {
			System.out.println(menu);
		}
		Employee employee = new Employee();
		employee.setId(2L);
		List<Menu> findChildrenByLogin = menuService.findChildrenByLogin(1L,
				employee);
		for (Menu menu : findChildrenByLogin) {
			System.out.println(menu);
		}
	}
}
