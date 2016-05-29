package me.qinchao.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public enum HibarnateUtil {
	INSTANCE;
	private static SessionFactory sessionFactory;
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public Session getSession() {
		// 从当前线程局部变量取
		Session session = threadLocal.get();
		// 当session为空或者session为关闭状态
		if (session == null || !session.isOpen()) {
			session = sessionFactory.openSession();
			// 放入线程
			threadLocal.set(session);
		}
		return session;
	}

	public void close() {
		System.out.println(00000000000000);
		Session session = threadLocal.get();
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
}
