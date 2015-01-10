package com.xebia.hrims.business.leave;

import java.util.List;

import com.xebia.hrims.model.leave.Leave;
import com.xebia.hrims.model.leave.Type;
import com.xebia.hrims.model.leave.status;


public interface ILeaveBusiness {

	public List<Type> getAllTypeOfLeaves();
	
	public boolean applyLeave(Leave leave);
	
	public List<Leave> getEmployeeLeave(String empID);
	
	public List<status> getLeaveStatusList();
	
	public List<Leave> getLeavePendingForApproval(String empID);

}
