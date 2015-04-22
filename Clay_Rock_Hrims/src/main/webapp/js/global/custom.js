//User Profile
function init_user_profile(){
	$('#user_form').validate(
			{
			    rules: {
			    	firstName: {
			    		required: true,
			    		minlength:5
			    	},
			    	lastName:{
			    		required: true,
			    		minlength:5
			    	},
			    	designation:{
			    		required: true,
			    		minlength:5
			    	}
			    	
			    },
			    highlight: function(label) {
			    	$(label).closest('.control-group').addClass('has-error');
			    },
				ignoreTitle: true,   		
			    success: function(label) {
			    	label
			    		.text('').addClass('icon-success valid')
			    		.closest('.control-group').addClass('has-success');
			    }, ignoreTitle: true
		}); 
		
	$("#dob").datepicker({
		dateFormat : 'dd-mm-yy',
		changeMonth : true,
		changeYear : true,
		starts : 100,
		yearRange : "-70:+0",
		minDate : "-70Y",
		maxDate : "0Y"
		
	});
	
	return false;
}

function init_login(){
	$('#idLoginForm').validate(
			{
			    rules: {
			    	user_name: {
			    		required: true,
			    		minlength:5
			    	},
			    	password:{
			    		required: true,
			    		minlength:5
			    	}
			    	
			    },
			    highlight: function(label) {
			    	$(label).closest('.control-group').addClass('error');
			    },
				ignoreTitle: true,   		
			    success: function(label) {
			    	label
			    		.text('').addClass('icon-success valid')
			    		.closest('.control-group').addClass('has-success');
			    }, ignoreTitle: true
		}); 
	return false;
}


// End Responsive Table Js
jQuery(document).ready(function() {
		
		jQuery(".os_table_sort .grid-view").click(function() {
			//jQuery("#gridview").fadeIn(1050 );
			
			$( "#gridview" ).animate({
			   
				opacity: "show"
			  }, {
				duration: 400
			});
			$( "#tableview" ).animate({
			   width: [ "toggle", "easeOutQuad" ],
				height: [ "toggle", "easeOutQuad" ],
				opacity: "hide",
				easing:'easeOutQuad'
			  }, {
				duration: 400
			});
		});
		
		
		jQuery(".os_table_sort .table-view").click(function() {
			jQuery("#tableview").fadeIn(1050 );
			$( "#gridview" ).animate({
			   width: [ "toggle", "easeOutQuad" ],
				height: [ "toggle", "easeOutQuad" ],
				opacity: "hide"
			  }, {
				duration: 400
			});
		});
		
		
		jQuery(".os_block_sort .show_active_buyer").click(function() {
			jQuery(".os_manager_buyers").find(".active_buyer").fadeIn(1050 );
			$( ".inactive_buyer" ).animate({
			   width: [ "toggle", "easeOutQuad" ],
				height: [ "toggle", "easeOutQuad" ],
				opacity: "hide"
			  }, {
				duration: 400
			});
		});
		
		jQuery(".os_block_sort .show_inactive_buyer").click(function() {
			jQuery(".os_manager_buyers").find(".inactive_buyer").fadeIn(1050 );
			$( ".active_buyer" ).animate({
			   width: [ "toggle", "easeOutQuad" ],
				height: [ "toggle", "easeOutQuad" ],
				opacity: "hide",
				easing:'easeOutQuad'
			  }, {
				duration: 400
			});
			
		});
		
		
		
		
});
// End Responsive Table Js
jQuery(document).ready(function() {
		init_support_requests();
});
//Function for handling Support request functionality
function init_support_requests(){
	hideAllRequestPanel();
	$("#options-links li").click(function() { 
		var target = $(this).attr( "data-target" );
		$("#options-links li").removeClass('active');
		$(this).addClass('active');
		hideAllRequestPanel();
		// Get Requests list from server
		var request_type = target.split(":");
		//getRequestList(request_type[0],request_type[1]);		
	});	
	
	$("#new-request").click(function() { 
		hideAllRequestPanel();
		init_support_request_form();
		showRequestPanel("new-request");
	});
	
	$("#request-discard").click(function() { 
		hideAllRequestPanel();
		showRequestPanel("requests-list");
	});
//	getRequestList('all');	
	//showReuestPanel("requests-list");
	$("#requests-list").click(function() { 
		hideAllRequestPanel();
		init_support_request_form1();
		showRequestPanel("requests-list");
	});
}

