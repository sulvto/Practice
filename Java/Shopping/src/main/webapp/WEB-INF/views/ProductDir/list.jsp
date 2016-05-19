<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品分类 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="${pageContext.request.contextPath}/system/dir?cmd=edit">添加分类</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 商品分类 </span>
</h1>
<form method="post" action="" name="listForm">
    <div class="list-div" id="listDiv">
        <table width="100%" cellspacing="1" cellpadding="2" id="list-table">
            <tr>
                <th>分类名称</th>
                <th>英文名称</th>
                <th>分类简介</th>
                <th>操作</th>
            </tr>
           <c:forEach items="${list}" var="o">
            <tr align="center" class="0">
                <td align="left" class="first-cell" >${o.name} </td>
                <td>${o.englishName}</td>
                <td>${o.intro}</td>
                <td align="center">
               	 	<a href="${pageContext.request.contextPath}/system/dir?cmd=edit&id=${o.id}" title="编辑"><img src="/images/icon_edit.gif" width="16" height="16" border="0" /></a>
                	<a href="${pageContext.request.contextPath}/system/dir?cmd=delete&id=${o.id}" title="回收站"><img src="/images/icon_trash.gif" width="16" height="16" border="0" /></a>
                </td>
            </tr>
           </c:forEach>
        </table>
    </div>
</form>
</body>
</html>