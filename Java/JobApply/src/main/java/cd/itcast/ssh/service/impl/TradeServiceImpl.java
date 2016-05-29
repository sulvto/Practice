package cd.itcast.ssh.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cd.itcast.ssh.dao.ITradeDAO;
import cd.itcast.ssh.domain.Trade;
import cd.itcast.ssh.service.ITradeService;

@Transactional(propagation = Propagation.REQUIRED)
public class TradeServiceImpl implements ITradeService {
	private ITradeDAO dao;

	public void setDao(ITradeDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveTrade(Trade d) {
		this.dao.save(d);
	}

	@Override
	public void updateTrade(Trade d) {
		this.dao.update(d);
	}

	@Override
	public void deleteTrade(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Trade getTrade(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Trade> listTrades() {
		return this.dao.list();
	}

}
