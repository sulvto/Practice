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

	private ITradeService service;




	public String list() {
		this.trades = this.service.listTrades();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.trade = this.service.getTrade(id);
		return INPUT;
	}

	public String update() {
		if (this.trade.getId() != null)
			this.service.updateTrade(trade);
		else
			this.service.saveTrade(trade);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.service.deleteTrade(id);
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

	public void setService(ITradeService service) {
		this.service = service;
	}
	
}
