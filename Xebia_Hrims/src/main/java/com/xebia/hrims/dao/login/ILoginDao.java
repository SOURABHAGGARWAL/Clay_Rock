package com.xebia.hrims.dao.login;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.login.Login;

public interface ILoginDao extends IDAO<Login>{
	
	public Login getLogin(String userID, String password);
	
}
