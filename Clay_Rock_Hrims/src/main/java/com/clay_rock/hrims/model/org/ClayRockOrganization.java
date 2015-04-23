package com.clay_rock.hrims.model.org;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.dashboard.ClayRockDashboard;
import com.clay_rock.hrims.model.events.ClayRockEvents;
import com.clay_rock.hrims.model.footer.ClayRockFooter;
import com.clay_rock.hrims.model.header.ClayRockHeader;
import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.navigator.ClayRockNavigationBar;
import com.clay_rock.hrims.model.page.ClayRockLoginPage;
import com.clay_rock.hrims.model.page.ClayRockLogoutPage;
import com.clay_rock.hrims.model.role.Role;
import com.clay_rock.hrims.model.theme.ClayRockTheme;


@Entity
@Table(name = "clay_rock_organization", uniqueConstraints = { @UniqueConstraint(columnNames = { "organization_id" }) })
public class ClayRockOrganization  implements Serializable{

	private static final long serialVersionUID = -862691120527182504L;

	@Id
	@Column(name = "organization_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer organizationId;

	@Column(name = "organization_name", nullable = false)
	private String organizationName;
	
	@Column(name = "organization_title", nullable = false)
	private String organizationTitle;
	
	@Column(name = "organization_logo", nullable = false)
	private String organizationLogo;

	@Column(name = "organization_host", nullable = false)
	private String organizationHost;

	@Column(name = "organization_theme", nullable = false)
	private ClayRockTheme organizationTheme;
	
	@Column(name = "organization_footer", nullable = false)
	private ClayRockFooter organizationFooter;
	
	@Column(name = "organization_header", nullable = false)
	private ClayRockHeader organizationHeader;
	
	@Column(name = "organization_navigation_bar", nullable = false)
	private ClayRockNavigationBar organizationNavigationBar;
	
	@Column(name = "organization_login_page", nullable = false)
	private ClayRockLoginPage organizationLoginPage;
	
	@Column(name = "organization_logout_page", nullable = false)
	private ClayRockLogoutPage organizationLogoutPage;
	
	@Column(name = "organization_events", nullable = false)
	private List<ClayRockEvents> organizationEvents;
	
	@Column(name = "dashboard", nullable = false)
	private ClayRockDashboard dashboard;
	
	@Column(name = "navigation_bar_id", nullable = false)
	private ClayRockNavigationBar organization_NavigationBar;
	
	@Column(name = "organization_layout", nullable = false)
	private ClayRockLayout organizationLayout;
	
	@Column(name = "parent_organization_id", nullable = false)
	private Integer parentOrganizationId=0;
	
	@Column(name = "organization_role", nullable = true)
	private Role organizationRole;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationTitle() {
		return organizationTitle;
	}

	public void setOrganizationTitle(String organizationTitle) {
		this.organizationTitle = organizationTitle;
	}

	public String getOrganizationLogo() {
		return organizationLogo;
	}

	public void setOrganizationLogo(String organizationLogo) {
		this.organizationLogo = organizationLogo;
	}

	public String getOrganizationHost() {
		return organizationHost;
	}

	public void setOrganizationHost(String organizationHost) {
		this.organizationHost = organizationHost;
	}

	public ClayRockTheme getOrganizationTheme() {
		return organizationTheme;
	}

	public void setOrganizationTheme(ClayRockTheme organizationTheme) {
		this.organizationTheme = organizationTheme;
	}

	public ClayRockFooter getOrganizationFooter() {
		return organizationFooter;
	}

	public void setOrganizationFooter(ClayRockFooter organizationFooter) {
		this.organizationFooter = organizationFooter;
	}

	public ClayRockHeader getOrganizationHeader() {
		return organizationHeader;
	}

	public void setOrganizationHeader(ClayRockHeader organizationHeader) {
		this.organizationHeader = organizationHeader;
	}

	public ClayRockNavigationBar getOrganizationNavigationBar() {
		return organizationNavigationBar;
	}

	public void setOrganizationNavigationBar(
			ClayRockNavigationBar organizationNavigationBar) {
		this.organizationNavigationBar = organizationNavigationBar;
	}

	public ClayRockLoginPage getOrganizationLoginPage() {
		return organizationLoginPage;
	}

	public void setOrganizationLoginPage(ClayRockLoginPage organizationLoginPage) {
		this.organizationLoginPage = organizationLoginPage;
	}

	public ClayRockLogoutPage getOrganizationLogoutPage() {
		return organizationLogoutPage;
	}

	public void setOrganizationLogoutPage(ClayRockLogoutPage organizationLogoutPage) {
		this.organizationLogoutPage = organizationLogoutPage;
	}

	public List<ClayRockEvents> getOrganizationEvents() {
		return organizationEvents;
	}

	public void setOrganizationEvents(List<ClayRockEvents> organizationEvents) {
		this.organizationEvents = organizationEvents;
	}

	public ClayRockDashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(ClayRockDashboard dashboard) {
		this.dashboard = dashboard;
	}

	public ClayRockNavigationBar getOrganization_NavigationBar() {
		return organization_NavigationBar;
	}

	public void setOrganization_NavigationBar(
			ClayRockNavigationBar organization_NavigationBar) {
		this.organization_NavigationBar = organization_NavigationBar;
	}

	public ClayRockLayout getOrganizationLayout() {
		return organizationLayout;
	}

	public void setOrganizationLayout(ClayRockLayout organizationLayout) {
		this.organizationLayout = organizationLayout;
	}

	public Integer getParentOrganizationId() {
		return parentOrganizationId;
	}

	public void setParentOrganizationId(Integer parentOrganizationId) {
		this.parentOrganizationId = parentOrganizationId;
	}

	public Role getOrganizationRole() {
		return organizationRole;
	}

	public void setOrganizationRole(Role organizationRole) {
		this.organizationRole = organizationRole;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
