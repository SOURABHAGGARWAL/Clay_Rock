package com.clay_rock.hrims.model.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.file.ClayRockFile;

@Entity
@Table(name = "clay_rock_personal", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Personal implements Serializable{

	private static final long serialVersionUID = 7937838766672062799L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "body_weight")
	private String bodyWeight;
	
	@Column(name = "body_height")
	private String bodyheight;
	
	@Column(name = "diseases_or_disablity")
	private String diseasesOrDisability;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "photo")
	private ClayRockFile photo;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "language_known")
	private List<Language> languageKnown;
	
	/**
	 * Veg /Non. Veg
	 */
	@Column(name = "eating_habit")
	private String eatingHabit;
	
	@Column(name = "age")
	private Integer age;
	
	/**
	 * mm hg
	 */
	@Column(name = "blood_pressure")
	private Integer bloodPressure;
	
	/**
	 * Beats/Seconds
	 */
	@Column(name = "heart_beet")
	private Integer heartBeet;
	
	/**
	 * mg/dL
	 */
	@Column(name = "suger_level")
	private Integer sugarLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBodyWeight() {
		return bodyWeight;
	}

	public void setBodyWeight(String bodyWeight) {
		this.bodyWeight = bodyWeight;
	}

	public String getBodyheight() {
		return bodyheight;
	}

	public void setBodyheight(String bodyheight) {
		this.bodyheight = bodyheight;
	}

	public String getDiseasesOrDisability() {
		return diseasesOrDisability;
	}

	public void setDiseasesOrDisability(String diseasesOrDisability) {
		this.diseasesOrDisability = diseasesOrDisability;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ClayRockFile getPhoto() {
		return photo;
	}

	public void setPhoto(ClayRockFile photo) {
		this.photo = photo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Language> getLanguageKnown() {
		return languageKnown;
	}

	public void setLanguageKnown(List<Language> languageKnown) {
		this.languageKnown = languageKnown;
	}

	public String getEatingHabit() {
		return eatingHabit;
	}

	public void setEatingHabit(String eatingHabit) {
		this.eatingHabit = eatingHabit;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public Integer getHeartBeet() {
		return heartBeet;
	}

	public void setHeartBeet(Integer heartBeet) {
		this.heartBeet = heartBeet;
	}

	public Integer getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(Integer sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	
}