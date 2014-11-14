package com.xebia.hrims.business.login.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.dao.LoginDao;
import com.xebia.hrims.model.login.Login;

@Service("loginBusiness")
public class LoginBusinessImpl implements ILoginBusiness {

	@Autowired
	private LoginDao logindao;
	
	@Transactional
	public Boolean isValidUser(String userID, String password){
		List<Login> loginList = logindao.getLogin(userID, password);
		if(loginList.size()>=1){
			return true;
		}else {
			return false;
		}
	}

}
