package me.qinchao.pss.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BaseQuery {
	private StringBuilder hql;
	private StringBuilder countHql;
	private List paramList = new ArrayList();
	private int currentPage = 1;
	private int pageSize = 10;
	private StringBuilder whereHql = new StringBuilder();

	public BaseQuery(String className) {
		hql = new StringBuilder("SELECT o FROM " + className + " o");
		countHql = new StringBuilder("SELECT COUNT(o) FROM " + className + " o");
	}

	protected abstract void addWhere();

	protected void addWhere(String where, Object... objects) {
		if (paramList.size() == 0) {
			hql.append(" WHERE ").append(where);
			countHql.append(" WHERE ").append(where);
			whereHql.append(" WHERE ").append(where);
		} else {
			hql.append(" AND ").append(where);
			countHql.append(" AND ").append(where);
			whereHql.append(" AND ").append(where);
		}
		System.out.println(whereHql.toString());
		paramList.addAll(Arrays.asList(objects));
		// System.out.println("paramList:" + paramList);
	}

	private boolean flag;

	private void bufferWhere() {
		if (!flag) {
			addWhere();
			flag = true;
		}
	}

	public String getWhereHql() {
		bufferWhere();
		return whereHql.toString();
	}
	public String getHql() {
		bufferWhere();
		return hql.toString();
	}

	public void setHql(StringBuilder hql) {
		this.hql = hql;
	}

	public String getCountHql() {
		bufferWhere();
		return countHql.toString();
	}

	public void setCountHql(StringBuilder countHql) {
		this.countHql = countHql;
	}

	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getParamList() {
		bufferWhere();
		return paramList;
	}

	public void setParamList(List paramList) {
		this.paramList = paramList;
	}

}
