package me.qinchao.shopping.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.qinchao.shopping.domain.ProductDir;
import me.qinchao.shopping.page.PageList;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import me.qinchao.shopping.dao.BaseDAO;
import me.qinchao.shopping.dao.IProductDAO;
import me.qinchao.shopping.dao.IProductDirDAO;
import me.qinchao.shopping.domain.Product;
import me.qinchao.shopping.query.IQuery;

//贾琏欲执事:做一个工具:可以拼SQL
//SQLUtil.save(obj);  内省机制得到该对象的所有的属性(列名):obj.getClass().getSimpleName()-->Product-->t_product
//SQLUtil.delete(Class clz,9527L);
public class ProductDAOImpl extends BaseDAO implements IProductDAO {
	private ResultSetHandler<List> rsh = new ProductResultSetHandler();

	public void save(Product obj) {
		String sql = "INSERT INTO t_product (sn,name,marketPrice,costPrice,salePrice,place,model,num,intro,bigPic,smallPic,viewTimes,cutOff,recommended,inputDate,status,dir_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = { obj.getSn(), obj.getName(), obj.getMarketPrice(),
				obj.getCostPrice(), obj.getSalePrice(), obj.getPlace(),
				obj.getModel(), obj.getNum(), obj.getIntro(), obj.getBigPic(),
				obj.getSmallPic(), obj.getViewTimes(), obj.getCutOff(),
				obj.getRecommended(), obj.getInputDate(), obj.getStatus(),
				obj.getDir().getId() };
		super.update(sql, params);
	}

	public void update(Product newObj) {
		String sql = "UPDATE t_product SET sn=?,name=?,marketPrice=?,costPrice=?,salePrice=?,place=?,model=?,num=?,intro=?,bigPic=?,smallPic=?,viewTimes=?,cutOff=?,recommended=?,inputDate=?,status=?,dir_id=? WHERE id = ?";
		Object[] params = { newObj.getSn(), newObj.getName(),
				newObj.getMarketPrice(), newObj.getCostPrice(),
				newObj.getSalePrice(), newObj.getPlace(), newObj.getModel(),
				newObj.getNum(), newObj.getIntro(), newObj.getBigPic(),
				newObj.getSmallPic(), newObj.getViewTimes(),
				newObj.getCutOff(), newObj.getRecommended(),
				newObj.getInputDate(), newObj.getStatus(),
				newObj.getDir().getId(), newObj.getId() };
		super.update(sql, params);
	}

	public void delete(Long id) {
		String sql = "DELETE FROM t_product WHERE id = ?";
		super.update(sql, id);
	}

	public Product get(Long id) {
		String sql = "SELECT * FROM t_product WHERE id = ?";
		List<Product> list = super.query(sql, rsh, id);
		return list.size() == 1 ? list.get(0) : null;
	}

	public List<Product> getAll() {
		String sql = "SELECT * FROM t_product";
		return super.query(sql, rsh);
	}

	//商品的结果集处理器:处理关联关系
	class ProductResultSetHandler implements ResultSetHandler<List> {
		private IProductDirDAO dirDAO = new ProductDirDAOImpl();
		//相同商品分类缓存
		private Map<Long, ProductDir> cache = new HashMap();

		public List<Product> handle(ResultSet rs) throws SQLException {
			List<Product> list = new ArrayList();
			while (rs.next()) {
				Product pro = new Product();
				list.add(pro);
				pro.setId(rs.getLong("id"));
				pro.setSn(rs.getString("sn"));
				pro.setName(rs.getString("name"));
				pro.setMarketPrice(rs.getBigDecimal("marketPrice"));
				pro.setCostPrice(rs.getBigDecimal("costPrice"));
				pro.setSalePrice(rs.getBigDecimal("salePrice"));
				pro.setPlace(rs.getString("place"));
				pro.setModel(rs.getString("model"));
				pro.setNum(rs.getInt("num"));
				pro.setIntro(rs.getString("intro"));
				pro.setBigPic(rs.getString("bigPic"));
				pro.setSmallPic(rs.getString("smallPic"));
				pro.setViewTimes(rs.getInt("viewTimes"));
				pro.setCutOff(rs.getDouble("cutOff"));
				pro.setRecommended(rs.getBoolean("recommended"));
				pro.setInputDate(rs.getDate("inputDate"));
				pro.setStatus(rs.getInt("status"));

				Long dirId = rs.getLong("dir_id");
				if (dirId != null) {
					ProductDir dir = cache.get(dirId);
					if (dir == null) {
						dir = dirDAO.get(dirId);
						cache.put(dirId, dir);
					}
					pro.setDir(dir);
				}
			}
			return list;
		}
	}

	//===================高级查询============================================
//	public List<Product> query(ProductQueryObject qo) {
//		String sql = qo.getQuery();
//		System.out.println("SQL   =" + sql);
//		System.out.println("params=" + qo.getParams());
//		return super.query(sql, rsh, qo.getParams().toArray());
//	}

	//===================分页操作============================================
	public PageList query(Integer currentPage) {
		PageList pList = new PageList();
		pList.setCurrentPage(currentPage);
		//1:查询结果集
		String sql = "SELECT * FROM t_product LIMIT ?,?";
		Object[] params = {(pList.getCurrentPage()-1)*pList.getPageSize(),pList.getPageSize()};
		List<Product> listData = super.query(sql, rsh, params);
		pList.setListData(listData);
		//===================================================
		//2:查询结果总数
		String countSql = "SELECT COUNT(*) FROM t_product";
		Long totalCount = super.query(countSql, new ScalarHandler<Long>());
		pList.setTotalCount(totalCount.intValue());
		return pList;
	}

	//===================高级查询+分页操作============================================
	public PageList query(IQuery qo) {
		return super.query(qo,rsh);
	}

	@Override
	public List<Product> query(String condition, Object... params) {
		
		return super.query(condition, rsh, params);
	}
	
}
