package cn.itcast.cd.shopping.service.impl;

import java.util.List;

import cn.itcast.cd.shopping.dao.IProductDAO;
import cn.itcast.cd.shopping.dao.impl.ProductDAOImpl;
import cn.itcast.cd.shopping.domain.Product;
import cn.itcast.cd.shopping.page.PageList;
import cn.itcast.cd.shopping.query.ProductQueryObject;
import cn.itcast.cd.shopping.service.IProductService;

public class ProductServiceImpl implements IProductService {
	private IProductDAO dao = new ProductDAOImpl();

	@Override
	public void save(Product pro) {
		dao.save(pro);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public void update(Product pro) {
		dao.update(pro);
	}

	@Override
	public Product get(Long id) {
		return dao.get(id);
	}

	@Override
	public List<Product> getAll() {
		return dao.getAll();
	}

	@Override
	public PageList query(ProductQueryObject qo) {
		return dao.query(qo);
	}
	@Override
	public List<Product> getByNew(Integer num) {
		String sql = "SELECT * FROM t_product ORDER BY inputDate DESC LIMIT 0,?;";
		return dao.query(sql, num);
	}

	@Override
	public List<Product> getByHot(Integer num) {
		String sql = "SELECT * FROM t_product ORDER BY viewTimes DESC LIMIT 0,?;";
		return dao.query(sql, num);
	}
}