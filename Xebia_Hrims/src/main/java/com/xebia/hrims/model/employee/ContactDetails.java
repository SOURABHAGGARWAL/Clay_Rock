package com.xebia.hrims.model.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_contact_details")
public class ContactDetails implements Serializable {
	
	private static final long serialVersionUID = 50051155971244368L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;
	
	@Column(name = "current_address", nullable = false)
	private Address currentAddress;
	
	@Column(name = "permanent_address", nullable = false)
	private Address permanentAddress;

	@Column(name = "contact_no", nullable = false, length = 20)
	private String contactNo;
	
	@Column(name = "emergency_person", nullable = false, length = 40)
	private String emergencyPerson;

	@Column(name = "emergency_contact_no", nullable = false, length = 20)
	private String emergencyContactNo;

	@Column(name = "official_email_id", nullable = false, length = 40)
	private String officialEmailId;

	@Column(name = "personal_email_id", nullable = false, length = 40)
	private String personalEmailId;

	@Column(name = "skype_id", nullable = false, length = 20)
	private String skypeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getOfficialEmailId() {
		return officialEmailId;
	}

	public void setOfficialEmailId(String officialEmailId) {
		this.officialEmailId = officialEmailId;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

}
