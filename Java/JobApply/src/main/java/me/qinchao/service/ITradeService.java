package me.qinchao.service;

import java.io.Serializable;
import java.util.List;

import me.qinchao.domain.Trade;

public interface ITradeService {
	void saveTrade(Trade u);

	void updateTrade(Trade u);

	void deleteTrade(Serializable id);

	Trade getTrade(Serializable id);

	List<Trade> listTrades();
}
