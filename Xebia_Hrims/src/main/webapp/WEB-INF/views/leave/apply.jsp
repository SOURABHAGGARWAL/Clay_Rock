<jsp:include page="../global/header.jsp"></jsp:include>
 <script>
$(function() {
	$("#startDate").datepicker();
	$("#endDate").datepicker();
});
</script>
	<form action="applyLeave.do" method="get">
		<table>
<%-- 			<tr>
				<td><label>Type :</label></td>
				<td><select name="leaveType" id="leaveType">
						<c:forEach var="listValue" items="${leaves}">
							<c:set var="leave" value="${fn:split(listValue, ',')}" />
							<option value="${leave[0]}">${leave[2]}</option>
						</c:forEach>
				</select></td>
			</tr> --%>
			<tr>
				<td><label> Start Date : </label></td>
				<td>
					<div class="input-group">
						<span class="input-group-addon datepickerbutton"> <span
							class="glyphicon glyphicon-calendar"></span>
						</span> 
						<input type='text' class="form-control" id="startDate" name="startDate" /> 
						<span class="input-group-addon"> 
							<span class="glyphicon glyphicon-remove"></span>
						</span>
					</div>
				</td>
				<td style="padding-left: 10px;">
					<label><input type="radio" name="startDateTime" value="fullday" checked="checked">Full day</label> 
					<label><input type="radio" name="startDateTime" value="firsthalf">FN</label> 
					<label><input type="radio" name="startDateTime" value="secondhalf">AN</label>
				</td>
			</tr>
			<tr>
				<td><label> End Date : </label></td>
				<td>
					<div class="input-group">
						<span class="input-group-addon datepickerbutton"> <span
							class="glyphicon glyphicon-calendar"></span>
						</span> <input type='text' class="form-control" id="endDate"
							name="endDate" /> <span class="input-group-addon"> <span
							class="glyphicon glyphicon-remove"></span>
						</span>
					</div>
				</td>
				<td style="padding-left: 10px;">
					<label><input type="radio" name="endDateTime" value="fullday" checked="checked">Full day</label> 
					<label><input type="radio" name="endDateTime" value="firsthalf">FN</label> 
					<label><input type="radio" name="endDateTime" value="secondhalf">AN</label>
				</td>
			</tr>
			<tr>
				<td><label>Reason : </label></td>
				<td><textarea rows="4" cols="50" name="reason" id="reason" placeholder="Enter Reason"></textarea></td>
			</tr>
			<tr>
				<td><label>Handover To : </label></td>
				<td><input type="text" name="handoverTo" id="handoverTo" placeholder="Employee ID"></td>
			</tr>
			<tr>
				<td><label>Employee To Notify : <label></td>
				<td><input type="text" name="notify" id="notify" placeholder="Employee Name"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-primary" value="Submit"></td>
			</tr>
		</table>
	</form>
<jsp:include page="../global/footer.jsp"></jsp:include>