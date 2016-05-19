package cn.itcast.cd.shopping.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//基本的查询对象:多个查询对象的共同代码结构的集合
public class BaseQueryObject implements IQuery {
	private Integer currentPage = 1;//当前页:默认第一页
	
	private Integer pageSize = 5;//每页多少条
	
	private String baseSQL = "SELECT * FROM ";//基础的查询结果集的SQL
	private String countSQL = "SELECT COUNT(*) FROM ";

	private List<String> conditions = new ArrayList<>();//封装查询的条件 name LIKE ? 或则 dir_id = ?
	private List<Object> params = new ArrayList<>();//封装查询条件对应的参数

	public BaseQueryObject(String tableName) {
		baseSQL += tableName;
		countSQL += tableName;
	}

	public String getQuery() {
		StringBuilder sb = new StringBuilder();
		this.customizedQuery();//
		for (int i = 0; i < conditions.size(); i++) {
			if (i == 0) {
				sb.append(" WHERE ");
			} else {
				sb.append(" AND ");
			}
			sb.append(conditions.get(i));
		}
		countSQL = countSQL + sb;//为查询总数的SQL拼接条件
		return baseSQL + sb + " LIMIT ?,?";
	}

	public List<Object> getParams() {
		return this.params;
	}

	/**
	 * 暴露给子类,用于添加查询条件和参数
	 * @param condition
	 * @param param
	 */
	protected void addQuery(String condition, Object... param) {
		this.conditions.add("(" + condition + ")");//装条件
		//this.params.add(param);//装参数
		this.params.addAll(Arrays.asList(param));
	}

	//专门暴露给子类,完成子类自身的定制查询
	protected void customizedQuery() {
		//NOOP
	}

	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}

	//暴露给DAO,获取查询总数的SQL
	public String getCountSQL() {
		return this.countSQL;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
