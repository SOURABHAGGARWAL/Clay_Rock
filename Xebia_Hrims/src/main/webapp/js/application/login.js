function login() {
	var data = $("#login").serialize();
	alert(data);
	SendAjax("dashboard.do", data, function(data, html) {
		if (data['responseMessage'] == "Success") {
			//location.href = "user-dashboard.html";
		} else {
			showError(data['responseMessage']);
		}
	}, function(message) {
		showError(message);
	});
}