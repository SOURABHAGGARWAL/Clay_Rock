package com.clay_rock.hrims.model.events;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.clay_rock.hrims.model.file.ClayRockFile;

@Entity
@Table(name = "clay_rock_events")
public class ClayRockEvents implements Serializable{

	private static final long serialVersionUID = -2804269917202170467L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "event_name")
	private String name;
	
	@Column(name = "event_desc")
	private String description;

	@Column(name = "event_start_date")
	private Date startDate;
	
	@Column(name = "event_end_date")
	private Date endDate;

	@Column(name = "event_place")
	private String place;
	
	@Column(name = "event_pictures")
	private List<ClayRockFile> eventPicture;
	
	@Column(name = "event_organization_committee")
	private String eventOrganizationCommittee;
	
	@Column(name = "active", nullable = false)
	private boolean active = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public List<ClayRockFile> getEventPicture() {
		return eventPicture;
	}

	public void setEventPicture(List<ClayRockFile> eventPicture) {
		this.eventPicture = eventPicture;
	}

	public String getEventOrganizationCommittee() {
		return eventOrganizationCommittee;
	}

	public void setEventOrganizationCommittee(String eventOrganizationCommittee) {
		this.eventOrganizationCommittee = eventOrganizationCommittee;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
