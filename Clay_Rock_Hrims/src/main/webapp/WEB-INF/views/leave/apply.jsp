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
function afterSubmitAction(){
	location.reload();
}
</script>

<div style="margin:10px 10px 10px 10px;">
<table id="employeeLeave" class="table table-striped table-bordered" width="100%" cellspacing="0">
	<thead>
        <tr>
        	<th>#</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Number Of Leaves</th>
            <th>Reason Of Leave</th>
            <th>Handover To</th>
            <th>Notify To</th>
            <th>Leave Status</th>
            <th>Type Of Leave</th>
        </tr>
    </thead>
	<c:forEach var="employeeLeave" items="${employeeLeaves}">
		<tr>
			<td></td>
			<td>${employeeLeave.getFormattedStartDate()}</td>
			<td>${employeeLeave.getFormattedEndDate()}</td>
			<td>${employeeLeave.getNumberOfLeaves()}</td>
			<td>${employeeLeave.getReasonOfLeaves()}</td>
			<td>${employeeLeave.getHandoverTo()}</td>
			<td>${employeeLeave.getNotifyTo()}</td>
			<td>
<%-- 				<c:forEach var="statusOfLeave" items="${leaveStatusList}">
					<c:if test="${statusOfLeave.getId() == employeeLeave.getStatusOfLeave()}"> --%>
						${employeeLeave.getStatusOfLeave()}
<%-- 					</c:if>
				</c:forEach> --%>
			</td>
			<c:forEach var="typeOfLeave" items="${typeOfLeaves}">
				<c:if test="${typeOfLeave.getId() == employeeLeave.getTypeOfLeave()}">
					<td>${typeOfLeave.getInfo()}</td>
				</c:if>
			</c:forEach>
		</tr>
	</c:forEach>
</table>
</div>

<HR WIDTH=100% size=7 ALIGN=CENTER color="black">

<div class="container">
<c:if test="${message ne null}">
	<script>
	$(document).ready(function(){
		var messge = ${message};
		alert(messge);
	});
	</script>
</c:if>
	<form action="applyLeaveSubmit.clay_rock" method="post">
	
			<div class="row">
				<div class='col-sm-2'>
				<label>Type :</label>
				</div>
		        <div class='col-sm-3'>
		            <div class="form-group">
		                <div class='input-group'>
		                <select name="typeOfLeave" id="typeOfLeave" class="form-control">
								<c:forEach var="typeOfLeave" items="${typeOfLeaves}">
									<option value="${typeOfLeave.getId()}">${typeOfLeave.getInfo()}</option>
								</c:forEach>
						</select>
		                </div>
		            </div>
		        </div>
		    </div>
		    
		    <div class="row">
				<div class='col-sm-2'>
				<label>Start Date :</label>
				</div>
		        <div class='col-sm-3'>
		            <div class="form-group">
		                <div class='input-group'>
						<input type='text' class="form-control" class="form-control" id="startDate" name="startDate" /> 
		                </div>
		            </div>
		        </div>
		        <div class='col-sm-3'>
						<label><input type="radio" name="startDateTime" value="fullday" checked="checked">Full day</label> 
						<label><input type="radio" name="startDateTime" value="firsthalf">FN</label> 
						<label><input type="radio" name="startDateTime" value="secondhalf">AN</label>
		        </div>
		    </div>
		    
		    <div class="row">
				<div class='col-sm-2'>
				<label>End Date :</label>
				</div>
		        <div class='col-sm-3'>
		            <div class="form-group">
		                <div class='input-group'>
						<input type='text' class="form-control" class="form-control" id="endDate" name="endDate" /> 
		                </div>
		            </div>
		        </div>
		        <div class='col-sm-3'>
						<label><input type="radio" name="endDateTime" value="fullday" checked="checked">Full day</label> 
						<label><input type="radio" name="endDateTime" value="firsthalf">FN</label> 
						<label><input type="radio" name="endDateTime" value="secondhalf">AN</label>
		        </div>
		    </div>
		    
		    <div class="row">
				<div class='col-sm-2'>
				<label>Reason :</label>
				</div>
		        <div class='col-sm-3'>
		            <div class="form-group">
		                <div class='input-group'>
		                	<textarea rows="4" cols="50" class="form-control" name="reasonOfLeaves" id="reasonOfLeaves" placeholder="Reason of leave"></textarea>
		                </div>
		            </div>
		        </div>
		    </div>
		    
		    <div class="row">
				<div class='col-sm-2'>
				<label>Handover To :</label>
				</div>
		        <div class='col-sm-3'>
		            <div class="form-group">
		                <div class='input-group'>
							<input type="text" class="form-control" name="handoverTo" id="handoverTo" placeholder="Employee ID">
						</div>
		            </div>
		        </div>
		    </div>
			
			<div class="row">
				<div class='col-sm-2'>
					<div class="form-group">
						<input class="form-control btn-primary" type="submit" class="btn btn-primary" value="Submit" onclick="afterSubmitAction();">
					</div>
				</div>
			</div>
	</form>
</div>
<HR WIDTH=100% size=7 ALIGN=CENTER color="black">
<jsp:include page="../global/footer.jsp"></jsp:include>