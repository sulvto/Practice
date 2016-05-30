package me.qinchao.util;

import java.util.ArrayList;
import java.util.List;

public class PageList {
	private List listData = new ArrayList();// 数据
	private Integer totalCount = 0;// 总记录数
	private Integer pageSize = 2;// 每页多少条数据
	private Integer currentPage = 1;// 当前页
	private Integer beginPage = 1;// 首页

	// 总页数
	public Integer getTotalPage() {
		return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
	}

	/*
	 * 上一页
	 */
	public Integer getPrePage() {
		return Math.max(currentPage - 1, beginPage);
	}

	/*
	 * 下一页
	 */
	public Integer getNextPage() {
		return Math.min(currentPage + 1, getTotalPage());
	}

	public List getListData() {
		return listData;
	}

	public void setListData(List listData) {
		this.listData = listData;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getBeginPage() {
		return beginPage;
	}
}
