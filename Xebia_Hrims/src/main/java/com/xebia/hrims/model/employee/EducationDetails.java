package com.xebia.hrims.model.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_education_details")
public class EducationDetails implements Serializable{

	private static final long serialVersionUID = 486601662031520189L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;
	
	@Column(name = "degree_or_diploma", nullable = false)
	private String degreeOrDiploma;
	
	@Column(name = "school_or_university", nullable = false)
	private String schoolOrUniversity;
	
	@Column(name = "year_of_passing", nullable = false)
	private Integer yearOfPassing;
	
	@Column(name = "percentage", nullable = false)
	private Integer percentage;

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

	public String getDegreeOrDiploma() {
		return degreeOrDiploma;
	}

	public void setDegreeOrDiploma(String degreeOrDiploma) {
		this.degreeOrDiploma = degreeOrDiploma;
	}

	public String getSchoolOrUniversity() {
		return schoolOrUniversity;
	}

	public void setSchoolOrUniversity(String schoolOrUniversity) {
		this.schoolOrUniversity = schoolOrUniversity;
	}

	public Integer getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(Integer yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

}
