package com.clay_rock.hrims.business.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.employee.IEmployeeLeaveBusiness;
import com.clay_rock.hrims.dao.employee.IEmployeeContactDetailsDao;
import com.clay_rock.hrims.dao.employee.IEmployeeLeaveDao;
import com.clay_rock.hrims.dao.employee.IEmployeePersonalDetailsDao;
import com.clay_rock.hrims.model.employee.ContactDetails;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;
import com.clay_rock.hrims.model.employee.PersonalDetails;

@Service("employeeLeaveBusiness")
public class EmployeeLeaveBusinessImpl implements IEmployeeLeaveBusiness {

	@Autowired
	private IEmployeeLeaveDao employeeLeaveDao;
	
	@Autowired
	private IEmployeeContactDetailsDao employeeContactDetailsDao;
	
	@Autowired
	private IEmployeePersonalDetailsDao employeePersonalDetailsDao;
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID){
		return employeeLeaveDao.getEmployeeLeaveDetails(empID);
	}
	
	public List<ContactDetails> getEmployeeContactDetails(String empID){
		return employeeContactDetailsDao.getEmployeeContactDetails(empID);
	}
	
	public List<PersonalDetails> getEmployeePersonalDetails(String empID){
		return employeePersonalDetailsDao.getEmployeePersonalDetails(empID);
	}
	
}
