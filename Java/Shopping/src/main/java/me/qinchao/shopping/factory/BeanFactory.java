package me.qinchao.shopping.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import me.qinchao.shopping.dao.IProductDirDAO;
import me.qinchao.shopping.exception.SystemException;
import me.qinchao.shopping.util.CommUtil;

@SuppressWarnings("all")
public enum BeanFactory {
	INSTANCE;

	private static Properties p = new Properties();
	
	//缓存DAO对象
	//key:	dao的名字
	//value:dao对象
	private Map<String,Object> cache = new HashMap();
	static {
		try {
			//读取dao.properties文件
			InputStream in = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("dao.properties");
			p.load(in);
		} catch (Exception e) {
			throw new SystemException("加载dao.properties失败", e);
		}
	}
	//requiredType:方法返回的对象类型
	public <T>T getBean(String daoName,Class<T> requiredType) {
		try {
			Object daoObj = cache.get(daoName);
			if(daoObj==null){//缓存中没有
				String className = p.getProperty(daoName);
				if (CommUtil.hasLength(className)) {
					daoObj = Class.forName(className).newInstance();
					//检查obj对象是否是requiredType实例.
					if(requiredType.isInstance(daoObj)){
						cache.put(daoName, daoObj);//放入缓存中
					}else{
						throw new SystemException("对象的类型和传人的"+requiredType+"不匹配");
					}
				}
			}
			return (T) daoObj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		IProductDirDAO dao1 = BeanFactory.INSTANCE.getBean("productdirDAO",IProductDirDAO.class);
		IProductDirDAO dao2 = BeanFactory.INSTANCE.getBean("productdirDAO",IProductDirDAO.class);
		IProductDirDAO dao3 = BeanFactory.INSTANCE.getBean("productdirDAO",IProductDirDAO.class);
		System.out.println(dao1);
		System.out.println(dao2);
		System.out.println(dao3);
	}
}
