<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
<script type="Text/Javascript" language="JavaScript">
	if (window.top != window) {
		window.top.location.href = document.location.href;
	}
</script>
<script type="text/javascript" src="/js/jQuery/core/jquery-1.8.2.js">
</script>
<script type="text/javascript" src="/js/systemlogin.js">
</script>

</head>
<body style="background: #278296; color: white">

	<form method="post" action="/login">
		<table cellspacing="0" cellpadding="0" style="margin-top: 100px"
			align="center">
			<tr>
				<td><img src="/images/login.png" width="178" height="256"
					border="0" alt="ECSHOP" /></td>
				<td style="padding-left: 50px">
					<table>
						<tr>
							<td>管理员姓名：</td>
							<td><input type="text" id="username" required /></td>
						</tr>
						<tr>
							<td>管理员密码：</td>
							<td><input type="password" id="password" required /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="button" id="submit" value="进入管理中心" class="button" /></td>
						</tr>
						<span id="error" ></span>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>