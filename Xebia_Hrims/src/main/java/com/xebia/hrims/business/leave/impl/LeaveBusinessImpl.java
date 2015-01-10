package com.xebia.hrims.business.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leave.ILeaveBusiness;
import com.xebia.hrims.dao.leave.ILeaveDao;
import com.xebia.hrims.dao.leave.IStatusDao;
import com.xebia.hrims.dao.leave.ITypeDao;
import com.xebia.hrims.model.leave.Leave;
import com.xebia.hrims.model.leave.Type;
import com.xebia.hrims.model.leave.status;

@Service("leaveBusiness")
public class LeaveBusinessImpl implements ILeaveBusiness {

	@Autowired
	private ITypeDao typedao;
	
	@Autowired
	private IStatusDao leaveStatusDao;
	
	@Autowired
	private ILeaveDao leaveDao;
	
	public List<Type> getAllTypeOfLeaves(){
		return typedao.getTypeOfLeaves();
	}
	
	public boolean applyLeave(Leave leave){
		return leaveDao.applyLeave(leave);
	}
	
	public List<Leave> getEmployeeLeave(String empID){
		return leaveDao.getEmployeeLeave(empID);
	}

	@Override
	public List<status> getLeaveStatusList() {
		return leaveStatusDao.getAllLeavesStatus();
	}
	
	@Override
	public List<Leave> getLeavePendingForApproval(String empID) {
		return leaveDao.getLeavePendingForApproval(empID);
	}

}
