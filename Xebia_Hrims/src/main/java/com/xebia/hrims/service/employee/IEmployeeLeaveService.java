package com.xebia.hrims.service.employee;

import java.util.List;

import com.xebia.hrims.model.employee.EmployeeLeaveDetails;

public interface IEmployeeLeaveService {
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
}
