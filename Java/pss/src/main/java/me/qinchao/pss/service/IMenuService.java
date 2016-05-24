package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Menu;

public interface IMenuService extends IBaseService<Menu> {
	List<Menu> findParentByLogin(Long parentId);

	List<Menu> findChildrenByLogin(Long parentId, Employee employee);
}
