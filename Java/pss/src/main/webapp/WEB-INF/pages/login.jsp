<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<title>蓝源进销存(教学版)-系统登录页</title>
<script type="text/javascript">

	if(top!==window){
		top.location.href = window.location.href;
	}

	function login_submit() {
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<div class="container-login">
		<div class="login-pic">
			<div class="login-text">
				<s:form action="login_checkLogin">
<%-- 					<s:fielderror /> --%>
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="19%" height="28">用户名：</td>
							<td colspan="2"><input name="name" type="text" size="18"
								value="admin" /></td>
						</tr>
						<tr>
							<td height="31">&nbsp;密&nbsp;码：</td>
							<td colspan="2"><input name="password" type="password"
								size="18" value="admin" /></td>
						</tr>
						<tr>
							<td height="30">验证码：</td>
							<td width="43%"><input name="" type="password" size="9" /></td>
							<td width="32%"><img src="images/test.gif" /></td>
						</tr>
						<tr>
							<td height="30">&nbsp;</td>
							<td colspan="2"><a href="#" onclick="login_submit()"><img
									src="images/denglu_bg_03.gif" name="Image1" width="40"
									height="22" border="0" id="Image1"
									onmouseover="MM_swapImage('Image1','','images/denglu_h_03.gif',1)"
									onmouseout="MM_swapImgRestore()" /></a><a href="#"><img
									src="images/giveup_bg_03.gif" name="Image2" width="40"
									height="22" border="0" id="Image2"
									onmouseover="MM_swapImage('Image2','','images/giveup_h_03.gif',1)"
									onmouseout="MM_swapImgRestore()" /></a></td>
						</tr>
					</table>
				</s:form>

			</div>
		</div>
		<!--"login-pic"end-->
	</div>
	<!--"container-login"end-->

</body>
</html>
