package me.qinchao.pss.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 返回json的视图
	public static final String AJAX_RESULT = "ajaxResult";
	// session
	public static final String LOGIN_USER = "user";
	// 重定向
	public static final String RELOAD = "reload";
	// login
	public static final String LOGIN = "login";
	// 重定向后台主页
	public static final String MAIN = "main";
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected void putContext(String key, Object value) {
		ActionContext.getContext().put(key, value);
	}

	protected void putJson(Object value) {
		ActionContext.getContext().put("map", value);
	}

}