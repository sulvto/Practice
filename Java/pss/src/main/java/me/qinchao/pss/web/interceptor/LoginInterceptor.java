package me.qinchao.pss.web.interceptor;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.service.IEmployeeService;
import me.qinchao.pss.web.LoginAction;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.web.BaseAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginInterceptor extends AbstractInterceptor {
	private final static Logger LOGGER = LoggerFactory.getLogger(LoginInterceptor.class);

	private static final long serialVersionUID = 1L;
	private IEmployeeService employeeService;

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
		if (action instanceof LoginAction) {
			return invocation.invoke();
		}
		// 拦截登录
		Employee employee = (Employee) ServletActionContext.getRequest()
				.getSession().getAttribute(BaseAction.LOGIN_USER);
		// (Employee) invocation.getInvocationContext()
		// .getSession().get(BaseAction.LOGIN_USER);
		if (employee == null) {
			LOGGER.debug("未登录");
			return Action.LOGIN;
		}
		// 拦截权限
		String className = action.getClass().getName();
		// invocation.getProxy()获取代理
		String methodName = invocation.getProxy().getMethod();
		String classMathodName = className + "." + methodName;
		String allClassMethodName = className + ".ALL";
		LOGGER.debug("employee: " + employee.getName()
				+ "  classMathodName: " + classMathodName);
		LOGGER.debug("className: " + className + "   methodName: "
				+ methodName + "   classMathodName: " + classMathodName
				+ "   allClassMethodName: " + allClassMethodName);
		List<String> allMathods = employeeService.getAllResourceMethods();
		if (allMathods.contains(classMathodName)
				|| allMathods.contains(allClassMethodName)) {
			LOGGER.debug("需要权限");
			List<String> findResourceMehtods = employeeService
					.findResourceMehtodsByLoginUser(employee);
			LOGGER.debug(findResourceMehtods.toString());
			if (findResourceMehtods.contains(classMathodName)
					|| findResourceMehtods.contains(allClassMethodName)) {
				LOGGER.debug("  有权限");
			} else {
				LOGGER.debug("  没有权限");
				return "unauthorized";
			}
		} else {
			LOGGER.debug("不需要权限");
		}
		return invocation.invoke();
	}
}