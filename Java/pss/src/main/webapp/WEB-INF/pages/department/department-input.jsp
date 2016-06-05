<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
    <link href="css/index.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" media="screen"
          href="css/screen.css"/>
    <script src="js/validation/jquery.js" type="text/javascript"></script>
    <script src="js/validation/jquery.validate.js" type="text/javascript"></script>
    <script src="js/validation/messages_cn.js" type="text/javascript"></script>

    <script type="text/javascript" src="js/department.js"></script>
    <%-- <script type="text/javascript" src="js/jquery.js"></script> --%>
    <title>成都蓝源进销存系统(教学版)-department编辑界面</title>
    <script type="text/javascript">
        function submit() {
            document.forms[0].submit();
        }
        function cancel() {
            // 		alert("ssss");
            window.history.back();//获取浏览器缓存对象
        }
        function reset() {

            $(
                    "input[name!='id'][name!='baseQuery.pageSize'][name!='baseQuery.currentPage']")
                    .val("");
            $("select").val("-1");
        }
    </script>
</head>

<body>
<div class="content-right">
    <div class="content-r-pic">
        <div style="margin: 5px auto auto 12px;">
            <img src="images/canping.gif" width="138" height="17"/>
        </div>
    </div>

    <div class="content-text">
        <div class="square-order">
            <div style="border: 1px solid #cecece;">
                <s:hidden name="id"/>

                <s:form id="departmentForm" action="department_save">
                    <s:hidden name="baseQuery.currentPage"/>
                    <s:hidden name="baseQuery.pageSize"/>
                    <s:hidden name="id"/>
                <table width="100%" border="0" cellpadding="0" cellspacing="0">

                <tr bgcolor="#FFFFFF">
                        <td width="22%" align="center">名称</td>
                        <td width="29%"><s:textfield name="name" label="名称"/></td>
                    </tr>
</table>
                </s:form>
            </div>
            <div class="order-botton">
                <div style="margin: 1px auto auto 1px;">
                    <table width="100%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td><a onclick="submit()"/><img
                                    src="images/order_tuo.gif" border="0"/></td>
                            <td>&nbsp;</td>
                            <td><a onclick="reset()"><img
                                    src="images/order_tuo.gif" border="0"/></a></td>
                            <td>&nbsp;</td>
                            <td><a onclick="cancel()"/><img
                                    src="images/order_tuo.gif" border="0"/></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <!--"square-order"end-->
    </div>

    <!--"content-text"end-->
    <div class="content-bbg">
        <img src="images/content_bbg.jpg"/>
    </div>
</div>
<!--"content-right"end-->
</body>
</html>
