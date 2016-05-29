package me.qinchao.dao;

import java.util.List;

public interface IBaseDAO<T> {
	void save(T t);

	void update(T t);

	void delete(Long id);

	T get(Long id);

	List<T> getAll();
	List<T> query(int pageNo,int pageSize);
}
