package com.clay_rock.hrims.model.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_leave_details")
public class EmployeeLeaveDetails implements Serializable{

	private static final long serialVersionUID = -3669296755502063425L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;
	
	@Column(name = "type_of_leave", nullable = false)
	private Integer typeOfLeave;
	
	@Column(name = "total_number_of_leave", nullable = false)
	private Integer totalNumberOfLeave;
	
	@Column(name = "total_number_of_leave_taken", nullable = false)
	private Integer totalNumberOfLeaveTaken;

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

	public Integer getTypeOfLeave() {
		return typeOfLeave;
	}

	public void setTypeOfLeave(Integer typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}

	public Integer getTotalNumberOfLeave() {
		return totalNumberOfLeave;
	}

	public void setTotalNumberOfLeave(Integer totalNumberOfLeave) {
		this.totalNumberOfLeave = totalNumberOfLeave;
	}

	public Integer getPendingLeaves() {
		return (totalNumberOfLeave - totalNumberOfLeaveTaken);
	}

	public Integer getTotalNumberOfLeaveTaken() {
		return totalNumberOfLeaveTaken;
	}

	public void setTotalNumberOfLeaveTaken(Integer totalNumberOfLeaveTaken) {
		this.totalNumberOfLeaveTaken = totalNumberOfLeaveTaken;
	}
	
}
