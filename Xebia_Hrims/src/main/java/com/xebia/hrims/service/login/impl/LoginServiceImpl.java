package com.xebia.hrims.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.service.login.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginBusiness loginbusiness;
	
	public Boolean isValidUser(String userID, String password){
		return loginbusiness.isValidUser(userID, password);
	}

}
