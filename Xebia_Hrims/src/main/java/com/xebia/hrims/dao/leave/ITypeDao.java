package com.xebia.hrims.dao.leave;

import java.util.List;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.leave.Type;

public interface ITypeDao extends IDAO<Type>{
	
	public List<Type> getTypeOfLeaves();
	
}
