package com.clay_rock.hrims.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.login.ILoginBusiness;
import com.clay_rock.hrims.model.login.Login;
import com.clay_rock.hrims.service.login.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginBusiness loginbusiness;
	
	public Login isValidUser(String userID, String password){
		return loginbusiness.isValidUser(userID, password);
	}

}
