function SendAjax(url, data, success_callback, error_callback) {
	showProcessingLayer();
	$.ajax({
		url : url,
		data : data,
		dataType : 'json',
		success : function(oResponse) {
			hideProcessingLayer();
			if (oResponse["ResponseCode"] == "Success")
			{
				success_callback(oResponse["Data"], oResponse["Html"]);
			}
			else{
				error_callback(oResponse["ResponseCode"] + " : " + oResponse["ErrorMessage"]);
			}
		},
		error : function(jqXHR, textStatus, errorThrown) {
			 hideProcessingLayer();
			error_callback(errorThrown);
		}
	});
}

function PostURL(module, action, data) {
	showProcessingLayer();

	var url = getUrl(module, action);

	if (data == null || $.trim(data).length == 0)
		location.href = url;

	var hiddenForm = $("<form method='post' action='" + url + "'></form>").hide();
	
	$("body").append(hiddenForm);

	var parms = data.split('&');
	for (var i = 0; i < parms.length; i++) {
		var temp = parms[i].split('=');
		if (temp == null || temp.length == 0)
			continue;

		var name = temp[0];
		var value = "";
		if (temp.length > 1)
			value = temp[1];

		var input = $("<input type='hidden' name='" + name + "' value='"
				+ value + "'>");
		hiddenForm.append(input);
	}
	hiddenForm.submit();
}

function PostDownload(module, action, data) {
	var url = getUrlDownload(module, action) + "?" + data;
	location.href = url;
}

function ShowConfirm(message, title, ok_callback, cancel_callback) {
	$('#idConfirmDialogTitle').html(title ? title : "confirm");
	$('#idConfirmDialogMessage').html(message);

	$('#idConfirmDialogButtonOk').unbind('click').click(function() {
		$('#idConfirmDialogDiv').modal("hide");
		if (ok_callback)
			ok_callback();

		return false;
	});
	$('#idConfirmDialogButtonCancel').unbind('click').click(function() {
		$('#idConfirmDialogDiv').modal("hide");
		if (cancel_callback)
			cancel_callback();

		return false;
	});
	$('#idConfirmDialogDiv').modal("show");
}

function InitUploadField(idField, url, jsCode, isSingle) {
	$('#' + idField).fileupload({
		autoUpload : true,
		dataType : 'json',
		url : url,
		dropZone : $("#idSelect_" + idField),
		add : function(e, data) {
			$("#btnUpload_" + idField).unbind('click');
			$("#btnUpload_" + idField).on('click', function() {
				if (data.files.length > 0)
					data.submit();
				else
					showWarning("Add file to upload!");
				return false;
			});

			$("#btnUpload_" + idField).show("fast");
			$("#btnClear_" + idField).show("fast");

			$("#btnClear_" + idField).on('click', function() {
				data.files.length = 0;

				if (isSingle) {
					$("#idInput_" + idField).val("");
				} else {
					$("#idSelect_" + idField).html("");
				}

				$("#btnUpload_" + idField).hide("fast");
				$("#btnClear_" + idField).hide("fast");

				return false;
			});

			$.each(data.files, function(index, file) {

				if (isSingle) {
					$("#idInput_" + idField).val(file.name);
				} else {
					var o = new Option(file.name, file.name);
					// / jquerify the DOM object 'o' so we can use the html
					// method
					$(o).html(file.name);
					$("#idSelect_" + idField).append(o);
				}
			});
		},

		start : function() {
			showProcessingLayer(0);
			$("#btnUploadDone_" + idField).hide("fast");
			$("#btnUpload_" + idField).show("fast");
			$("#btnClear_" + idField).show("fast");
		},

		done : function(e, data) {
			hideProcessingLayer();
			$("#btnUploadDone_" + idField).show("fast");
			$("#btnUpload_" + idField).hide("fast");
			$("#btnClear_" + idField).hide("fast");

			if (jsCode)
				eval(jsCode);
		},

		progressall : function(e, data) {
			var progress = parseInt(data.loaded / data.total * 100, 10);
			showProcessingLayer(progress);
		},

		error : function(data, status, e) {
			hideProcessingLayer();
			showError(e);
		}
	});
}

function showMessage(message, type) {
	$('.bottom-right').notify({
		message : {
			text : message
		},
		type : type
	}).show();
}

function showSuccess(message) {
	showMessage(message, "success");
}

function showError(message) {
	showMessage(message, "danger");
}

function showWarning(message) {
	showMessage(message, "warning");
}

function showInfo(message) {
	showMessage(message, "info");
}

function showProcessingLayer(percent) {
	if (percent) {
		$('#divProcessingLayer').find(".bar").html("");
		$('#divProcessingLayer').find(".bar").css("width", percent + "%");
	} else {
		$('#divProcessingLayer').find(".bar").html("Please wait...");
	}

	if (!$('#divProcessingLayer').is(":visible")) {
		console.log("Create");
		if (percent || percent == 0){
			$('#divProcessingLayer').find(".bar").css("width", "0%");
		}
		else{
			$('#divProcessingLayer').find(".bar").css("width", "100%");
		}
		$('#divProcessingLayer').modal({
			keyboard : false,
			backdrop : "static",
			show : true
		});
	} else
		console.log("Update : " + percent);
}

function InitCal(id, options) {
	var commonOptions = {
		changeMonth : true,
		changeYear : true
	}
	if (options) {
		for (name in options) {
			commonOptions[name] = options[name];
		}
	}
	$("#" + id).datepicker(commonOptions);
}

function hideProcessingLayer() {
	$('#divProcessingLayer').modal("hide");
}

function getUrl(module, action) {
	return ContextPath + "/" + module + "-" + action + ".html";
}

function getUrlAjax(module, action) {
	return ContextPath + "/ajax/" + module + "-" + action + ".html";
}

function getUrlDownload(module, action) {
	return ContextPath + "/Download/" + module + "-" + action + ".html";
}

function addBreadCrumbItem(title, link, class_active) {
	$(document).ready(function() {
		var html = $("#idBreadCrumb").html();

		if (class_active == "active") {
			html += "<li class=\"active\">" + title + "</li>";
		} else {
			html += "<li><a href='" + link + "'> " + title + "</a></li>";
		}
		$("#idBreadCrumb").html(html);
	});
}

function addPageHeadItem(title) {
	$(document).ready(function() {
		$('#page-heading-text').html("");
		$('#page-heading-text').html(title);
	});
}
