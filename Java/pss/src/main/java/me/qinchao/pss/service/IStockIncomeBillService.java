package me.qinchao.pss.service;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.StockIncomeBill;

public interface IStockIncomeBillService extends IBaseService<StockIncomeBill> {
	String audit(Long billId, Employee auditor);
}
