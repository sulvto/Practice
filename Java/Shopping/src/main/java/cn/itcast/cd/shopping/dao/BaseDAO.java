package cn.itcast.cd.shopping.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.cd.shopping.exception.SystemException;
import cn.itcast.cd.shopping.page.PageList;
import cn.itcast.cd.shopping.query.IQuery;
import cn.itcast.cd.shopping.util.JdbcUtil;

//基础的DAO(DAO实现类,拥有的共同代码结构)
@SuppressWarnings("all")
abstract public class BaseDAO {
	private QueryRunner qr = new QueryRunner(JdbcUtil.INSTANCE.getDataSource());

	//DML操作模板
	public int update(String sql, Object... params) {
		try {
			return qr.update(sql, params);
		} catch (Exception e) {
			throw new SystemException("DML操作失败", e);
		}
	}

	//DQL操作模板
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... params) {
		try {
			return qr.query(sql, rsh, params);
		} catch (Exception e) {
			throw new SystemException("DQL操作失败", e);
		}
	}
	/**
	 * 高级查询+分页
	 * @param qo
	 * @param rsh
	 * @return
	 */
	public PageList query(IQuery qo,ResultSetHandler rsh) {
		PageList pList = new PageList();
		pList.setCurrentPage(qo.getCurrentPage());//设置当前页数
		pList.setPageSize(qo.getPageSize());//设置每页多少条
		
		//1:查询结果集
		String sql = qo.getQuery();
		List<Object> newParams = new ArrayList<>();
		newParams.addAll(qo.getParams());
		newParams.add((pList.getCurrentPage()-1)*pList.getPageSize());//第一个?
		newParams.add(pList.getPageSize());
		List listData = this.query(sql, rsh, newParams.toArray());
		pList.setListData(listData);//设置结果集数据
		//===================================================
		//2:查询结果总数
		String countSql  = qo.getCountSQL();
		Long totalCount = this.query(countSql, new ScalarHandler<Long>(), qo.getParams().toArray());
		pList.setTotalCount(totalCount.intValue());//设置符合条件的结果总数
		return pList;
	}
}
