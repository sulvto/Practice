<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/updateRoutingRule -->
					<a href="javascript:;" style="color:#999;">编辑路由规则</a>
							</div>
						<!-- 三级导航菜单 -->
			
							
			<div class="right-side-operation">
				<ul>
					
					
<!-- 					style="display:none;" style="display:block;" -->
					<li>
						<a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
						<div class="popover">
							<div class="arrow"></div>
							<div class="popover-content">
								<div>
																		<h4>功能提示</h4>
									<p class="function-prompts">
</p><p>1.如果要使用伪静态，需找到application/config.php中的“REWRITE_MODEL”，将false改为true。</p>
<p style="margin: 0;">2.路由规则添加成功后，删除掉runtime下的缓存文件，再清除掉浏览器缓存，最后进入前台首页。</p>
<p></p>
								</div>
							</div>
						</div>
					</li>
					
				</ul>
			</div>
		</div>
		
		<!-- 操作提示 -->
		
<!-- 		 -->
		<div class="ns-warm-prompt" style="display:none;">
			<div class="alert alert-info">
				<button type="button" class="close">×</button>
				<h4>
<!-- 					{1block name="alert_info"} -->
<!-- 					<i class="fa fa-info-circle"></i> -->
<!-- 					<span class="operating-hints">操作提示</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt><span class="required">*</span>伪静态路由规则：</dt>
		<dd>
			<input type="text" class="input-common" id="rule" onchange="url_route_if_exists('rule',this);" onkeyup="value=value.replace(/[^\d|\w]/g,'')" value="goods" maxlength="100" onpaste="return false">
			<p class="hint">伪静态路由规则不可使用<i class="important-note">"addons,base,cms,components,helpcenter,login,member,notice,order,topic,basecontroller"</i>这些关键字</p>
			<p class="error rule_error">该路由规则已经存在</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>路由地址：</dt>
		<dd>
			<input type="text" class="input-common" id="route" onchange="url_route_if_exists('route',this);" value="shop/goods/goodsinfo" maxlength="150">
			<p class="hint">路由地址由<i class="important-note">模块名/控制器名/方法名</i>组成，如shop/goods/goodslist</p>
			<p class="error route_error">该路由地址已经存在</p>
		</dd>
	</dl>
	<dl>
		<dt>所属模块：</dt>
		<dd>
			<div class="selectric-wrapper selectric-select-common selectric-below" style="width: 250px;"><div class="selectric-hide-select"><select id="route_model" class="select-common" tabindex="-1">
				<option value="1" selected="">shop</option>
				<!-- <option value="2" >wap</option>
				<option value="3" >admin</option> -->
			</select></div><div class="selectric"><span class="selectric-label">shop</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1" style="width: 240px;"><div class="selectric-scroll"><ul><li data-index="0" class="last selected highlighted" title="shop">shop</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
		</dd>
	</dl>
	<dl>
		<dt>是否启用：</dt>
		<dd>
			<p><input type="checkbox" id="is_open" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
		</dd>
	</dl>
	<dl>
		<dt>描述：</dt>
		<dd>
			<textarea name="" id="remark" class="textarea-common"></textarea>
		</dd>
	</dl>	
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="save();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
	<input type="hidden" id="routeid" value="1">
</div>

<div class="page" id="turn-ul" style="display: none;">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"></li>
			<li id="JslastPage">
				
			</li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data">共0条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count">
<input type="hidden" id="page_size">
		</div>
		
	</section>
</template>
