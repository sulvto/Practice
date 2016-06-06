$()
		.ready(
				function() {
					$("#purchaseBillForm").validate({

						rules : {
							name : {
								required : true,
								rangelength : [ 2, 10 ]
							// remote : "purchaseBill_checkName.action?id=" +
							// $("#id").val()
							}
						},
						messages : {
							name : {
								required : "用户名必须填写"
							// remote : "用户名已经存在"
							}
						}
					});
  
					$("#itemTable img[code=searchProudct]").click(function() {
						if(!window.showModalDialog) {
							alert('请切换Firefox浏览器');
							return;
						}
						var vReturnValue = window.showModalDialog("product_bill.action","","dialogHeight:550px;dialogWidth:850px;center:1;dialogTop:100px");
						if (vReturnValue) {
							var tr = $(this).closest("tr");
							tr.find("input[code=productId]").val(vReturnValue.id);
							tr.find("input[code=productName]").val(vReturnValue.name);
							tr.find("input[code=itemPrice]").val(vReturnValue.costPrice);
							tr.find("td[code=productColor]").html(vReturnValue.color);
						}
					});
					$("#addItem").click(function() {
						// clone(true)克隆tr true-事件也克隆
						var newTr = $("#itemTable tr:last").clone(true);
						newTr.find("input[code=productId]").val("");
						newTr.find("input[code=productName]").val("");
						newTr.find("input[code=itemPrice]").val("");
						newTr.find("input[code=itemNum]").val("");
						newTr.find("td[code=itemAmount]").html("");
						newTr.find("td[code=productColor]").html("");
						newTr.find("td[code=itemDescs]").html("");

						$("#itemTable").append(newTr);
					});

					$("#submitBtn").click(function() {
						 var flag = false;
						$("#itemTable tr:gt(0)").each(function(inedx, item) {
							// 把控件的name属性的索引进行修改
							var tr = $(item); // jquer对象
							// 修改索引的对象 只是要提交的控件
							tr.find("input[code=productId]").attr("name","items["+ inedx + "].product.id");
							tr.find("input[code=itemPrice]").attr("name","items["+ inedx+ "].price");
							tr.find("input[code=itemNum]").attr("name","items["+ inedx+ "].num");
							tr.find("input[code=itemDescs]").attr("name","items["+ inedx+ "].descs");
							// 必填
							var productId = tr.find("input[code=productId]").val();
							if(!flag&&!productId) {
								flag=true;
								alert("必须选择产品!");
							}
							var itemPrice = tr.find("input[code=itemPrice]").val();
							if(!flag&&!itemPrice) {
								flag=true;
								alert("请输入正确的价格!");
							}
							var itemNum = tr.find("input[code=itemNum]").val();
							if(!flag&&!itemNum) {
								flag=true;
								alert("请输入正确的数量!");
							}
							if(!flag&&!/^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/
									.test(itemPrice)) {
								alert("请输入正确的价格!");
							}
							if(!flag&&!/^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/
									.test(itemNum)) {
								alert("请输入正确的价格!");
							}
						
						});
						if(!flag) {
							$("#purchaseBillForm").submit();
						}
						});
					// 删除 界面上删除,点击保存的时候,数据库才删除
					$("#itemTable input[code=deleteItem]").click(function() {
						if($("#itemTable tr").size()>2) {
							$(this).closest("tr").remove();
						}
					});

					$("#itemTable input[code=itemPrice],#itemTable input[code=itemNum]").change(function() {
						var tr = $(this).closest("tr");
						var itemPrice = tr.find("input[code=itemPrice]").val();
						var itemNum = tr.find("input[code=itemNum]").val();
						var amount = (itemNum*itemPrice).toFixed(2);
//						<td code="itemAmount"></td>
						tr.find("td[code=itemAmount]").html(amount);
					});
				});