package me.qinchao.pss.velocity;

import java.io.File;
import java.io.FileWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.junit.Test;

public class CreateCodeTest {
	// 1.那些domain需要生成代码
	private String[] domains = {"StockIncomeBill","StockIncomeBillItem"};

	// 开关：默认情况下已经存在的文件不需要生成代码
	// true:覆盖所有代码
	static final boolean flag = false;

	// 2.定义固定的目录路径:都是使用相对路径,规范：路径前面都不加/,路径的后面都加/
	private static final String MAIN = "src/main/java/";
	private static final String TEST = "src/test/java/";
	private static final String RESOURCE = "src/main/resources/";
	private static final String PACKAGE = "cd/qin/pss/";
	private static final String WEBAPP = "src/main/webapp/";
	// 2.有那些模板需要生成
	private String[] templates = { "Service.java", "ServiceImpl.java",
			"Query.java", "Action.java", "ServiceTest.java", "hbm.xml",
			"Manager.xml", "list.jsp", "input.jsp", "domain.js" };

	// 3.模板生成的文件路径(和模板的定义对应的)
	private String[] files = { MAIN + PACKAGE + "service/",
			MAIN + PACKAGE + "service/impl/", MAIN + PACKAGE + "query/",
			MAIN + PACKAGE + "web/", TEST + PACKAGE + "service/",
			RESOURCE + PACKAGE + "domain/", RESOURCE + "manager/",
			WEBAPP + "WEB-INF/pages/", WEBAPP + "WEB-INF/pages/",
			WEBAPP + "js/" };

	@Test
	public void create() throws Exception {
		// 5.外循环：domains
		VelocityContext context = new VelocityContext();
		for (int i = 0; i < domains.length; i++) {
			// 6.处理domain首字母小写
			context.put("entityDomain", domains[i]);
			String lowerEntityDomain = domains[i].substring(0, 1).toLowerCase()
					+ domains[i].substring(1);
			context.put("lowerEntityDomain", lowerEntityDomain);
			// 7.内循环：templates和files
			for (int j = 0; j < files.length; j++) {
				// 8.实例化文件存放的路径
				File file = new File(files[j] + domains[i] + templates[j]);
				// 9.处理特殊的文件名称hbm.xml
				if ("Service.java".equals(templates[j])) {
					file = new File(files[j] + "I" + domains[i] + templates[j]);
				} else if ("hbm.xml".equals(templates[j])) {
					file = new File(files[j] + domains[i] + "." + templates[j]);
				} else if ("domain.js".equals(templates[j])) {
					file = new File(files[j] + lowerEntityDomain + ".js");
				} else if ("list.jsp".equals(templates[j])) {
					file = new File(files[j] + lowerEntityDomain + "/"
							+ lowerEntityDomain + ".jsp");
				} else if ("input.jsp".equals(templates[j])) {
					file = new File(files[j] + lowerEntityDomain + "/"
							+ lowerEntityDomain + "-" + templates[j]);
				}

				// 开关：默认情况下已经存在的文件不需要生成代码
				// true:覆盖所有代码
				// 表示代码已经存在 并且flag=false,不生成代码
				if (file.exists() && !flag) {
					continue;// 继续下一次循环
				}

				System.out.println(file.getAbsolutePath());
				// 10.判断父目录是否存在
				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
				}
				Template template = Velocity.getTemplate("templates/"
						+ templates[j], "UTF-8");
				FileWriter writer = new FileWriter(file);
				// 11.必须关闭流，写入内容
				template.merge(context, writer);
				writer.close();
			}
		}
		System.out.println("代码已经生成，刷新工程，修改映射文件，运行测试");
	}
}
