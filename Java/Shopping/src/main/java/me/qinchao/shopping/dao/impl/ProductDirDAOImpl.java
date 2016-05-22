package me.qinchao.shopping.dao.impl;

import java.util.List;

import me.qinchao.shopping.domain.ProductDir;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import me.qinchao.shopping.dao.BaseDAO;
import me.qinchao.shopping.dao.IProductDirDAO;

//贾琏欲执事
public class ProductDirDAOImpl extends BaseDAO implements IProductDirDAO {
	public void save(ProductDir obj) {
		String sql = "INSERT INTO t_productdir (name,englishName,intro) VALUES (?,?,?)";
		Object[] params = { obj.getName(), obj.getEnglishName(), obj.getIntro() };
		super.update(sql, params);
	}

	public void update(ProductDir newObj) {
		String sql = "UPDATE t_productdir SET name=?,englishName = ?,intro = ? WHERE id = ?";
		Object[] params = { newObj.getName(), newObj.getEnglishName(),
				newObj.getIntro(), newObj.getId() };
		super.update(sql, params);
	}

	public void delete(Long id) {
		String sql = "DELETE FROM t_productdir WHERE id = ?";
		super.update(sql, id);
	}

	public ProductDir get(Long id) {
		String sql = "SELECT * FROM t_productdir WHERE id = ?";
		return super.query(sql, new BeanHandler<ProductDir>(ProductDir.class), id);
	}

	public List<ProductDir> getAll() {
		String sql = "SELECT * FROM t_productdir";
		return super.query(sql, new BeanListHandler<ProductDir>(ProductDir.class));
	}

	@Override
	public List<ProductDir> query(String sql, Object... params) {
		return super.query(sql, new BeanListHandler<ProductDir>(ProductDir.class), params);
	}

}
