<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品图片上传</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h1>
		<span class="action-span"><a href="brandList.html">商品品牌</a></span> <span
			class="action-span1"><a href="#">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 添加品牌 </span>
		<div style="clear: both"></div>
	</h1>
	<div class="main-div">
		<form method="post" action="/system/pro?cmd=upload"
			enctype="multipart/form-data">
			<input type="hidden" name="name" value="${pro.name}" />
			<input type="hidden" name="id" value="${pro.id}" /> 
			<table cellspacing="1" cellpadding="3" width="100%">
				<tr>
					<td class="label">商品名称</td>
					<td><input type="text" value="${pro.name}" /></td>
				</tr>
				<tr>
					<td class="label">商品图片</td>
					<td><input type="file" name="productImage" id="logo" size="45" /><br />
						<span class="notice-span" style="display: block"
						id="warn_brandlogo">请上传商品图片哦！</span></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br /> <input type="submit"
						class="button" value=" 确定 " /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>