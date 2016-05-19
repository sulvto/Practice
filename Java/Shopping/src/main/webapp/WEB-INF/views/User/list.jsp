<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 用户列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="${pageContext.request.contextPath}/system/user?cmd=edit">添加用户</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 用户</span>
</h1>
<form method="post" action="" name="listForm">
    <div class="list-div" id="listDiv">
        <table width="100%" cellspacing="1" cellpadding="2" id="list-table">
            <tr>
                <th>账号</th>
                <th>密码</th>
                <th>邮件</th>
                <th>类型</th>
                <th>状态</th>
                <th>上次登录时间</th>
                <th>上次登录IP</th>
                <th>登录时间</th>
                <th>登录IP</th>
                <th>操作</th>
            </tr>
           <c:forEach items="${list}" var="o">
            <tr align="center" class="0">
                <td align="left" class="first-cell" >${o.username}</td>
                <td>${o.password}</td>
                <td>${o.email}</td>
                <td>
                <c:if test="${o.type==1}">客户</c:if>
                <c:if test="${o.type==3}">超级管理员</c:if>
                <c:if test="${o.type==2}">管理员</c:if>
                </td>
                <td>${o.status==0?"启用":"禁用"}</td>
                <td>${o.lastLoginTime}</td>
                <td>${o.lastLoginIp}</td>
                <td>${o.loginTime}</td>
                <td>${o.loginIp}</td>
                <td align="center">
               	 	<a href="${pageContext.request.contextPath}/system/user?cmd=edit&id=${o.id}" title="编辑"><img src="/images/icon_edit.gif" width="16" height="16" border="0" /></a>
                	<a href="${pageContext.request.contextPath}/system/user?cmd=delete&id=${o.id}" title="回收站"><img src="/images/icon_trash.gif" width="16" height="16" border="0" /></a>
                </td>
            </tr>
           </c:forEach>
        </table>
    </div>
</form>
</body>
</html>