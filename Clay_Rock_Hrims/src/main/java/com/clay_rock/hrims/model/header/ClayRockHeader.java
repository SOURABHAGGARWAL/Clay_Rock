package com.clay_rock.hrims.model.header;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.theme.ClayRockTheme;


@Entity
@Table(name = "clay_rock_header", uniqueConstraints = { @UniqueConstraint(columnNames = { "header_id" }) })
public class ClayRockHeader  implements Serializable{

	private static final long serialVersionUID = -5962660382401262300L;

	@Id
	@Column(name = "header_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer headerId;

	@Column(name = "header_name", nullable = false)
	private String headerName;

	@Column(name = "header_desc", nullable = false)
	private String headerDescription;
	
	@Column(name = "header_layout", nullable = false)
	private ClayRockLayout headerLayout;
	
	@Column(name = "header_theme", nullable = false)
	private ClayRockTheme headerTheme;
	
	@Column(name = "header_content", nullable = false)
	private Integer headerContent;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Integer headerId) {
		this.headerId = headerId;
	}

	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}

	public String getHeaderDescription() {
		return headerDescription;
	}

	public void setHeaderDescription(String headerDescription) {
		this.headerDescription = headerDescription;
	}

	public ClayRockLayout getHeaderLayout() {
		return headerLayout;
	}

	public void setHeaderLayout(ClayRockLayout headerLayout) {
		this.headerLayout = headerLayout;
	}

	public ClayRockTheme getHeaderTheme() {
		return headerTheme;
	}

	public void setHeaderTheme(ClayRockTheme headerTheme) {
		this.headerTheme = headerTheme;
	}

	public Integer getHeaderContent() {
		return headerContent;
	}

	public void setHeaderContent(Integer headerContent) {
		this.headerContent = headerContent;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
