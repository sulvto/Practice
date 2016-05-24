package me.qinchao.pss.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Product;
import me.qinchao.pss.domain.Supplier;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.qinchao.pss.domain.PurchaseBill;
import me.qinchao.pss.domain.PurchaseBillItem;

public class PurchaseBillServiceTest extends BaseServiceTest<PurchaseBill> {
	@Autowired
	private IPurchaseBillService purchaseBillService;

	@Test
	public void testSave() throws Exception {
		// 1个采购订单
		PurchaseBill purchaseBill = new PurchaseBill();
		purchaseBill.setBuyer(new Employee(1L));
		purchaseBill.setInputUser(new Employee(2L));
		purchaseBill.setAuditor(new Employee(3L));
		purchaseBill.setAuditorTime(new Date());
		purchaseBill.setInputTime(new Date());
		purchaseBill.setVdate(new Date());
		purchaseBill.setSupplier(new Supplier(1L));
		// 2个订单明细;
		List<PurchaseBillItem> items = new ArrayList<PurchaseBillItem>();
		PurchaseBillItem item = new PurchaseBillItem();

		item.setDescs("订单明细1");
		item.setNum(new BigDecimal(10));
		item.setPrice(new BigDecimal(100));
		item.setProduct(new Product(1L));
		items.add(item);

		item = new PurchaseBillItem();

		item.setDescs("订单明细1");
		item.setNum(new BigDecimal(20));
		item.setPrice(new BigDecimal(200));
		item.setProduct(new Product(2L));
		items.add(item);

		BigDecimal totalAmount = new BigDecimal(0);
		BigDecimal totalNum = new BigDecimal(0);

		for (PurchaseBillItem billItem : items) {
			billItem.setBill(purchaseBill);
			billItem.setAmount(billItem.getPrice().multiply(billItem.getNum()));
			totalAmount = totalAmount.add(billItem.getAmount());
			totalNum = totalAmount.add(billItem.getNum());
		}

		purchaseBill.setItems(items);
		purchaseBill.setTotalAmount(totalAmount);
		purchaseBill.setTotalNum(totalNum);
		purchaseBillService.save(purchaseBill);

	}

	@Test
	public void testGet() throws Exception {
		PurchaseBill purchaseBill = purchaseBillService.get(4L);
		System.out.println(purchaseBill);
	}
}
