package me.qinchao.pss.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import me.qinchao.pss.domain.Depot;
import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Product;
import me.qinchao.pss.domain.ProductStock;
import me.qinchao.pss.domain.StockIncomeBill;
import me.qinchao.pss.domain.StockIncomeBillItem;
import me.qinchao.pss.service.IDepotService;
import me.qinchao.pss.service.IProductStockService;
import me.qinchao.pss.service.IStockIncomeBillService;

public class StockIncomeBillServiceImpl extends
		BaseServiceImpl<StockIncomeBill> implements IStockIncomeBillService {
	private IProductStockService productStockService;
	private IDepotService depotService;

	// 写代码思路:
	// 1.先判断billId能否获取对象
	// 2.判断状态能否被审核
	// 3.修改状态，审核人，审核时间
	// 4.修改即时库存productstock(在同一个仓库里面的产品是唯一)
	// 5.修改仓库
	public String audit(Long billId, Employee auditor) {
		StockIncomeBill bill = get(billId);
		// 1.先判断billId能否获取对象
		if (bill == null) {
			throw new RuntimeException("billId==null");
		}
		System.out.println("StockIncomeBillServiceImpl_audit: " + bill);
		// 2.判断状态能否被审核
		// 0待审,1已审,-1作废
		if (bill.getStatus() == 1) {
			return "已审";
		} else if (bill.getStatus() == -1) {
			return "作废";
		}
		// 3.修改状态，审核人，审核时间
		bill.setStatus(1);
		bill.setAuditor(auditor);
		bill.setAuditorTime(new Date());
		update(bill);

		// 4.修改即时库存productstock(在同一个仓库里面的产品是唯一)
		Depot depot = bill.getDepot();
		List<StockIncomeBillItem> items = bill.getItems();
		String hql = "select o from ProductStock o where o.depot=? and o.product=?";
		for (StockIncomeBillItem item : items) {
			Product product = item.getProduct();
			List<ProductStock> list = baseDao.findByHql(hql, depot, product);
			if (list.size() == 0) {// 添加
				ProductStock productStock = new ProductStock();
				productStock.setAmount(item.getAmount());
				productStock.setNum(item.getNum());
				productStock.setPrice(item.getPrice());
				// 入库
				productStock.setDepot(depot);
				productStock.setProduct(product);
				productStockService.save(productStock);
			} else if (list.size() == 1) {// 修改
				ProductStock productStock = list.get(0);
				BigDecimal totalAmount = productStock.getAmount().add(
						item.getAmount());
				BigDecimal totalNum = productStock.getNum().add(item.getNum());
				productStock.setAmount(totalAmount);
				productStock.setNum(totalNum);
				BigDecimal price = totalAmount.divide(totalNum, 2,
						BigDecimal.ROUND_HALF_EVEN);
				productStock.setPrice(price);
				productStockService.update(productStock);
			} else {
				throw new RuntimeException("在同一个仓库里面的产品不是唯一");
			}
			// private BigDecimal maxCapacity;// 最大容量 参考值
			// private BigDecimal capcity;// 当前容量 参考值
			// private BigDecimal totlaAmount;// 仓库总金额
			depot.setCapcity(depot.getCapcity().add(bill.getTotalNum()));
			depot.setTotlaAmount(depot.getTotlaAmount().add(
					bill.getTotalAmount()));
			depotService.update(depot);
		}
		return "成功";
	}
}