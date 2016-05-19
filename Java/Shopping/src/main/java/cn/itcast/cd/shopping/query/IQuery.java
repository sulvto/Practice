package cn.itcast.cd.shopping.query;

import java.util.List;

//定义查询规范,那么所有的查询对象都应该实现该规范
public interface IQuery {
	
	/**
	 * 拼接好的查询结果集的SQL
	 * @return
	 */
	String getQuery();
	
	
	/**
	 * 封装好查询参数的有序集合
	 * @return
	 */
	List<Object> getParams();


	/**
	 * 拼接好的查询结果总数的SQL
	 * @return
	 */
	String getCountSQL();

	/**
	 * 获取当前第几页
	 * @return
	 */
	Integer getCurrentPage();


	Integer getPageSize();
}
