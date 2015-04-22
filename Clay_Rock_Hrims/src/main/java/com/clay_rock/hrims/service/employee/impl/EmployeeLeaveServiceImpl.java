package com.clay_rock.hrims.service.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.employee.IEmployeeLeaveBusiness;
import com.clay_rock.hrims.model.employee.ContactDetails;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;
import com.clay_rock.hrims.model.employee.PersonalDetails;
import com.clay_rock.hrims.service.employee.IEmployeeLeaveService;

@Service("employeeLeaveService")
public class EmployeeLeaveServiceImpl implements IEmployeeLeaveService {

	@Autowired
	private IEmployeeLeaveBusiness employeeLeaveBusiness;
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID){
		return employeeLeaveBusiness.getEmployeeLeaveDetails(empID);
	}
	
	public List<ContactDetails> getEmployeeContactDetails(String empID){
		return employeeLeaveBusiness.getEmployeeContactDetails(empID);
	}
	
	public List<PersonalDetails> getEmployeePersonalDetails(String empID){
		return employeeLeaveBusiness.getEmployeePersonalDetails(empID);
	}
	
}
