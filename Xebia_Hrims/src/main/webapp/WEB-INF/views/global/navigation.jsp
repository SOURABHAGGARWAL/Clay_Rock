<nav role="navigation" class="navbar navbar-default" style="font-weight: bold; ">
	<div class="navbar-header">
		<button type="button" data-target="#navbarCollapse"
			data-toggle="collapse" class="navbar-toggle">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a href="<%=request.getContextPath()%>/user/dashboard.xebia" class="navbar-brand" style="font-weight: bold;">HRIMS</a>
	</div>
	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="<%=request.getContextPath()%>/user/dashboard.xebia"
				style="margin-right: 20px;">Home</a></li>
			<li><a href="<%=request.getContextPath()%>/my-profile/details.xebia">My Profile</a></li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Attendance <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/attendance/myAttendance.xebia">My Attendance</a></li>
					<li><a href="<%=request.getContextPath()%>/attendance/attendanceRegulaization.xebia">Attendance Regularization</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Leaves <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/lms/applyLeave.xebia">Apply Leave</a></li>
					<li><a href="<%=request.getContextPath()%>/lms/cancelLeave.xebia">Cancel Leave</a></li>
					<li><a href="<%=request.getContextPath()%>/lms/myLeaveRecord.xebia">My Leave Balance</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">HR <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/hr/createNewEmployee.xebia">Create New Employee</a></li>
					<li><a href="<%=request.getContextPath()%>/hr/leaveRequests.xebia">Leave Requests</a></li>
					<li><a href="<%=request.getContextPath()%>/hr/uploadNewPolicies.xebia">Upload New Policies</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Self Service <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/selfService/myOfferLetter.xebia">My Offer Letter</a></li>
					<li><a href="<%=request.getContextPath()%>/selfService/mySalarySlip.xebia">My Salary Slip</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Project Management <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/projectManagement/createNewCustomer.xebia">Create New Customer</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/createNewProject.xebia">Create New Project</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/customerFeedback.xebia">Customer Feedback</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/resourceAllocation.xebia">Resource Allocation</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/resourceOnBench.xebia">Resource On Bench</a></li>
					<li><a href="<%=request.getContextPath()%>/projectManagement/leaveRequests.xebia">Leave Requests</a></li>
				</ul>
			</li>
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#">Admin <b class="caret"></b></a>
				<ul role="menu" class="dropdown-menu">
					<li><a href="<%=request.getContextPath()%>/admin/uploadAttendence.xebia">Upload Attendance</a></li>
					<li><a href="<%=request.getContextPath()%>/admin/backupDatabase.xebia">Backup Database</a></li>
					<li><a href="<%=request.getContextPath()%>/admin/backupData.xebia">Backup Data</a></li>
					<li><a href="<%=request.getContextPath()%>/admin/siteAtMaintenance.xebia">Site At Maintenance</a></li>
				</ul>
			</li>
			<li><a href="<%=request.getContextPath()%>/organisation/policies.xebia">HR Policies</a></li>
		</ul>
<!-- 		<form role="search" class="navbar-form navbar-left">
			<div class="form-group">
				<input type="text" placeholder="Search" class="form-control">
			</div>
		</form> -->
		<ul class="nav navbar-nav navbar-right">
			<li><a href="<%=request.getContextPath()%>/logout.xebia" style="margin-right: 20px; font-weight: bold;">Logout</a></li>
		</ul>
	</div>
</nav>