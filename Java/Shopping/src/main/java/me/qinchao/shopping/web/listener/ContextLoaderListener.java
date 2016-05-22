package me.qinchao.shopping.web.listener;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;

//监听系统启动,在启动的时候,做系统初始化操作:注册类型转换器,简写
@WebListener
public class ContextLoaderListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("------------ContextLoaderListener------------");
		//重新声明一个Double类型的转换器:若源中没有值,那么使用null填充
		DoubleConverter doubleConverter = new DoubleConverter(null);
		//重新为BeanUtils工具,注册自己的类型转换器
		ConvertUtils.register(doubleConverter, Double.class);
		
		
		BigDecimalConverter bigDecimalConverter = new BigDecimalConverter(null);
		ConvertUtils.register(bigDecimalConverter, BigDecimal.class);
		
		ConvertUtils.register(new LongConverter(null), Long.class);
		ConvertUtils.register(new IntegerConverter(null), Integer.class);
		//=============================================
		DateConverter dateConverter = new DateConverter(null);
		//设置DateConverter支持的时间格式
		dateConverter.setPatterns(new String[]{"yyyy-MM-dd","yyyy-MM-dd HH:mm:ss"});
		ConvertUtils.register(dateConverter, Date.class);
		//=============================================
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
