package com.xebia.hrims.model.leave;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_leave")
public class Leave implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;

	@Column(name = "type_of_leave")
	private Integer typeOfLeave;

	@Column(name = "start_date", nullable = false)
	private Date startDate;

	@Column(name = "end_date", nullable = false)
	private Date endDate;

	@Column(name = "number_of_leaves", nullable = false)
	private String numberOfLeaves;

	@Column(name = "reason_of_leaves", nullable = false)
	private String reasonOfLeaves;

	@Column(name = "handover_to")
	private String handoverTo;

	@Column(name = "notify_to")
	private String notifyTo;

	@Column(name = "status_of_leave")
	private String statusOfLeave;

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(String numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}

	public String getReasonOfLeaves() {
		return reasonOfLeaves;
	}

	public void setReasonOfLeaves(String reasonOfLeaves) {
		this.reasonOfLeaves = reasonOfLeaves;
	}

	public String getHandoverTo() {
		return handoverTo;
	}

	public void setHandoverTo(String handoverTo) {
		this.handoverTo = handoverTo;
	}

	public String getNotifyTo() {
		return notifyTo;
	}

	public void setNotifyTo(String notifyTo) {
		this.notifyTo = notifyTo;
	}

	public String getStatusOfLeave() {
		return statusOfLeave;
	}

	public void setStatusOfLeave(String statusOfLeave) {
		this.statusOfLeave = statusOfLeave;
	}
	
}
