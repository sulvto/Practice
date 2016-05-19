package cn.itcast.cd.shopping.page;

import java.util.List;

//分页的结果对象,封装了当前页所有的数据
@SuppressWarnings("all")
public class PageList {
	private List listData;//当前页结果集数据

	private Integer currentPage = 1;//当前第几页
	private Integer pageSize = 3;//每页显示多少条数据

	//private Integer beginPage = 1;//首页
	//private Integer prePage;//上页
	//private Integer nextPage;//下页
	//private Integer totalPage;//末页/总页数

	private Integer totalCount;//总记录数

	/*public Integer getBeginPage() {
		return 1;
	}*/

	public Integer getPrePage() {
		return currentPage - 1 >= 1 ? currentPage - 1 : 1;
	}

	public Integer getNextPage() {
		return currentPage + 1 <= getTotalPage() ? currentPage + 1 : getTotalPage();
	}

	public Integer getTotalPage() {
		return this.totalCount % pageSize == 0 ? this.totalCount / pageSize
				: this.totalCount / pageSize + 1;
	}

	//==============================================
	public List getListData() {
		return this.listData;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setListData(List listData) {
		this.listData = listData;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
