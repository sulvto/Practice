package me.qinchao.shopping.service.impl;

import java.util.List;

import me.qinchao.shopping.dao.IProductDirDAO;
import me.qinchao.shopping.domain.ProductDir;
import me.qinchao.shopping.factory.BeanFactory;
import me.qinchao.shopping.service.IProductDirService;

public class ProductDirServiceImpl implements IProductDirService {
	//依赖ProductDir的DAO

	private IProductDirDAO dao = BeanFactory.INSTANCE.getBean("productDirDAO",
			IProductDirDAO.class);

	public void save(ProductDir obj) {
		dao.save(obj);
	}

	public void update(ProductDir newObj) {
		dao.update(newObj);
	}

	public void delete(Long id) {
		if (id != null) {
			dao.delete(id);
		}
	}

	public ProductDir get(Long id) {
		return dao.get(id);
	}

	public List<ProductDir> getAll() {
		return dao.getAll();
	}

	@Override
	public List<ProductDir> getByType(Integer num) {
		String sql = "SELECT * FROM t_productDir LIMIT 0,?";
		return dao.query(sql, num);
	}
}