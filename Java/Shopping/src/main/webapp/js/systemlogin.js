$(function() {
	$("#submit").bind("click", function(){
		  var usernameText = $("#username").val();
		  var passwordText = $("#password").val();
		  var type = $("#type").val();
		  var data={username: usernameText, password: passwordText};
		  console.debug(data);
		  if(type) {
			  console.debug(type);
			  var url="/login?type=user";
		  }else {
			  console.debug(type);
			  var url="/login";
		  }
		  $.post(url, data,function(data){
			  if(data.success) {
//				  console.debug(data.msg);
				  if(data.type=="user") {
					  window.location.href="/index";		  
					  console.debug(data.type);
				  }else {
					  window.location.href="/system/nav";
				  }
			  }else {
//				  console.debug(data.msg);
				  $("#error").css("color","red").html(data.msg);
			  }
		  },"json");
	});
});