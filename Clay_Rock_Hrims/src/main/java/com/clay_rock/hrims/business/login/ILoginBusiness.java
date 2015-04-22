package com.clay_rock.hrims.business.login;

import com.clay_rock.hrims.model.login.Login;


public interface ILoginBusiness {

	public Login isValidUser(String userID, String password);

}
