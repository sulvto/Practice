package cn.itcast.cd.shopping.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

//基础的Servlet:把Servlet通用的代码提取到这里
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//把请求封装成对象
	protected void request2Obj(HttpServletRequest req, Object target) {
		try {
			BeanUtils.copyProperties(target, req.getParameterMap());//属性拷贝
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}

	//请求转发
	protected void forward(String path, HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(path).forward(req, resp);
	}
}
