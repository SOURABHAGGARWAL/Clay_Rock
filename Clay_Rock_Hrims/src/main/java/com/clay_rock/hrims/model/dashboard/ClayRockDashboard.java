package com.clay_rock.hrims.model.dashboard;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.dashlet.ClayRockDashlet;

@Entity
@Table(name = "clay_rock_org_dashboard", uniqueConstraints = { @UniqueConstraint(columnNames = { "dashboard_id" }) })
public class ClayRockDashboard  implements Serializable{

	private static final long serialVersionUID = 2413936691910955148L;

	@Id
	@Column(name = "dashboard_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dashboardId;

	@Column(name = "dashboard_name", nullable = false)
	private String dashboardName;
	
	@Column(name = "dashboard_title", nullable = false)
	private String dashboardTitle;
	
	@Column(name = "dashboard_dashlets", nullable = false)
	private List<ClayRockDashlet> dashboardDashlets;
	
	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getDashboardId() {
		return dashboardId;
	}

	public void setDashboardId(Integer dashboardId) {
		this.dashboardId = dashboardId;
	}

	public String getDashboardName() {
		return dashboardName;
	}

	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

	public String getDashboardTitle() {
		return dashboardTitle;
	}

	public void setDashboardTitle(String dashboardTitle) {
		this.dashboardTitle = dashboardTitle;
	}

	public List<ClayRockDashlet> getDashboardDashlets() {
		return dashboardDashlets;
	}

	public void setDashboardDashlets(List<ClayRockDashlet> dashboardDashlets) {
		this.dashboardDashlets = dashboardDashlets;
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
