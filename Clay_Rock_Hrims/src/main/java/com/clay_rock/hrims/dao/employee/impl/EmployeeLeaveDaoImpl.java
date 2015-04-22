package com.clay_rock.hrims.dao.employee.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.employee.IEmployeeLeaveDao;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;

@Repository("employeeLeaveDao")
public class EmployeeLeaveDaoImpl extends DAOImpl<EmployeeLeaveDetails> implements IEmployeeLeaveDao{

	  public EmployeeLeaveDaoImpl() {
		super(EmployeeLeaveDetails.class);
	  }

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID) {
	    Query query = sessionFactory.getCurrentSession().createQuery("from com.clay_rock.hrims.model.employee.EmployeeLeaveDetails where emp_id = :emp_id");
	    query.setParameter("emp_id", empID);;
	    if(query.list().size() >= 1){
	    	return query.list();
	    }else{
	    	return new ArrayList<EmployeeLeaveDetails>();
	    }
	}

}
