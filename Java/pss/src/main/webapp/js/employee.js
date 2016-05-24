$().ready(function() {
	// alert(1);
	$("#employeeForm").validate({

		rules : {
			name : {
				required : true,
				rangelength : [ 2, 10 ],
				remote : "employee_checkName.action?id=" + $("#id").val()
			},
			password : {
				required : true
			},
			email : "email",
			age : {
				required : true,
				max : 100,
				min : 18
			}
		},
		messages : {
			name : {
				required : "用户名必须填写",
				remote : "用户名已经存在"
			},
			password : {
				required : "密码必须填写"
			}
		}
	});
});