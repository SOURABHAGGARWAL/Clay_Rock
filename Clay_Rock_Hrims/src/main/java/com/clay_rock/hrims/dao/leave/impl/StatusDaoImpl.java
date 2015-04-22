package com.clay_rock.hrims.dao.leave.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.leave.IStatusDao;
import com.clay_rock.hrims.model.leave.status;

@Repository("leaveStatusDao")
public class StatusDaoImpl extends DAOImpl<status> implements IStatusDao{

	  public StatusDaoImpl() {
		super(status.class);
	  }

	@Override
	public List<status> getAllLeavesStatus() {
		try{
			List<status> leaveStatus = findAll();
			return leaveStatus;
		} catch (Exception e) {
			System.out.println("Error while getting leave "+e.getMessage());
			return new ArrayList<status>();
		}
	}
}
