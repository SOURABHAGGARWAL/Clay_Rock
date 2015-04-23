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
import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.role.Role;
import com.clay_rock.hrims.model.theme.ClayRockTheme;

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
	
	@Column(name = "dashboard_dashlets", nullable = false)
	private List<ClayRockDashlet> dashboardDashlets;
	
	@Column(name = "dashboard_theme", nullable = false)
	private ClayRockTheme dashboardTheme;
	
	@Column(name = "dashboard_layout", nullable = false)
	private ClayRockLayout dashboardLayout;
	
	@Column(name = "role", nullable = false)
	private Role role;
	
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

	public List<ClayRockDashlet> getDashboardDashlets() {
		return dashboardDashlets;
	}

	public void setDashboardDashlets(List<ClayRockDashlet> dashboardDashlets) {
		this.dashboardDashlets = dashboardDashlets;
	}

	public ClayRockTheme getDashboardTheme() {
		return dashboardTheme;
	}

	public void setDashboardTheme(ClayRockTheme dashboardTheme) {
		this.dashboardTheme = dashboardTheme;
	}

	public ClayRockLayout getDashboardLayout() {
		return dashboardLayout;
	}

	public void setDashboardLayout(ClayRockLayout dashboardLayout) {
		this.dashboardLayout = dashboardLayout;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
