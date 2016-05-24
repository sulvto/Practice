$().ready(function() {
	// alert(1);
	$("#productForm").validate({

		rules : {
			name : {
				required : true,
				rangelength : [ 2, 10 ]
			// remote : "product_checkName.action?id=" + $("#id").val()
			},
			costPrice : {
				required : true
			}
		},
		messages : {
			name : {
				required : "用户名必须填写"
			// remote : "用户名已经存在"
			}
		}
	});
});

// 一级类型对应的二级类型的缓存
var my = {};// 定义对象(var)
my.items = {};// 对象的集合

function findChildren(src) {
	var children = document.getElementById("children");
	children.options.length = 0;
	if (src.value == -1) {
		children.options.add(new Option("-请选择-", -1));
	} else {
		var tempData = my.items[src.value];
		if (tempData) {
			for ( var i = 0; i < tempData.length; i++) {
				children.options.add(new Option(tempData[i].name,
						tempData[i].id));
			}
		} else {

			$.get("product_findChildren.action", {
				id : src.value
			}, function(data) {
				for ( var i = 0; i < data.length; i++) {
					children.options.add(new Option(data[i].name, data[i].id));
				}
				my.items[src.value] = data;
			});
		}
	}

}