package me.qinchao.pss.web;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.service.IOauth2LoginService;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

import me.qinchao.pss.service.IEmployeeService;
import org.apache.struts2.json.JSONUtil;
import org.apache.struts2.json.annotations.JSON;

import java.util.Map;

public class LoginAction extends BaseAction {
    private static final long serialVersionUID = 1L;
    private IEmployeeService employeeService;
    private IOauth2LoginService oauth2LoginService;
    private String name;
    private String password;

    // oauth auth code
    private String code;

    public void setOauth2LoginService(IOauth2LoginService oauth2LoginService) {
        this.oauth2LoginService = oauth2LoginService;
    }

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
            return MAIN;
        }
        return LOGIN;
    }

    @InputConfig(resultName = "login")
    public String oauth2Login() throws Exception {
        logger.debug("checkLogin code:  " + code);
        Employee employee = oauth2LoginService.accessEmployee(code);
        if (employee != null) {
            ServletActionContext.getContext().getSession()
                    .put(LOGIN_USER, employee);
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
