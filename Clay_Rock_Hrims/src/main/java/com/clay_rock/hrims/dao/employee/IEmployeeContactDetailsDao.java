package com.clay_rock.hrims.dao.employee;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.employee.ContactDetails;

public interface IEmployeeContactDetailsDao extends IDAO<ContactDetails>{
	
	public List<ContactDetails> getEmployeeContactDetails(String empID);
	
}
