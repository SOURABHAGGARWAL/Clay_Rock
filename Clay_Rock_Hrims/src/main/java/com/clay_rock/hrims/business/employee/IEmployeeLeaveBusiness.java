package com.clay_rock.hrims.business.employee;

import java.util.List;

import com.clay_rock.hrims.model.employee.ContactDetails;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;
import com.clay_rock.hrims.model.employee.PersonalDetails;

public interface IEmployeeLeaveBusiness {
	
	public List<EmployeeLeaveDetails> getEmployeeLeaveDetails(String empID);
	
	public List<ContactDetails> getEmployeeContactDetails(String empID);
	
	public List<PersonalDetails> getEmployeePersonalDetails(String empID);
	
}
