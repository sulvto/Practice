<template>
    <section class="ns-base-section">

		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/member/memberlist.html">会员</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/addmemberlevel -->
					<a href="javascript:;" style="color:#999;">添加等级</a>
							</div>
						<!-- 三级导航菜单 -->
			<div class="right-side-operation">
				<ul>
					<li>
						<a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
						<div class="popover">
							<div class="arrow"></div>
							<div class="popover-content">
								<div>
																		<h4>操作提示</h4>
									<p>添加等级</p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts"></p>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>

		<div class="ns-main">

<div class="space-10"></div>
<div class="set-style">
	<dl>
		<dt><span class="required">*</span>等级名称：</dt>
		<dd>
			<input type="text" id="level_name" class="input-common">
			<p class="error">请输入等级名称</p>
			<p class="hint">设置会员等级名称</p>
		</dd>
	</dl>
	<dl>
		<dt>升级条件：</dt>
		<dd class="total">
			<div>
				<i class="checkbox-common"><input type="checkbox" value="1"></i>
				累计积分满&nbsp;&nbsp;&nbsp;
				<input class="input-common harf" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="number" min="0" id="min_integral" style="margin-bottom: 0px; " placeholder="0"><em class="unit">分</em>
				<span class="hint">设置会员等级所需要的累计积分且必须大于等于0</span>
			</div>
			<div>
				<i class="checkbox-common"><input type="checkbox" value="2"></i>
				消费额度满&nbsp;&nbsp;&nbsp;
				<input class="input-common harf" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="number" min="0" id="quota" style="margin-bottom: 0px; " placeholder="0"><em class="unit">元</em>
				<span class="hint">设置会员等级所需要的消费额度且必须大于等于0,单位：元</span>
			</div>
			<label for="navigationtype1" class="radio inline normal"><i class="radio-common selected"><input type="radio" value="1" name="navigationtype" id="navigationtype1" checked="checked"></i>
			或</label>
			<label for="navigationtype2" class="radio inline normal"><i class="radio-common"><input type="radio" value="2" name="navigationtype" id="navigationtype2"></i>
			且</label>
			<label class="hint" style="margin-left:87px;margin-top: 2px;width:27%;font-size:12px ;color:#BBB;">设置会员升级条件的关系</label>
			<p class="error">至少勾选一个升级条件</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>折扣率：</dt>
		<dd>
			<input class="input-common harf" type="text" id="goods_discount"><em class="unit top">%</em>
			<p class="error">折扣率必须为0-100的正整数</p>
			<p class="hint">折扣率单位为百分比，如输入90，表示该会员等级的用户可以以商品原价的90%购买</p>
		</dd>
	</dl>
	<dl>
		<dt>等级描述：</dt>
		<dd>
			<textarea id="desc" class="textarea-common"></textarea>
			<p class="hint">会员等级描述信息</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="addGift();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>

		</div>

	</section>
</template>
