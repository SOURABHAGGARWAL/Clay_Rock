package com.clay_rock.hrims.dao.employee.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.employee.IEmployeePersonalDetailsDao;
import com.clay_rock.hrims.model.employee.PersonalDetails;

@Repository("employeePersonalDetailsDao")
public class EmployeePersonalDetailsDaoImpl extends DAOImpl<PersonalDetails>
		implements IEmployeePersonalDetailsDao {

	public EmployeePersonalDetailsDaoImpl() {
		super(PersonalDetails.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonalDetails> getEmployeePersonalDetails(String empID) {
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from com.clay_rock.hrims.model.employee.PersonalDetails where emp_id = :emp_id");
		query.setParameter("emp_id", empID);
		;
		if (query.list().size() >= 1) {
			return query.list();
		} else {
			return new ArrayList<PersonalDetails>();
		}
	}

}
