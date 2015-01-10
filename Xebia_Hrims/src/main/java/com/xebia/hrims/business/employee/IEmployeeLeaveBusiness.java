package com.xebia.hrims.business.employee;

import java.util.List;

import com.xebia.hrims.model.employee.EmployeeLeaveDetails;

public interface IEmployeeLeaveBusiness {
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
}
