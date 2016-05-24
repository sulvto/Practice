$().ready(function() {
	// alert(1);
	$("#roleForm").validate({

		rules : {
			name : {
				required : true,
				rangelength : [ 2, 10 ]
//				remote : "role_checkName.action?id=" + $("#id").val()
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