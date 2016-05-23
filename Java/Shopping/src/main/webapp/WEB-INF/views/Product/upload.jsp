<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="/system/pro?cmd=upload"enctype="multipart/form-data" >
        <table cellspacing="1" cellpadding="3" width="100%">
            <tr>
                <td class="label">商品名称：</td>
              <td>	<input type="text" name="name" value="${pro.name}"/></td>
              <td>	<input type="hidden" name="id" value="${pro.id}"/></td>
            </tr>
           
            <tr>
                <td class="label">添加图片：</td>
                <td>
                    <input type="file" name="productImage" id="logo" size="45" ><br/>
                    <span class="notice-span" style="display:block"  id="warn_brandlogo">请上传图片，做为品牌的LOGO！</span>
                </td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><br />
                    <input type="submit" class="button" value=" 确定 " />
                    <input type="reset" class="button" value=" 重置 " />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>