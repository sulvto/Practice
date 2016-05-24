package me.qinchao.pss.web;

import me.qinchao.pss.domain.Employee;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

import me.qinchao.pss.service.IEmployeeService;

public class LoginAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private IEmployeeService employeeService;
	private String name;
	private String password;

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public String execute() throws Exception {
		return LOGIN;
	}

	public void validateCheckLogin() {
		if (StringUtils.isBlank(name)) {
			addFieldError("name", "用户名必须 输入");
		}
		if (StringUtils.isBlank(password)) {
			addFieldError("password", "密码必须 输入");
		}
	}

	@InputConfig(resultName = "login")
	public String checkLogin() throws Exception {
		logger.debug("checkLogin name:  " + name + " password:  " + password);
		Employee employee = employeeService.findByLogin(name, password);
		if (employee != null) {
			ServletActionContext.getContext().getSession()
					.put(LOGIN_USER, employee);
			System.out.println("----->  main");
			return MAIN;
		}
		return LOGIN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
