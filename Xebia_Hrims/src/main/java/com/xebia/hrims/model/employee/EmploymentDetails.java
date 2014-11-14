package com.xebia.hrims.model.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_employment_details")
public class EmploymentDetails implements Serializable{

	private static final long serialVersionUID = -9071984358900339033L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;
	
	@Column(name = "company_name", nullable = false, length = 60)
	private String companyName;
	
	@Column(name = "compnay_address", nullable = false, length = 60)
	private Address compnayAddress;
	
	@Column(name = "designation", nullable = false, length = 40)
	private String designation;
	
	@Column(name = "date_of_joining", nullable = false)
	private Date dateOfJoining;
	
	@Column(name = "date_of_leaving", nullable = false)
	private Date dateOfLeaving;
	
	@Column(name = "reason_for_leaving", nullable = false, length = 40)
	private String reasonForLeaving;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getCompnayAddress() {
		return compnayAddress;
	}

	public void setCompnayAddress(Address compnayAddress) {
		this.compnayAddress = compnayAddress;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public String getReasonForLeaving() {
		return reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}


}
