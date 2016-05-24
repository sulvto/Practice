package me.qinchao.pss.service.impl;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Menu;
import me.qinchao.pss.service.IMenuService;

public class MenuServiceImpl extends BaseServiceImpl<Menu> implements
		IMenuService {
	public List<Menu> findParentByLogin(Long parentId) {

		String hql = "SELECT DISTINCT m FROM Employee e JOIN e.roles r JOIN r.menus m WHERE e.id=? AND m.parent IS NULL";
		return baseDao.findByHql(hql, parentId);
	}

	public List<Menu> findChildrenByLogin(Long parentId, Employee employee) {
		String hql = "SELECT DISTINCT m FROM Employee e JOIN e.roles r JOIN r.menus m WHERE m.parent.id=? AND e=?";
		return baseDao.findByHql(hql, parentId, employee);
	}
}