function hideAllRequestPanel(){
	$("#new-request-panel").hide();
	$("#new-request-panel").removeClass('animated fadeInLeft');
	$("#request-detail-panel").hide();
	$("#request-detail-panel").removeClass('animated fadeInLeft');
	$("#requests-list-panel").hide();
	$("#requests-list-panel").removeClass('animated fadeInLeft');
}

function showRequestPanel(panel_name){
	$("#"+panel_name+"-panel").show();
	$("#"+panel_name+"-panel").addClass('animated fadeInLeft');
	$("#"+panel_name+"-panel").removeClass('hidden');
}

function init_request_detail(data){
	$('#support-request-detail').html(data);
	$("#request-detail-panel").addClass('animated fadeInDown');
	$("#request-detail-panel").show();
	$(".request-close").click(function() { 
		hideAllRequestPanel();
		showRequestPanel("requests-list");
	});
	//Initialize request reply form
	init_request_reply_form();
	$("#request-park").click(function() { 
		$("#to_status_id").val("P");
		saveReply();
	});
	$("#request-update").click(function() { 
		$("#to_status_id").val("I");
		saveReply();
	});
	$("#completed").click(function() { 
		$("#to_status_id").val("C");
	});
}
function init_support_request_form(){
	//Get request detail from server
	$.ajax({
		dataType : "json",
		url : "ajax/support-new.html",
		data : {
			AJAX : '1'
		},
		success : function(data) {
			if (data["ResponseCode"] == "Success"){
				$('#support-requests-new').html(data['Html']);
				showRequestPanel('new-request');
				$("#request-discard").click(function() { 
					hideAllRequestPanel();
					showRequestPanel("requests-list");
				});}
			return true;
			
		},
		error : function(e) {
			console.log('error: '+e);
			return false;
		}
	});
	
	return false;
}

function showRequestDetail(request_id){
	//Get request detail from server
	$.ajax({
		type : "POST",
		url : "support-detail.html",
		data : {
			AJAX : '1',	
			request_id		: request_id
		},
		success : function(data) {
			data = $.trim(data);
			init_request_detail(data);
			return true;
		},
		error : function(e) {
			console.write('error: '+e);
			return false;
		}
	});
	
	return false;
}

function  init_request_reply_form(){
	$.ajax({
		type : "POST",
		url : "support-new.html",
		data : {
			AJAX : '1',	
			request_id		: request_id
		},
		success : function(data) {
			data = $.trim(data);
			init_request_detail(data);
			return true;
		},
		error : function(e) {
			console.write('error: '+e);
			return false;
		}
	});
	/*$('#new_request_reply_form').validate(
		{
			highlight: function(label) {
		    	$(label).closest('.control-group').addClass('error');
		    },
			success: function(label) {
		    	label
		    		.text('').addClass('icon-success valid')
		    		.closest('.control-group').addClass('has-success');
		    }, ignoreTitle: true
	}); */
	return false;
}

function saveReply(){
	//Get request detail from server
	$.ajax({
		type : "POST",
		url : "support-reply.html",
		data : {
			request_id		: $('#request_id').val(),
			reply			: $('#reply').val(),
			to_status_id	: $('#to_status_id').val(),
			from_status_id 	: $('#from_status_id').val(),
			AJAX : "1"
		},
		success : function(data) {
			data = $.trim(data);
			showRequestDetail($('#request_id').val());
			//init_request_detail(data);
			return true;
		},
		error : function(e) {
			console.write('error: '+e);
			return false;
		}
	});
	return false;
}

