package com.xebia.hrims.service.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.employee.IEmployeeLeaveBusiness;
import com.xebia.hrims.model.employee.EmployeeLeaveDetails;
import com.xebia.hrims.service.employee.IEmployeeLeaveService;

@Service("employeeLeaveService")
public class EmployeeLeaveServiceImpl implements IEmployeeLeaveService {

	@Autowired
	private IEmployeeLeaveBusiness employeeLeaveBusiness;
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID){
		return employeeLeaveBusiness.getEmployeeLeaveDetails(empID);
	}
	
}
