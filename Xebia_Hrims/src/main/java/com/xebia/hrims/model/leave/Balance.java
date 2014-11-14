package com.xebia.hrims.model.leave;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_leave_balance")
public class Balance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "")
	private int empId;

	@Column(name = "leaveid")
	private int leaveId;

	@Column(name = "leavesleft")
	private int leavesleft;

	public int getEmpId() {
		return empId;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public int getLeft() {
		return leavesleft;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public void setLeft(int left) {
		this.leavesleft = left;
	}

}
