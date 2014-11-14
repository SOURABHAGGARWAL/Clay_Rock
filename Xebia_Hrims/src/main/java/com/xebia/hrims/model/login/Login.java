package com.xebia.hrims.model.login;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "login", uniqueConstraints = { @UniqueConstraint(columnNames = { "emp_id" }) })
public class Login implements Serializable {

	private static final long serialVersionUID = -3879168248261387800L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "emp_id", nullable = false, length = 40)
	private String emp_id;

	@Column(name = "password", nullable = false, length = 40)
	private String password;

	@Column(name = "role_id", nullable = false)
	private Integer roleId;

	@Column(name = "manager", nullable = true)
	private String manager;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
