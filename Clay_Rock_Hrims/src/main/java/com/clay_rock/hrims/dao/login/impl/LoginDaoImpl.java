package com.clay_rock.hrims.dao.login.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.login.ILoginDao;
import com.clay_rock.hrims.model.login.Login;

@Repository("loginDao")
public class LoginDaoImpl extends DAOImpl<Login> implements ILoginDao{

	  public LoginDaoImpl() {
		super(Login.class);
	  }

	  @Override
	  public Login getLogin(String userID, String password) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.clay_rock.hrims.model.login.Login where emp_id = :emp_id and password = :password and active = :active");
	    query.setParameter("emp_id", userID);
	    query.setParameter("password", password);
	    query.setParameter("active", true);
	    if(query.list().size()>=1){
	    	return (Login) query.list().get(0);
	    }else{
	    	return null;
	    }
	    
	  }
}
