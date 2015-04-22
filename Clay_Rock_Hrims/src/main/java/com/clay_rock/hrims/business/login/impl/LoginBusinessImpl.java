package com.clay_rock.hrims.business.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.login.ILoginBusiness;
import com.clay_rock.hrims.dao.login.ILoginDao;
import com.clay_rock.hrims.model.login.Login;

@Service("loginBusiness")
public class LoginBusinessImpl implements ILoginBusiness {

	@Autowired
	private ILoginDao logindao;
	
	public Login isValidUser(String userID, String password){
		return logindao.getLogin(userID, password);
	}

}
