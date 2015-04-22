package com.clay_rock.hrims.service.employee;

import java.util.List;

import com.clay_rock.hrims.model.employee.ContactDetails;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;
import com.clay_rock.hrims.model.employee.PersonalDetails;

public interface IEmployeeLeaveService {
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
	public List<ContactDetails> getEmployeeContactDetails(String empID);
	
	public List<PersonalDetails> getEmployeePersonalDetails(String empID);
	
}
