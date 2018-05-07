$(document).ready(function() {
	$('#loadingDiv').hide();
	initEvents();
});

function initEvents() {
	$("#executeButton").click(
		function() {
		var username = $('#username').val();
		var password = $('#password').val();
		var clickTimeRestUrl = $('#clickTimeRestUrl').val();
		var headerParameters = $('#headerParameters').val().trim();
		var request = $('#request').val().trim();
		var parameters = 'username=' + username + '&password=' + password
				+ '&headerParameters=' + headerParameters + '&request=' + request;
		var request = $.ajax({
			url : clickTimeRestUrl +"?" + parameters,
			type : "POST"
		});

		request.done(function(msg) {
			$("#response").html(JSON.stringify(msg));
		});

		request.fail(function(jqXHR, textStatus) {
			alert("Request failed: " + textStatus);
		});
	});
}