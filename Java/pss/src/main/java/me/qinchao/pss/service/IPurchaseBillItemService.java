package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.PurchaseBillItem;
import me.qinchao.pss.query.PurchaseBillItemQuery;

public interface IPurchaseBillItemService extends
		IBaseService<PurchaseBillItem> {
	List<Object[]> findGroupBy(PurchaseBillItemQuery baseQuery);

	List<PurchaseBillItem> findPurchaseBillItems(
			PurchaseBillItemQuery baseQuery, Object groupByValue);

	List<Object[]> findGroupBy2(PurchaseBillItemQuery baseQuery);
}
