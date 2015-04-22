<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../global/header.jsp"></jsp:include>
	<script>
	$(document).ready(function() {
	    $('#employeeLeave').dataTable();
	} );
	</script>
	
	
	<div style="margin:10px 10px 10px 10px;">
	
	Hi your ${leavePendingForApprovalNumber} leaves are pending for approval!!!!!
	
	<table id="employeeLeave" class="table table-striped table-bordered" width="100%" cellspacing="0">
		<thead>
	        <tr>
	        	<th>#</th>
	            <th>Total Number Of Leave</th>
	            <th>Total Number Of Leave Taken</th>
	            <th>Pending Leaves</th>
	            <th>Type Of Leave</th>
	            <th>Leave Description</th>
	        </tr>
	    </thead>
		<c:forEach var="employeeLeaveDetail" items="${employeeLeavesDetail}">
			<tr>
				<td></td>
				<td>${employeeLeaveDetail.getTotalNumberOfLeave()}</td>
				<td>${employeeLeaveDetail.getTotalNumberOfLeaveTaken()}</td>
				<td>${employeeLeaveDetail.getPendingLeaves()}</td>
				<c:forEach var="typeOfLeave" items="${typeOfLeaves}">
					<c:if test="${typeOfLeave.getId() eq employeeLeaveDetail.getTypeOfLeave()}">
						<td>
							${typeOfLeave.getInfo()}
						</td>
						<td>
							${typeOfLeave.getDescription()}
						</td>
					</c:if>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	</div>
<jsp:include page="../global/footer.jsp"></jsp:include>