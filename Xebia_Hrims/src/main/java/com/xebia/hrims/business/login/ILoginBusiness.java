package com.xebia.hrims.business.login;

import com.xebia.hrims.model.login.Login;


public interface ILoginBusiness {

	public Login isValidUser(String userID, String password);

}
