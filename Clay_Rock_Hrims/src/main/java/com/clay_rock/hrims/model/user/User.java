package com.clay_rock.hrims.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_login", uniqueConstraints = { @UniqueConstraint(columnNames = { "emp_id" }) })
public class User implements Serializable {

	private static final long serialVersionUID = 4481343134055396094L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "user_id", nullable = false)
	private String userID;

	@Column(name = "password", nullable = false)
	private char[] password;

	@Column(name = "role_id", nullable = false)
	private Integer roleId;

	@Column(name = "manager", nullable = true)
	private String manager;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

}
