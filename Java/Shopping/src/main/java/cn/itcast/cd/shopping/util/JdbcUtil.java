package cn.itcast.cd.shopping.util;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import cn.itcast.cd.shopping.exception.SystemException;

//JDBC的连接工具类
public enum JdbcUtil {
	INSTANCE;

	private static DataSource dataSource;

	//加载资源文件,并创建DataSource(数据源)对象
	static {
		try {
			//从CLASSPATH根路径去加载资源:db.properties
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			InputStream inStream = loader.getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(inStream);
			dataSource = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			throw new SystemException("获取数据源失败", e);
		}
	}

	//获取数据源对象
	public DataSource getDataSource() {
		return dataSource;
	}
}
