package com.xebia.hrims.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.model.login.Login;

@Repository("loginDao")
public class LoginDao {

	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  public void insertLogin(Login Login) {
	    sessionFactory.getCurrentSession().save(Login);
	  }

	  public Login getLoginById(int LoginId) {
	    return (Login) sessionFactory.
	      getCurrentSession().
	      get(Login.class, LoginId);
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Login> getLogin(String userID) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.xebia.hrims.model.login.Login where emp_id = :emp_id");
	    query.setParameter("emp_id", userID);
	    return query.list();
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Login> getLogins() {
	    Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Login.class);
	    return criteria.list();
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Login> getLogin(String userID, String password) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.xebia.hrims.model.login.Login where emp_id = :emp_id and active = :active");
	    query.setParameter("emp_id", userID);
/*	    query.setParameter("password", password);*/
	    query.setParameter("active", true);
	    return query.list();
	  }
	  
}
