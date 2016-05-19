package cn.itcast.cd.shopping.dao;

import java.util.List;

import cn.itcast.cd.shopping.domain.Product;
import cn.itcast.cd.shopping.page.PageList;
import cn.itcast.cd.shopping.query.IQuery;

public interface IProductDAO {

	void save(Product obj);

	void update(Product newObj);

	void delete(Long id);

	Product get(Long id);

	List<Product> getAll();

	// 高级查询
	// List<Product> query(ProductQueryObject qo);
	// 分页操作
	PageList query(Integer currentPage);

	// 高级查询+分页
	PageList query(IQuery qo);

	List<Product> query(String condition,Object...params);
}
