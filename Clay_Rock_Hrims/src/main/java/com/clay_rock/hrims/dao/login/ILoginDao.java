package com.clay_rock.hrims.dao.login;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.login.Login;

public interface ILoginDao extends IDAO<Login>{
	
	public Login getLogin(String userID, String password);
	
}