function getRequestList(type,id){
	var status_id=0;
	var service_id=0;
	
	if(type=="service")
		service_id = id;
	else
		status_id = id;
		
	//loading('support-requests-list');
	$.ajax({
		type : "POST",
		url : "support-requests.html",
		data : {
			AJAX : '1',	
			status_id	: status_id,
			service_id	: service_id
		},
		success : function(data) {
			data = $.trim(data);
			$('#support-requests-list').html(data);
			showRequestPanel("requests-list");
			init_request_list();
			return true;
		},
		error : function(e) {
			toastr.error(e,"Error");
			console.log('error: '+e);
			return false;
		}
	});	
	return false;
}

function init_request_list(){
	initAJAXPagination("support-requests-list",init_request_list);
	$(".requests tr").click(function() { 
		var request_id = $(this).attr( "data-target" );
		hideAllRequestPanel();				
		showRequestDetail(request_id);
	});
}

function initAJAXPagination(loading_element_id, func){
	
	$(".next-page").click(function() { 
		event.preventDefault();
		$('#'+loading_element_id).removeClass('animated fadeInLeft fadeInRight');
		//loading(loading_element_id);
		var url = $(this).attr( "href" );
		$.ajax({
			type : "POST",
			url : url,
			success : function(data) {
				data = $.trim(data);
				$('#'+loading_element_id).html(data);
				$('#'+loading_element_id).addClass('animated fadeInRight');
				func();
			},
			error : function(e) {
				toastr.error(e,"Error");
				console.write('error: '+e);
				return false;
			}
		});
		
	});
	
	$(".prev-page").click(function() { 
		event.preventDefault();
		$('#'+loading_element_id).removeClass('animated fadeInLeft fadeInRight');
		//loading(loading_element_id);
		var url = $(this).attr( "href" );
		$.ajax({
			type : "POST",
			url : url,
			success : function(data) {
				data = $.trim(data);
				$('#'+loading_element_id).html(data);
				$('#'+loading_element_id).addClass('animated fadeInLeft');
				func();
			},
			error : function(e) {
				toastr.error(e,"Error");
				console.write('error: '+e);
				return false;
			}
		});
		
	});
	
}

function displayMessage(element_id,message, type){
	$('#'+element_id).html("<div class='alert alert-danger'><button type='button' class='close' data-dismiss='alert' aria-hidden='true'>×</button><strong>Error!</strong> "+ message+ "</div>");
}

/*---------------------------------------------------Login-------------------------------------------------------------*/

function login(form) {
	$(document).ready(function(){
		var data = $(form).serialize();
		SendAjax("ajax/user-loginsubmit.html", data, function(data, html) {
			if (data['responseMessage'] == "Success") {
				location.href = "user-dashboard.html";
			} else {
				showError(data['responseMessage']);
			}
	
		}, function(message) {
			showError(message);
		});
	});
}
/*------------------------------Logout--------------------------------*/
function logout() {
	$(document).ready(function(){
	ShowConfirm("Do you really want to logout?", "Logout", function() {
		PostURL("user", "logout", null);
	}, null);

	return false;
	});
}
/*---------------Tab active and breadcrumb add-------------------*/
$(document).ready(function() {	
	//use to highlight selected tab which is Support
	$('#main-nav li').filter('.active').removeClass('active');
	switch($("#idPageName").text())
	{
	case "Dashboard":
		$('#idDashboard').addClass('active');
		break;
	case "Support":
		$('#idSupport').addClass('active');
		addBreadCrumbItem("Support Requests","/yf/support-request.html","active");
		break;
	case "Page Not Found":
		addBreadCrumbItem("404 Error","/yf/error-error404.html","active");
		break;
	}
	
});
/*--------------------------error----------------------------------------*/
function error() {
	$(document).ready(function(){		
		var data = null;
		SendAjax("ajax/user-profile.html", data, function(data, html) {
			if (data['responseMessage'] == "Success") {
				location.href = "error-error404.html";
				
			} else {
				showError(data['responseMessage']);
			}
	
		}, function(message) {			
			showError(message);
		});
	});
}
/*------------------------------Support : New Request Submit--------------------------------------*/
function supportSubmit(form)
{
	$(document).ready(function(){		
		var data = $(form).serialize();
		SendAjax("ajax/support-addsupportrequestajax.html", data, function(data1, html) {		
				location.href="error-success.html";	
		}, function(message) {			
			showError(message);
		});
	});

}


