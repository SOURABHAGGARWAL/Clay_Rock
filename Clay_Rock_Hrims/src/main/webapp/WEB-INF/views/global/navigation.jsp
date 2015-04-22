<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav role="navigation" class="navbar navbar-default" style="font-weight: bold; ">
	<div class="navbar-header">
		<button type="button" data-target="#navbarCollapse"
			data-toggle="collapse" class="navbar-toggle">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a href="<%=request.getContextPath()%>/user/dashboard.clay_rock" class="navbar-brand" style="font-weight: bold;">HRIMS</a>
	</div>
	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="<%=request.getContextPath()%>/user/dashboard.clay_rock"
				style="margin-right: 20px;">Home</a></li>
			<li><a href="<%=request.getContextPath()%>/my-profile/details.clay_rock">My Profile</a></li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Attendance <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/attendance/myAttendance.clay_rock">My Attendance</a></li>
					<li><a href="<%=request.getContextPath()%>/attendance/attendanceRegulaization.clay_rock">Attendance Regularization</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Leaves <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/lms/applyLeave.clay_rock">Apply Leave</a></li>
					<li><a href="<%=request.getContextPath()%>/lms/cancelLeave.clay_rock">Cancel Leave</a></li>
					<li><a href="<%=request.getContextPath()%>/lms/myLeaveRecord.clay_rock">My Leave Balance</a></li>
				</ul>
			</li>
			
			<c:if test="${login.getRoleId() eq 1}">
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">HR <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/hr/createNewEmployee.clay_rock">Create New Employee</a></li>
					<li><a href="<%=request.getContextPath()%>/hr/leaveRequests.clay_rock">Leave Requests</a></li>
					<li><a href="<%=request.getContextPath()%>/hr/uploadNewPolicies.clay_rock">Upload New Policies</a></li>
				</ul>
			</li>
			</c:if>
			
			
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Self Service <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/selfService/myOfferLetter.clay_rock">My Offer Letter</a></li>
					<li><a href="<%=request.getContextPath()%>/selfService/mySalarySlip.clay_rock">My Salary Slip</a></li>
				</ul>
			</li>
			
			<c:if test="${login.getRoleId() eq 4}">
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Project Management <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/projectManagement/createNewCustomer.clay_rock">Create New Customer</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/createNewProject.clay_rock">Create New Project</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/customerFeedback.clay_rock">Customer Feedback</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/resourceAllocation.clay_rock">Resource Allocation</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/resourceOnBench.clay_rock">Resource On Bench</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/leaveRequests.clay_rock">Leave Requests</a></li>
				</ul>
			</li>
			</c:if>
			
			<c:if test="${login.getRoleId() eq 3}">
				<li class="dropdown">
				<a data-toggle="dropdown" class="dropdown-toggle" href="#">Admin <b class="caret"></b></a>
					<ul role="menu" class="dropdown-menu">
						<li><a href="<%=request.getContextPath()%>/admin/uploadAttendence.clay_rock">Upload Attendance</a></li>
						<li><a href="<%=request.getContextPath()%>/admin/backupDatabase.clay_rock">Backup Database</a></li>
						<li><a href="<%=request.getContextPath()%>/admin/backupData.clay_rock">Backup Data</a></li>
						<li><a href="<%=request.getContextPath()%>/admin/siteAtMaintenance.clay_rock">Site At Maintenance</a></li>
					</ul>
				</li>
			</c:if>
			<li><a href="<%=request.getContextPath()%>/organisation/policies.clay_rock">HR Policies</a></li>
		</ul>
<!-- 		<form role="search" class="navbar-form navbar-left">
			<div class="form-group">
				<input type="text" placeholder="Search" class="form-control">
			</div>
		</form> -->
		<ul class="nav navbar-nav navbar-right">
			<li><a href="<%=request.getContextPath()%>/logout.clay_rock" style="margin-right: 20px; font-weight: bold;">Logout</a></li>
		</ul>
	</div>
</nav>