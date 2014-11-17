package com.xebia.hrims.dao.login.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.dao.crud.impl.DAOImpl;
import com.xebia.hrims.dao.login.ILoginDao;
import com.xebia.hrims.model.login.Login;

@Repository("loginDao")
public class LoginDaoImpl extends DAOImpl<Login> implements ILoginDao{

	  public LoginDaoImpl() {
		super(Login.class);
	  }

	  @Override
	  @SuppressWarnings("unchecked")
	  public List<Login> getLogin(String userID, String password) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.xebia.hrims.model.login.Login where emp_id = :emp_id and password = :password and active = :active");
	    query.setParameter("emp_id", userID);
	    query.setParameter("password", password);
	    query.setParameter("active", true);
	    return query.list();
	  }
}
