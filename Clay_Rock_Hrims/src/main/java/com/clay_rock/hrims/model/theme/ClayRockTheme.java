package com.clay_rock.hrims.model.theme;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_theme", uniqueConstraints = { @UniqueConstraint(columnNames = { "theme_id" }) })
public class ClayRockTheme  implements Serializable{
	
	private static final long serialVersionUID = -390804296902018020L;

	@Id
	@Column(name = "theme_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer themeId;

	@Column(name = "theme_name", nullable = false)
	private String themeName;
	
	@Column(name = "theme_description", nullable = false)
	private String themeDescription;
	
	/**
	 * Theme is for which type footer, header, login, logout etc.
	 */
	@Column(name = "theme_base_type", nullable = false)
	private String themeBaseType;
	
	@Column(name = "theme_plugins_base_path", nullable = false)
	private String themePluginsBasePath;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public String getThemeDescription() {
		return themeDescription;
	}

	public void setThemeDescription(String themeDescription) {
		this.themeDescription = themeDescription;
	}

	public String getThemeBaseType() {
		return themeBaseType;
	}

	public void setThemeBaseType(String themeBaseType) {
		this.themeBaseType = themeBaseType;
	}

	public String getThemePluginsBasePath() {
		return themePluginsBasePath;
	}

	public void setThemePluginsBasePath(String themePluginsBasePath) {
		this.themePluginsBasePath = themePluginsBasePath;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
