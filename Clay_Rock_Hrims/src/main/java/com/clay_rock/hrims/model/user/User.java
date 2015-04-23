package com.clay_rock.hrims.model.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.dashboard.ClayRockDashboard;
import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.org.ClayRockOrganization;
import com.clay_rock.hrims.model.role.Role;
import com.clay_rock.hrims.model.theme.ClayRockTheme;

@Entity
@Table(name = "clay_rock_user", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id" }) })
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
	
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", nullable = false)
	private String middleName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;
	
	@Column(name = "addresses", nullable = false)
	private List<Address> addresses;

	@Column(name = "role", nullable = false)
	private Role role;
	
	@Column(name = "reporting_user")
	private User reportingUser;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;
	
	@Column(name = "contact")
	private Contact contact;
	
	@Column(name = "personal")
	private Personal personal;
	
	@Column(name = "current_status")
	private String currentStatus;
	
	@Column(name = "organization")
	private ClayRockOrganization organization;
	
	@Column(name = "dashboard")
	private ClayRockDashboard dashboard;
	
	@Column(name = "theme")
	private ClayRockTheme theme;
	
	@Column(name = "layout")
	private ClayRockLayout layout;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getReportingUser() {
		return reportingUser;
	}

	public void setReportingUser(User reportingUser) {
		this.reportingUser = reportingUser;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public ClayRockOrganization getOrganization() {
		return organization;
	}

	public void setOrganization(ClayRockOrganization organization) {
		this.organization = organization;
	}

	public ClayRockDashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(ClayRockDashboard dashboard) {
		this.dashboard = dashboard;
	}

	public ClayRockTheme getTheme() {
		return theme;
	}

	public void setTheme(ClayRockTheme theme) {
		this.theme = theme;
	}

	public ClayRockLayout getLayout() {
		return layout;
	}

	public void setLayout(ClayRockLayout layout) {
		this.layout = layout;
	}

}
