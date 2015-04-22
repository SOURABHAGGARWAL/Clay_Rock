package com.clay_rock.hrims.dao.leave;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.leave.status;

public interface IStatusDao extends IDAO<status>{
	
	public List<status> getAllLeavesStatus();
	
}
