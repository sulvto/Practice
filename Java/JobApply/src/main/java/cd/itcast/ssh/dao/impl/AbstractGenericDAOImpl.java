package cd.itcast.ssh.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cd.itcast.ssh.dao.IGenericDAO;

@SuppressWarnings("unchecked")
public abstract class AbstractGenericDAOImpl<T> extends HibernateDaoSupport
		implements IGenericDAO<T> {

	private Class<T> clz;

	public AbstractGenericDAOImpl() {
		Type genericType = this.getClass().getGenericSuperclass();
		ParameterizedType pType = (ParameterizedType) genericType;
		clz = (Class<T>) pType.getActualTypeArguments()[0];
	}

	@Override
	public void save(T u) {
		getHibernateTemplate().save(u);
	}

	@Override
	public void update(T u) {
		this.getHibernateTemplate().update(u);
	}

	@Override
	public void delete(Serializable id) {
		try {
			T t = clz.newInstance();
			Field f = clz.getDeclaredField("id");
			f.setAccessible(true);
			f.set(t, id);
			this.getHibernateTemplate().delete(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public T get(Serializable id) {
		return this.getHibernateTemplate().get(clz, id);
	}

	@Override
	public List<T> list() {
		return this.getHibernateTemplate().find("FROM " + clz.getName());
	}
}
