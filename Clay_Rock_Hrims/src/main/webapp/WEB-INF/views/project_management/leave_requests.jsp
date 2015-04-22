<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../global/header.jsp"></jsp:include>
 	<script>
	$(function() {
		$("#startDate").datepicker();
		$("#endDate").datepicker();
	});
	$(document).ready(function() {
	    $('#employeeLeave').dataTable();
	} );
	</script>
	
	<div style="margin:10px 10px 10px 10px;">
	<table id="employeeLeave" class="table table-striped table-bordered" width="100%" cellspacing="0">
		<thead>
	        <tr>
	        	<th>Employee Id</th>
	            <th>Start Date</th>
	            <th>End Date</th>
	            <th>Number Of Leaves</th>
	            <th>Reason Of Leave</th>
	            <th>Handover To</th>
	            <th>Notify To</th>
	            <th>Leave Status</th>
	            <th>Type Of Leave</th>
	            <th>Action</th>
	        </tr>
	    </thead>
		<c:forEach var="employeeLeave" items="${listOfleavesForApproval}">
			<tr>
				<td>${employeeLeave.getEmp_id()}</td>
				<td>${employeeLeave.getFormattedStartDate()}</td>
				<td>${employeeLeave.getFormattedEndDate()}</td>
				<td>${employeeLeave.getNumberOfLeaves()}</td>
				<td>${employeeLeave.getReasonOfLeaves()}</td>
				<td>${employeeLeave.getHandoverTo()}</td>
				<td>${employeeLeave.getNotifyTo()}</td>
				<td>${employeeLeave.getStatusOfLeave()}</td>
				<td>
					<c:forEach var="typeOfLeave" items="${typeOfLeaves}">
						<c:if test="${typeOfLeave.getId() eq employeeLeave.getTypeOfLeave()}">
							${typeOfLeave.getInfo()}
						</c:if>
					</c:forEach>
				</td>
				<td>
					<c:if test="${employeeLeave.getStatusOfLeave() eq 2}">
						<button type="button" class="btn btn-primary" aria-label="Left Align">App</button>
						<button type="button" class="btn btn-primary" aria-label="Left Align">Rej</button>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
<jsp:include page="../global/footer.jsp"></jsp:include>