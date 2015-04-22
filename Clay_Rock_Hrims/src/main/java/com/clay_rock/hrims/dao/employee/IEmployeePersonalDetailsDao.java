package com.clay_rock.hrims.dao.employee;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.employee.PersonalDetails;

public interface IEmployeePersonalDetailsDao extends IDAO<PersonalDetails>{
	
	public List<PersonalDetails> getEmployeePersonalDetails(String empID);
	
}
