package me.qinchao.pss.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;

public interface IBaseService<T> {
	void save(T t);

	void update(T t);

	void delete(Serializable id);

	T get(Serializable id);

	List<T> getAll();

	PageResult<T> findPageResult(final BaseQuery baseQuery);

	// 导入xls
	InputStream exp(String[] heads, List<String[]> list) throws Exception;

	// 导出xls
	List<String[]> imp(File upload) throws Exception;
}
