package com.clay_rock.hrims.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clay_rock_contact")
public class Contact implements Serializable {

	private static final long serialVersionUID = 3623013529424792111L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "contact_no")
	private String contactNo;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;

	@Column(name = "emergency_contact_no")
	private String emergencyContactNo;

	@Column(name = "official_email_id")
	private String officialEmailId;

	@Column(name = "personal_email_id")
	private String personalEmailId;
	
	@Column(name = "facebook_id")
	private String facebookId;
	
	@Column(name = "linkedin_id")
	private String linkedInId;
	
	@Column(name = "twitter_id")
	private String twitterId;
	
	@Column(name = "google_plus_id")
	private String googlePlusId;

	@Column(name = "skype_id")
	private String skypeId;

}
