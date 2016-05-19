package cn.itcast.cd.shopping.service;

import java.util.List;

import cn.itcast.cd.shopping.domain.Product;
import cn.itcast.cd.shopping.page.PageList;
import cn.itcast.cd.shopping.query.ProductQueryObject;

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
