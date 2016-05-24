package me.qinchao.pss.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import me.qinchao.pss.domain.PurchaseBillItem;
import me.qinchao.pss.query.PurchaseBillItemQuery;
import me.qinchao.pss.service.IPurchaseBillItemService;

public class PurchaseBillItemServiceImpl extends
		BaseServiceImpl<PurchaseBillItem> implements IPurchaseBillItemService {

	public List<Object[]> findGroupBy(PurchaseBillItemQuery baseQuery) {
		String groupBy = baseQuery.getGroupBy();
		String where = baseQuery.getWhereHql();
		if (StringUtils.isBlank(groupBy)) {
			throw new RuntimeException("分组条件不能为空");
		}
		if (StringUtils.isBlank(where)) {
			String hql = "SELECT " + groupBy
					+ ",COUNT(o) FROM PurchaseBillItem o  GROUP BY " + groupBy;
			return baseDao.findByHql(hql);
		} else {
			String hql = "SELECT " + groupBy
					+ ",COUNT(o) FROM PurchaseBillItem o " + where
					+ " GROUP BY " + groupBy;
			return baseDao.findByHql(hql, baseQuery.getParamList().toArray());
		}
	}
	public List<Object[]> findGroupBy2(PurchaseBillItemQuery baseQuery) {
		// 对于必须的分组条件做一个控制
		if (StringUtils.isBlank(baseQuery.getGroupBy())) {
			throw new RuntimeException("分组条件不能为空!");
		}
		String groupBy = baseQuery.getGroupBy();
		// 没有额外的查询条件
		if (StringUtils.isBlank(baseQuery.getWhereHql())) {
			String hql = "SELECT " + groupBy
					+ ",SUM(o.amount) FROM PurchaseBillItem o GROUP BY " + groupBy;
			return baseDao.findByHql(hql);
		} else {
			String hql = "SELECT " + groupBy
					+ ",SUM(o.amount) FROM PurchaseBillItem o "
					+ baseQuery.getWhereHql() + " GROUP BY " + groupBy;
			// 把查询条件变成object[]
			return baseDao.findByHql(hql, baseQuery.getParamList().toArray());
		}

	}
	public List<PurchaseBillItem> findPurchaseBillItems(
			PurchaseBillItemQuery baseQuery, Object groupByValue) {
		String groupBy = baseQuery.getGroupBy();
		String where = baseQuery.getWhereHql();
		String hql = new String();
		if (StringUtils.isBlank(where)) {
			hql = "SELECT o FROM PurchaseBillItem o WHERE " + groupBy + "=?";
		} else {
			hql = "SELECT o FROM PurchaseBillItem o " + where + " AND "
					+ groupBy + "=?";
		}
		List paramList = new ArrayList(baseQuery.getParamList());
		paramList.add(groupByValue);
		System.out.println(hql);
		System.out.println(paramList.toString());
		return baseDao.findByHql(hql, paramList.toArray());
	}
}
