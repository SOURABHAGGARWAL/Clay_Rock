package com.xebia.hrims.business.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.employee.IEmployeeLeaveBusiness;
import com.xebia.hrims.dao.employee.IEmployeeLeaveDao;
import com.xebia.hrims.model.employee.EmployeeLeaveDetails;

@Service("employeeLeaveBusiness")
public class EmployeeLeaveBusinessImpl implements IEmployeeLeaveBusiness {

	@Autowired
	private IEmployeeLeaveDao employeeLeaveDao;
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID){
		return employeeLeaveDao.getEmployeeLeaveDetails(empID);
	}
	
}
