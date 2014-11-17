package com.xebia.hrims.dao.login;

import java.util.List;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.login.Login;

public interface ILoginDao extends IDAO<Login>{
	
	public List<Login> getLogin(String userID, String password);
	
}
