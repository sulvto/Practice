<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/bargain/config -->
					<a href="javascript:;" style="color:#999;">砍价配置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/bargain/index.html';">砍价列表</li>
													<li class="selected" onclick="location.href='/bargain/config.html';">砍价设置</li>
											</ul>
				</nav>
							
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
									<p class="function-prompts"></p>
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
		<dt>是否开启：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="is_use" type="checkbox" checked="" class="checkbox" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">设置砍价活动的开启关闭</p>
		</dd>
	</dl>
	<dl>
		<dt>活动时间：</dt>
		<dd>
			<div class="controls">
				<p>
					<input type="number" id="activity_time" name="activity_time" value="5" class="input-common harf"><em class="unit">天</em>
				</p>
			</div>
			<p class="hint">设置发起活动后多长时间结束 单位：天</p>
		</dd>
	</dl>
	<dl>
		<dt>最大砍价次数：</dt>
		<dd>
			<div class="controls">
				<p>
					<input type="number" id="bargain_max_number" name="bargain_max_number" value="10" class="input-common harf"><em class="unit">次</em>
				</p>
			</div>
			<p class="hint">每个人帮助砍价最多次数</p>
		</dd>
	</dl>
	<dl>
		<dt>推广语：</dt>
		<dd>
			<div class="controls">
				<p>
					<input type="text" id="propaganda" name="propaganda" value="11" class="input-common">
				</p>
			</div>
			<p class="hint">设置推广语</p>
		</dd>
	</dl>
	
	<dl>
		<dt>砍价提示语：</dt>
		<dd>
			<textarea rows="10" id="cut_methods" class="textarea-common" maxlength="50">22</textarea>
			<p class="hint">用户砍价后的提示说明，用,分隔</p>
		</dd>
	</dl>
	<dl>
		<dt>第一刀的提示语：</dt>
		<dd>
			<input type="text" id="launch_cut_method" name="launch_cut_method" value="33" class="input-common">
			<p class="hint">第一刀的的提示语</p>
		</dd>
	</dl>
	
	<dl>
		<dt>活动规则：</dt>
		<dd>
			<textarea rows="10" id="rule" name="rule" class="textarea-common" maxlength="50">444</textarea>
			<p class="hint">整个活动的活动规则介绍</p>
		</dd>
	</dl>
	
	<dl>
		<dt></dt>
		<dd><button class="btn-common btn-big" onclick="setConfigAjax();">保存</button></dd>
	</dl>
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
