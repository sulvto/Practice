package me.qinchao.pss.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;

public class BaseDao<T> extends HibernateDaoSupport {

	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	public void delete(Class<T> entityClass, Serializable id) {
		T t = get(entityClass, id);
		if (t != null) {
			getHibernateTemplate().delete(t);
		}
	}

	public T get(Class<T> entityClass, Serializable id) {
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	public List<T> getAll(Class<T> entityClass) {
		return getHibernateTemplate().find("from " + entityClass.getName());
	}

	public PageResult<T> findPageResult(final BaseQuery baseQuery) {
		// List<Long> list =
		// getHibernateTemplate().find(baseQuery.getCountHql(),
		// baseQuery.getParamList().toArray());
//		 System.out.println("baseQuery  " + baseQuery.getCountHql());
		Long countL = getHibernateTemplate().executeWithNativeSession(
				new HibernateCallback<Long>() {

					public Long doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(baseQuery
								.getCountHql());
						for (int i = 0; i < baseQuery.getParamList().size(); i++) {
							query.setParameter(i,
									baseQuery.getParamList().get(i));
						}
						// System.out.println(baseQuery.getCountHql() + "   "
						// + baseQuery.getParamList());
						// System.out.println("uniqueResult: "
						// + query.uniqueResult());
						return (Long) query.uniqueResult();
					}
				});

		// int count = list.get(0).intValue();
		int count = countL.intValue();
		if (count == 0) {
			// System.out.println("0000000000000000");
			return new PageResult<T>();
		}
		// System.out.println("111111111111111");
		final PageResult<T> pageResult = new PageResult<T>(
				baseQuery.getCurrentPage(), baseQuery.getPageSize(), count);
		//
		List<T> rows = getHibernateTemplate().executeWithNativeSession(
				new HibernateCallback<List<T>>() {

					public List<T> doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(baseQuery.getHql());
						for (int i = 0; i < baseQuery.getParamList().size(); i++) {
							query.setParameter(i,
									baseQuery.getParamList().get(i));
						}
						query.setFirstResult(
								(pageResult.getCurrentPage() - 1)
										* pageResult.getPageSize())
								.setMaxResults(pageResult.getPageSize());
						// System.out.println("         PageResult()-->  CurrentPage: "
						// + pageResult.getCurrentPage() + " PageSize: "
						// + pageResult.getPageSize());
						return query.list();
					}
				});
		pageResult.setRows(rows);
		// System.out.println("pageResult: " + pageResult);
		return pageResult;
	}

	public List findByHql(String hql,Object...objects) {
		return getHibernateTemplate().find(hql,objects);
	}
}
