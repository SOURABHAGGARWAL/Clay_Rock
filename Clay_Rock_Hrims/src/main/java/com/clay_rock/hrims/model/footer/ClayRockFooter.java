package com.clay_rock.hrims.model.footer;

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
@Table(name = "clay_rock_footer", uniqueConstraints = { @UniqueConstraint(columnNames = { "footer_id" }) })
public class ClayRockFooter  implements Serializable{

	private static final long serialVersionUID = 2127741148433457853L;

	@Id
	@Column(name = "footer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer footerId;

	@Column(name = "footer_name", nullable = false)
	private String footerName;
	
	@Column(name = "footer_desc", nullable = false)
	private String footerDescription;

	@Column(name = "footer_layout", nullable = false)
	private ClayRockLayout footerLayout;
	
	@Column(name = "footer_theme", nullable = false)
	private ClayRockTheme footerTheme;
	
	@Column(name = "footer_content", nullable = false)
	private Integer footerContent;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getFooterId() {
		return footerId;
	}

	public void setFooterId(Integer footerId) {
		this.footerId = footerId;
	}

	public String getFooterName() {
		return footerName;
	}

	public void setFooterName(String footerName) {
		this.footerName = footerName;
	}

	public String getFooterDescription() {
		return footerDescription;
	}

	public void setFooterDescription(String footerDescription) {
		this.footerDescription = footerDescription;
	}

	public ClayRockLayout getFooterLayout() {
		return footerLayout;
	}

	public void setFooterLayout(ClayRockLayout footerLayout) {
		this.footerLayout = footerLayout;
	}

	public ClayRockTheme getFooterTheme() {
		return footerTheme;
	}

	public void setFooterTheme(ClayRockTheme footerTheme) {
		this.footerTheme = footerTheme;
	}

	public Integer getFooterContent() {
		return footerContent;
	}

	public void setFooterContent(Integer footerContent) {
		this.footerContent = footerContent;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
