<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>授权并登录</title>
</head>
<body>

<div>授权${client.clientName} </div>
<div style="color: red">${error}</div>

<form action="" method="post">
    用户名：<input type="text" name="username" value="<shiro:principal/>"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登录并授权">
</form>


</body>
</html>