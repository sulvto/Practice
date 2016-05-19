package cn.itcast.cd.shopping.dao;

import java.util.List;

import cn.itcast.cd.shopping.domain.ProductDir;

public interface IProductDirDAO {

	void save(ProductDir obj);

	void update(ProductDir newObj);

	void delete(Long id);

	ProductDir get(Long id);

	List<ProductDir> getAll();
	List<ProductDir> query(String condition,Object...params);
}
