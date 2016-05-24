package me.qinchao.pss.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.qinchao.pss.domain.Depot;
import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Product;
import me.qinchao.pss.domain.StockIncomeBill;
import me.qinchao.pss.domain.StockIncomeBillItem;
import me.qinchao.pss.domain.Supplier;

public class StockIncomeBillServiceTest extends
		BaseServiceTest<StockIncomeBill> {
	@Autowired
	private IStockIncomeBillService stockIncomeBillService;

	@Test
	public void test() throws Exception {
		// 1个采购订单
		StockIncomeBill stockIncomeBill = new StockIncomeBill();
		stockIncomeBill.setKeeper(new Employee(1L));
		stockIncomeBill.setInputUser(new Employee(2L));
		stockIncomeBill.setAuditor(new Employee(3L));
		stockIncomeBill.setAuditorTime(new Date());
		stockIncomeBill.setInputTime(new Date());
		stockIncomeBill.setVdate(new Date());
		stockIncomeBill.setSupplier(new Supplier(1L));
		// 2个订单明细;
		List<StockIncomeBillItem> items = new ArrayList<StockIncomeBillItem>();
		StockIncomeBillItem item = new StockIncomeBillItem();

		item.setDescs("订单明细1");
		item.setNum(new BigDecimal(10));
		item.setPrice(new BigDecimal(100));
		item.setProduct(new Product(1L));
		items.add(item);

		item = new StockIncomeBillItem();
		item.setDescs("订单明细1");
		item.setNum(new BigDecimal(20));
		item.setPrice(new BigDecimal(200));
		item.setProduct(new Product(2L));
		items.add(item);

		BigDecimal totalAmount = new BigDecimal(0);
		BigDecimal totalNum = new BigDecimal(0);

		for (StockIncomeBillItem billItem : items) {
			billItem.setBill(stockIncomeBill);
			billItem.setAmount(billItem.getPrice().multiply(billItem.getNum()));
			totalAmount = totalAmount.add(billItem.getAmount());
			totalNum = totalAmount.add(billItem.getNum());
		}
		stockIncomeBill.setItems(items);
		stockIncomeBill.setTotalAmount(totalAmount);
		stockIncomeBill.setTotalNum(totalNum);
		stockIncomeBill.setDepot(new Depot());
		stockIncomeBillService.save(stockIncomeBill);

	}

}
