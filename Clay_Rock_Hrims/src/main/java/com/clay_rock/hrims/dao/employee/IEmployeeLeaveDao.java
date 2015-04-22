package com.clay_rock.hrims.dao.employee;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;

public interface IEmployeeLeaveDao extends IDAO<EmployeeLeaveDetails>{
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
}
