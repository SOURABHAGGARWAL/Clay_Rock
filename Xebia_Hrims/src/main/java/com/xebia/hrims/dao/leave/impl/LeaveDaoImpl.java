package com.xebia.hrims.dao.leave.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.dao.crud.impl.DAOImpl;
import com.xebia.hrims.dao.leave.ILeaveDao;
import com.xebia.hrims.model.leave.Leave;

@Repository("leaveDao")
public class LeaveDaoImpl extends DAOImpl<Leave> implements ILeaveDao{

	  public LeaveDaoImpl() {
		super(Leave.class);
	  }

	@Override
	public boolean applyLeave(Leave leave) {
		try{
			create(leave);
			return true;
		} catch (Exception e) {
			System.out.println("Error while saving leave "+e.getMessage());
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Leave> getEmployeeLeave(String empID) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.xebia.hrims.model.leave.Leave where emp_id = :emp_id");
	    query.setParameter("emp_id", empID);;
	    if(query.list().size() >= 1){
	    	return query.list();
	    }else{
	    	return new ArrayList<Leave>();
	    }
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Leave> getLeavePendingForApproval(String empID) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.xebia.hrims.model.leave.Leave where emp_id = :emp_id and status_of_leave = :status_of_leave");
	    query.setParameter("emp_id", empID);
	    query.setParameter("status_of_leave", 2);
	    if(query.list().size() >= 1){
	    	return query.list();
	    }else{
	    	return new ArrayList<Leave>();
	    }
	}
}
