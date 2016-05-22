package me.qinchao.shopping.service;

import java.util.List;

import me.qinchao.shopping.domain.Product;
import me.qinchao.shopping.page.PageList;
import me.qinchao.shopping.query.ProductQueryObject;

public interface IProductService {
	void save(Product pro);

	void delete(Long id);

	

	Product get(Long id);

	List<Product> getAll();

	PageList query(ProductQueryObject qo);

	void update(Product pro);

	List<Product> getByNew(Integer num);

	List<Product> getByHot(Integer i);
}
