package com.xebia.hrims.dao.leave.impl;

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
}
