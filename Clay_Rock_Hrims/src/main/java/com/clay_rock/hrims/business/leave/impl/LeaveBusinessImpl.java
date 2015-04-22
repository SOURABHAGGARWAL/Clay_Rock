package com.clay_rock.hrims.business.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.leave.ILeaveBusiness;
import com.clay_rock.hrims.dao.leave.ILeaveDao;
import com.clay_rock.hrims.dao.leave.IStatusDao;
import com.clay_rock.hrims.dao.leave.ITypeDao;
import com.clay_rock.hrims.model.leave.Leave;
import com.clay_rock.hrims.model.leave.Type;
import com.clay_rock.hrims.model.leave.status;

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
	
	@Override
	public List<Leave> getEmployeeLeaveForApproval(String notifyID) {
		return leaveDao.getEmployeeLeaveForApproval(notifyID);
	}

}
