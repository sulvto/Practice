package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.Trade;
import me.qinchao.service.ITradeService;

import com.opensymphony.xwork2.ActionSupport;

public class TradeAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Trade trade;
	private Long id;
	private List<Trade> trades;

	private ITradeService tradeService;




	public String list() {
		this.trades = this.tradeService.listTrades();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.trade = this.tradeService.getTrade(id);
		return INPUT;
	}

	public String update() {
		if (this.trade.getId() != null)
			this.tradeService.updateTrade(trade);
		else
			this.tradeService.saveTrade(trade);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.tradeService.deleteTrade(id);
		}
		return SUCCESS;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade Trade) {
		this.trade = Trade;
	}

	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ITradeService getTradeService() {
		return tradeService;
	}

	public void setTradeService(ITradeService tradeService) {
		this.tradeService = tradeService;
	}
}
