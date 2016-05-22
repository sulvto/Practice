package me.qinchao.shopping.domain;

import java.util.Date;

//User对象(超级管理员/管理员/客户):
public class User {
	private Long id; 		//唯一标识
	private String username;//用户账号(唯一)
	private String password;//账号密码
	private String email;	//注册邮箱:(唯一)找回密码
	private Integer type = 2;//用户类型(1:客户/2:管理员/3:超级管理员)
	private Integer status = 0;//账号状态(0:启用/1:禁用)
	private Date loginTime;	//该次登录时间
	private String loginIp;	//该次登录IP
	private Date lastLoginTime;//上次登录时间
	private String lastLoginIp;//上次登录IP

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", type=" + type
				+ ", status=" + status + ", loginTime=" + loginTime
				+ ", loginIp=" + loginIp + ", lastLoginTime=" + lastLoginTime
				+ ", lastLoginIp=" + lastLoginIp + "]";
	}
}
