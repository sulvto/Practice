$().ready(function() {
	// alert(1);
	$("#supplierForm").validate({

		rules : {
			name : {
				required : true,
				rangelength : [ 2, 10 ]
//				remote : "supplier_checkName.action?id=" + $("#id").val()
			}
		},
		messages : {
			name : {
				required : "用户名必须填写"
//				remote : "用户名已经存在"
			}
		}
	});
});