$(function() {
	var val = null;
	$("#nextPage").keydown(function(event) {
		// alert(event.keyCode);
		val = $("#nextPage").val();
	});
	$("#nextPage").keyup(function(event) {
		if (event.keyCode != 13) {
			if (event.keyCode == 8) {
				$("#nextPage").val("");
			} else if (57 < event.keyCode || event.keyCode < 48) {
				$("#nextPage").val(val);
			}
		}
	});
});
