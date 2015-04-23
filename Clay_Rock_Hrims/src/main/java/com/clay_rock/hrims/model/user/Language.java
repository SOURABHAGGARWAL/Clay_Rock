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
@Table(name = "clay_rock_language", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Language implements Serializable {

	private static final long serialVersionUID = -1311192122750625674L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "contact_no", nullable = false, length = 20)
	private String languageName;
	
	@Column(name = "emergency_contact_person")
	private String languageDescription;

	@Column(name = "emergency_contact_no")
	private String emergencyContactNo;
	
	/**
	 * Read, write, Read/Write
	 */
	@Column(name = "expertise_level")
	private String expertiseLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageDescription() {
		return languageDescription;
	}

	public void setLanguageDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getExpertiseLevel() {
		return expertiseLevel;
	}

	public void setExpertiseLevel(String expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}
	
}
