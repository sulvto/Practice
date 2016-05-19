<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!-- $Id: category_info.htm 16752 2009-10-20 09:59:38Z wangleisvn $ -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加商品 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="">商品列表</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加商品 </span>
</h1>
<div class="main-div">
    <form action="/system/pro?cmd=save" method="post" name="theForm">
    	<input type="hidden" name="id" value="${dir.id}"/>
        <table width="100%" id="general-table">
            <tr>
                <td class="label">商品编号:</td>
                <td>
                    <input type='text' name='sn' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品名称:</td>
                <td>
                    <input type='text' name='name' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">成本价格:</td>
                <td>
                    <input type='text' name='costPrice' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">市场价格:</td>
                <td>
                    <input type='text' name='marketPrice' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">零售价格:</td>
                <td>
                    <input type='text' name='salePrice' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品折扣:</td>
                <td>
                    <input type='text' name='cutOff' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品规格:</td>
                <td>
                    <input type='text' name='model' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品产地:</td>
                <td>
                    <input type='text' name='place' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品数量:</td>
                <td>
                    <input type='text' name='num' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">上架时间:</td>
                <td>
                    <input type='text' name='num' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">商品分类:</td>
                <td>
                    <input type='text' name='dirId' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
           	<tr>
                   <td class="label">分类描述</td>
                    <td>
                        <textarea name="intro" cols="25" rows="5">${dir.intro}</textarea>
                    </td>
             </tr>
        </table>
        <div class="button-div">
            <input type="submit" value=" 确定 " class="button"/>
            <input type="reset" value=" 重置 " class="button"/>
        </div>
    </form>
</div>

</body>
</html>