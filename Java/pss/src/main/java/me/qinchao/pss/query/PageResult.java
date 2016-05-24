package me.qinchao.pss.query;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {
	private Integer currentPage;
	private Integer pageSize;
	private Integer totalPage;
	private Integer totalResult;
	private List<T> rows = new ArrayList();

	public PageResult() {
		this.pageSize = 0;
		this.currentPage = 1;
	}

	public PageResult(int currentPage, int pageSize, int totalResult) {
//		System.out.println("PageResult()-->  pageSize: " + pageSize
//				+ " totalResult: " + totalResult + " currentPage: "
//				+ currentPage);
		this.currentPage = currentPage > 0 ? currentPage : 1;
		this.pageSize = pageSize;
		this.totalResult = totalResult;
		this.totalPage = (this.totalResult + this.pageSize - 1) / this.pageSize;
		this.currentPage = this.currentPage > this.totalPage ? this.totalPage
				: this.currentPage;
//		System.out.println("PageResult()-->  pageSize: " + this.pageSize
//				+ " totalPage: " + this.totalPage + " totalResult: "
//				+ this.totalResult + " currentPage: " + this.currentPage);
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

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(Integer totalResult) {
		this.totalResult = totalResult;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageResult [currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", totalPage=" + totalPage + ", totalResult="
				+ totalResult + ", rows=" + rows + "]";
	}

}
