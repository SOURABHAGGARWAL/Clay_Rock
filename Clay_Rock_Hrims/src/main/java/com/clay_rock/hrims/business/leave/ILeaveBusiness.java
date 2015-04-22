package com.clay_rock.hrims.business.leave;

import java.util.List;

import com.clay_rock.hrims.model.leave.Leave;
import com.clay_rock.hrims.model.leave.Type;
import com.clay_rock.hrims.model.leave.status;


public interface ILeaveBusiness {

	public List<Type> getAllTypeOfLeaves();
	
	public boolean applyLeave(Leave leave);
	
	public List<Leave> getEmployeeLeave(String empID);
	
	public List<status> getLeaveStatusList();
	
	public List<Leave> getLeavePendingForApproval(String empID);
	
	public List<Leave> getEmployeeLeaveForApproval(String notifyToId);

}
