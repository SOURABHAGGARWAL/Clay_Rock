package com.xebia.hrims.dao.leave;

import java.util.List;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.leave.status;

public interface IStatusDao extends IDAO<status>{
	
	public List<status> getAllLeavesStatus();
	
}
