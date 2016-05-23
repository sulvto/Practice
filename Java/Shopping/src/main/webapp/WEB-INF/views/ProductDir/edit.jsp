<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加分类 </title>
<meta name="robots" content="noindex, nofollow">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="/system/dir?cmd=list">商品分类</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加分类 </span>
    <div style="clear:both"></div>
</h1>
<div class="main-div">
    <form action="/system/dir?cmd=save" method="post" >
        <input type="hidden" name="id" value="${dir.id}">
        <table width="90%" id="general-table" align="center">
			<tr> 
				<td>中文名</td>
				<td><input type="text" name="name" value="${dir.name}"/></td>
			</tr>
			<tr>
				<td>英文名</td>
				<td><input type="text" name="englishName" value="${dir.englishName}"/></td>
			</tr>
			<tr>
				<td>介绍</td>
				<td><input type="text" name="intro" value="${dir.intro}"/></td>
			</tr>
		</table>
        <div class="button-div">
            <input type="submit" value=" 确定 " />
            <input type="reset" value=" 重置 " />
        </div>
    </form>
</div>
</body>
</html>