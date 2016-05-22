package me.qinchao.shopping.dao;

import java.util.List;

import me.qinchao.shopping.domain.ProductDir;

public interface IProductDirDAO {

	void save(ProductDir obj);

	void update(ProductDir newObj);

	void delete(Long id);

	ProductDir get(Long id);

	List<ProductDir> getAll();
	List<ProductDir> query(String condition,Object...params);
}
