package com.clay_rock.hrims.dao.employee.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.employee.IEmployeeContactDetailsDao;
import com.clay_rock.hrims.model.employee.ContactDetails;

@Repository("employeeContactDetailsDao")
public class EmployeeContactDetailsDaoImpl extends DAOImpl<ContactDetails>
		implements IEmployeeContactDetailsDao {

	public EmployeeContactDetailsDaoImpl() {
		super(ContactDetails.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContactDetails> getEmployeeContactDetails(String empID) {
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from com.clay_rock.hrims.model.employee.ContactDetails where emp_id = :emp_id");
		query.setParameter("emp_id", empID);
		;
		if (query.list().size() >= 1) {
			return query.list();
		} else {
			return new ArrayList<ContactDetails>();
		}
	}

}
