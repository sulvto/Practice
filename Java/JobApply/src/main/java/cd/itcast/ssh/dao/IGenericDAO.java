package cd.itcast.ssh.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDAO<T> {
	void save(T u);

	void update(T u);

	void delete(Serializable id);

	T get(Serializable id);

	List<T> list();
}
