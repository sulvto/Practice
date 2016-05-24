function go(no) {
	// alert(no);
	if (no == "next") {
		var nextPage = document.getElementById("nextPage").value;
		document.getElementById("pageNo").value = nextPage;
	}
	if (no == null) {
		var pageSize = document.getElementById("pageSize").value;
		// alert(pageSize);
		document.getElementById("setPageSize").value = pageSize;
		document.getElementById("pageNo").value = 1;
	} else {
		if (no <= document.getElementById("totalPage").value) {
			$("#pageNo").val(no);
		}
	}
	$("#domainForm").submit();
}

function updateDomain(url, id) {
	// document.forms[0].action=url+"_input.action?id="+id;

	$("#domainForm").attr("action", url + "_input.action?id=" + id);
	$("#domainForm").submit();
	$("#domainForm").attr("action", url + ".action?id=" + id);
}

function downloadDomain(url) {
	// document.forms[0].action=url+"_download.action
	$("#domainForm").attr("action", url + "_download.action");
	$("#domainForm").submit();
	$("#domainForm").attr("action", url + ".action");
}
function deleteDomain(url, domainId, src) {
	// //引入jquery-1.8.2.min.js
	$.get(url, {
		id : domainId
	}, function(data) {
		// alert("Data Loaded: " + data);
		// {"success":true,"msg":"删除成功"}
		if (data instanceof Object) {
			if (data.success) {// 删除成功
				if ($("#itemTable tr").size() < 3) {
					// alert($("#itemTable tr").size());
					$("#domainForm").submit();
				} else {
					var totalResult = $("#hiddenResult").val() - 1;
					$("#hiddenResult").val(totalResult);
					$("#totalResult").text("共" + (totalResult) + "条记录");

					$(src).closest("tr").remove();
				}
			} else {// 删除失败
				alert(data.msg);
			}
		} else {
			alert("您没有该权限");
		}
	});
}
