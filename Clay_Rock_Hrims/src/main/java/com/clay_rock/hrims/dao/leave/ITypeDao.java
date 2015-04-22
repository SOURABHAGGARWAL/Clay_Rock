package com.clay_rock.hrims.dao.leave;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.leave.Type;

public interface ITypeDao extends IDAO<Type>{
	
	public List<Type> getTypeOfLeaves();
	
}
