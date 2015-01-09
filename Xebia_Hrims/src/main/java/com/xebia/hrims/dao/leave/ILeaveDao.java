package com.xebia.hrims.dao.leave;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.leave.Leave;

public interface ILeaveDao extends IDAO<Leave>{
	
	public boolean applyLeave(Leave leave);
	
}
