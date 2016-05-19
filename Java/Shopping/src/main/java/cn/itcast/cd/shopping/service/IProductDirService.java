package cn.itcast.cd.shopping.service;

import java.util.List;

import cn.itcast.cd.shopping.domain.ProductDir;

public interface IProductDirService {
	void save(ProductDir obj);
	void update(ProductDir obj);
	void delete(Long id);
	ProductDir get(Long id);
	List<ProductDir> getAll();
	List<ProductDir> getByType(Integer num);
	
}
