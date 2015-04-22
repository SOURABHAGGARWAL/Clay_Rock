<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../global/header.jsp"></jsp:include>
<div style="float:left;min-width:48%;margin-right:1%;margin-left:1%;">
	<div class="dashlet-container">
	    <div class="panel panel-default">
			<div class="panel-heading"><b>Xebia Events</b></div>
			<div class="panel-body"><a href="../lms/applyLeave.clay_rock"><button class='btn btn-primary'>APPLY OL</button></a></div>
			<div class="list-group" style="max-height:300px;overflow-y:scroll;">
				<c:forEach var="event" items="${events}">
				<a href="#" class="list-group-item">${event.getName()}<span class="badge">${event.getDate()}</span></a>
			</c:forEach>
			</div>
		</div>
	</div>
</div>
<div style="float:left;min-width:48%;margin-right:1%;margin-left:1%;">
	<div class="dashlet-container">
	    <div class="panel panel-default">
			<div class="panel-heading"><b>Weekly Attendence</b></div>
			<div class="panel-body"><a href="../lms/applyLeave.clay_rock"><button class="btn btn-primary">APPLY LEAVE</button></a> <a href="../lms/cancelLeave.clay_rock"><button class="btn btn-primary">CANCEL LEAVE</button></a></div>
			<div class="list-group" style="max-height:300px;overflow-y:scroll;">
				<a href="#" class="list-group-item">Monday<span class="badge">P</span><span class="badge">9:45</span>
				</a>
				<a href="#" class="list-group-item">Tuesday<span class="badge">P</span><span class="badge">8:45</span>
				</a>
				<a href="#" class="list-group-item">Wednesday<span class="badge">P</span><span class="badge">9:00</span>
				</a>  
				<a href="#" class="list-group-item">Thursday<span class="badge">P</span><span class="badge">8:01</span>
				</a>
				<a href="#" class="list-group-item">Friday<span class="badge">P</span><span class="badge">10:00</span>
				</a>
			</div>
		</div>
	</div>
</div>

<div style="float:left;min-width:48%;margin-right:1%;margin-left:1%;">
	<div class="dashlet-container">
	    <div class="panel panel-default">
			<div class="panel-heading"><b>New Joinee</b></div>
			<div class="list-group" style="max-height:300px;overflow-y:scroll;">
				<a href="#" class="list-group-item">Pradeep Arya <span class="badge">12-JUNE-2014</span>
				</a>
				<a href="#" class="list-group-item">Rahul Oberoi <span class="badge">12-AUGUST-2014</span>
				</a>
				<a href="#" class="list-group-item">Harsh Jain <span class="badge">12-JULY-2014</span>
				</a>  
				<a href="#" class="list-group-item">Gurinder Singh <span class="badge">12-SEPTEMBER-2014</span>
				</a>
				<a href="#" class="list-group-item">Sourabh Aggarwal <span class="badge">28-OCTOBER-2014</span>
				</a>
			</div>
		</div>
	</div>
</div>
<div style="float:left;min-width:48%;margin-right:1%;margin-left:1%;">
	<div class="dashlet-container">
	    <div class="panel panel-default">
			<div class="panel-heading"><b>Hoildays</b></div>
			<div class="list-group" style="max-height:300px;overflow-y:scroll;">
				<a href="#" class="list-group-item">Diwali Celebration<span class="badge">12-JUNE-2014</span>
				</a>
				<a href="#" class="list-group-item">Birthday Celebration<span class="badge">12-AUGUST-2014</span>
				</a>
				<a href="#" class="list-group-item">Organization Day<span class="badge">12-JULY-2014</span>
				</a>  
				<a href="#" class="list-group-item">New Year Party<span class="badge">12-SEPTEMBER-2014</span>
				</a>
				<a href="#" class="list-group-item">Christmas Party<span class="badge">28-OCTOBER-2014</span>
				</a>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../global/footer.jsp"></jsp:include>