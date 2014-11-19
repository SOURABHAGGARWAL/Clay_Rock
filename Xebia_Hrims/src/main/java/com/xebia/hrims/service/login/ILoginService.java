package com.xebia.hrims.service.login;

import com.xebia.hrims.model.login.Login;

public interface ILoginService {

	public Login isValidUser(String userID, String password);

}
