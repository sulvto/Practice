package cn.itcast.cd.shopping.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//购物车对象
public class ShoppingCart {
//	private Double totalMarketPrice;
//	private Double totalPrice;
	private List<CartItem> items = new ArrayList<>();
	//把指定的商品放入购物车 
	public void save(CartItem newItem) {
		for (CartItem item : items) {
			if(item.getId().equals(newItem.getId())) {
				item.setNum(item.getNum()+newItem.getNum());
				return;
			}
		}
		items.add(newItem);
	}
	//从购物车中移除商品
	public void delete(Long id) {
		for (Iterator<CartItem> it = items.iterator();it.hasNext();){
			CartItem item = it.next();
			if(item.getId().equals(id)) {
				it.remove();
			}
		}
		
	}
	//商品市场售价总额
	public Double getTotalMarketPrice() {
		Double totalPrice = 0.0D;
		for (CartItem item : items) {
			totalPrice += item.getPro().getMarketPrice().doubleValue() * item.getNum();
		}
		return totalPrice;
	}
	
	//计算购物车中商品的总价格
	public Double getTotalPrice() {
		Double totalPrice = 0.0D;
		for (CartItem item : items) {
			totalPrice += item.getPrice().doubleValue() * item.getNum();
		}
		return totalPrice;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	
}
