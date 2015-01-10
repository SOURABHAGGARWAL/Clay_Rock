package com.xebia.hrims.service.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leave.ILeaveBusiness;
import com.xebia.hrims.model.leave.Leave;
import com.xebia.hrims.model.leave.Type;
import com.xebia.hrims.model.leave.status;
import com.xebia.hrims.service.leave.ILeaveService;

@Service("leaveService")
public class LeaveServiceImpl implements ILeaveService {

	@Autowired
	private ILeaveBusiness leavebusiness;
	
	public List<Type> getAllTypeOfLeaves(){
		return leavebusiness.getAllTypeOfLeaves();
	}
	
	public boolean applyLeave(Leave leave){
		return leavebusiness.applyLeave(leave);
	}
	
	public List<Leave> getEmployeeLeave(String empID){
		return leavebusiness.getEmployeeLeave(empID);
	}

	@Override
	public List<status> getLeaveStatusList() {
		return leavebusiness.getLeaveStatusList();
	}
	
	@Override
	public List<Leave> getLeavePendingForApproval(String empID) {
		return leavebusiness.getLeavePendingForApproval(empID);
	}
	
}
