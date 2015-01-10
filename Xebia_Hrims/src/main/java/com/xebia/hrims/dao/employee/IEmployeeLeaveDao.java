package com.xebia.hrims.dao.employee;

import java.util.List;

import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.model.employee.EmployeeLeaveDetails;

public interface IEmployeeLeaveDao extends IDAO<EmployeeLeaveDetails>{
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
}
