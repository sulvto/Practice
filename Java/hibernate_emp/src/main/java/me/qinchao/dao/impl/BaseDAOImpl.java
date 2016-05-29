package me.qinchao.dao.impl;

import java.util.List;

import me.qinchao.dao.IBaseDAO;
import me.qinchao.util.HibarnateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public abstract class BaseDAOImpl<T> implements IBaseDAO<T> {
	private Class<T> entityClass;

	public BaseDAOImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Override
	public void save(T t) {
		HibarnateUtil.INSTANCE.getSession().save(t);
	}

	@Override
	public void update(T t) {
		HibarnateUtil.INSTANCE.getSession().update(t);
	}

	@Override
	public void delete(Long id) {
		T t = get(id);
		if (t != null) {
			HibarnateUtil.INSTANCE.getSession().delete(t);
		}
	}

	@Override
	public T get(Long id) {
		return (T) HibarnateUtil.INSTANCE.getSession().get(entityClass, id);
	}

	public List<T> query(int pageNo,int pageSize) {
		Session session = HibarnateUtil.INSTANCE.getSession();
		String hql = "select o from Employee o";
		Query query = session.createQuery(hql);
		query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize);
		return query.list();
	}

	@Override
	public List<T> getAll() {
		return HibarnateUtil.INSTANCE.getSession()
				.createQuery("from " + entityClass.getName()).list();
	}

}
