package com.xebia.hrims.model.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_language")
public class Language implements Serializable{

	private static final long serialVersionUID = -1096691404336309374L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false, length = 6)
	private String emp_id;

	@Column(name = "language", nullable = false, length = 40)
	private String language;

	@Column(name = "read", nullable = true)
	private boolean read;

	@Column(name = "write", nullable = true)
	private boolean write;

	@Column(name = "gender", nullable = true)
	private boolean speek;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isWrite() {
		return write;
	}

	public void setWrite(boolean write) {
		this.write = write;
	}

	public boolean isSpeek() {
		return speek;
	}

	public void setSpeek(boolean speek) {
		this.speek = speek;
	}
	
}
