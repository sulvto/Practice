package me.qinchao.pss.service;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.qinchao.pss.domain.PurchaseBillItem;
import me.qinchao.pss.query.PurchaseBillItemQuery;

public class PurchaseBillItemServiceTest extends
		BaseServiceTest<PurchaseBillItem> {
	@Autowired
	private IPurchaseBillItemService billItemService;
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	public void test() throws Exception {
		String group = "o.bill.supplier.name";
		// String where = "where o.bill.status=1";
		String where = new String();
		String hql = "SELECT " + group + ",COUNT(o) FROM PurchaseBillItem o "
				+ where + " GROUP BY " + group;
		Query query = sessionFactory.openSession().createQuery(hql);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
			System.out.println(objects[0]);
			if (StringUtils.isBlank(where)) {
				hql = "SELECT o FROM PurchaseBillItem o WHERE " + group + "=?";
			} else {
				System.out.println(where);
				hql = "SELECT o FROM PurchaseBillItem o " + where + " AND "
						+ group + "=?";
			}
			query = sessionFactory.openSession().createQuery(hql);
			query.setParameter(0, objects[0]);
			List<PurchaseBillItem> items = query.list();
			System.out.println(items.size());
			for (PurchaseBillItem purchaseBillItem : items) {
				System.out.println(purchaseBillItem);
			}
		}
	}

	@Test
	public void test2() throws Exception {
		PurchaseBillItemQuery baseQuery = new PurchaseBillItemQuery();
		baseQuery.setGroupBy("o.bill.supplier.name");
//		baseQuery.setStatus(0);
		List<Object[]> list = billItemService.findGroupBy(baseQuery);
		System.out.println("list: "+list.size());
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
			System.out.println("供应商: "+objects[0]);
			List<PurchaseBillItem> items = billItemService
					.findPurchaseBillItems(baseQuery, objects[0]);
			System.out.println(items.size());
			for (PurchaseBillItem purchaseBillItem : items) {
				System.out.println(purchaseBillItem);
			}
		}
	}
}
