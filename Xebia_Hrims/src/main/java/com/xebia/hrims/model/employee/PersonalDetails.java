package com.xebia.hrims.model.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_personal_details")
public class PersonalDetails implements Serializable{

	private static final long serialVersionUID = 4809557145880020104L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;

	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;

	@Column(name = "middle_name", nullable = true, length = 20)
	private String middleName;

	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;

	@Column(name = "gender", nullable = false, length = 10)
	private String gender;

	@Column(name = "dob", nullable = false, length = 20)
	private String dob;

	@Column(name = "place_of_birth", nullable = false, length = 20)
	private String placeOfBirth;

	@Column(name = "blood_group", nullable = false, length = 20)
	private String bloodGroup;
	
	@Column(name = "resume", nullable = false, length = 100)
	private String resume;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	} 
	
}
