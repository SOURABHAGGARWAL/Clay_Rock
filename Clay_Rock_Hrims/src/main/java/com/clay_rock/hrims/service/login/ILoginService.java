package com.clay_rock.hrims.service.login;

import com.clay_rock.hrims.model.login.Login;

public interface ILoginService {

	public Login isValidUser(String userID, String password);

}
