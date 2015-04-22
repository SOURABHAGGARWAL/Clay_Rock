package com.clay_rock.hrims.model.navigator;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_navigation_bar", uniqueConstraints = { @UniqueConstraint(columnNames = { "navigation_bar_id" }) })
public class ClayRockNavigationBar  implements Serializable{
	
	private static final long serialVersionUID = 5300526083169669773L;

	@Id
	@Column(name = "navigation_bar_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer navigationBarId;

	@Column(name = "navigation_bar_name", nullable = false)
	private String navigationBarName;

	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "navigation_menus", nullable = false)
	private List<Object> navigationMenus;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getNavigationBarId() {
		return navigationBarId;
	}

	public void setNavigationBarId(Integer navigationBarId) {
		this.navigationBarId = navigationBarId;
	}

	public String getNavigationBarName() {
		return navigationBarName;
	}

	public void setNavigationBarName(String navigationBarName) {
		this.navigationBarName = navigationBarName;
	}

	public Integer getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public List<Object> getNavigationMenus() {
		return navigationMenus;
	}

	public void setNavigationMenus(List<Object> navigationMenus) {
		this.navigationMenus = navigationMenus;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
