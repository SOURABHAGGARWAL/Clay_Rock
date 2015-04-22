package com.clay_rock.hrims.dao.leave;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.leave.Leave;

public interface ILeaveDao extends IDAO<Leave>{
	
	public boolean applyLeave(Leave leave);

	public List<Leave> getEmployeeLeave(String empID);
	
	public List<Leave> getLeavePendingForApproval(String empID);
	
	public List<Leave> getEmployeeLeaveForApproval(String notifyToID);
	
}
