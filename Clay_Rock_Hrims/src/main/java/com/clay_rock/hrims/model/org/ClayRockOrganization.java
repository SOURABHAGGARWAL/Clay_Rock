package com.clay_rock.hrims.model.org;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


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
	
	@Column(name = "organization_logo", nullable = false)
	private String organizationLogo;

	@Column(name = "organization_host", nullable = false)
	private String organizationHost;

	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "footer_id", nullable = false)
	private Integer footerId;
	
	@Column(name = "header_id", nullable = false)
	private Integer headerId;
	
	@Column(name = "login_page_id", nullable = false)
	private Integer loginPageId;
	
	@Column(name = "logout_page_id", nullable = false)
	private Integer logoutPageId;
	
	@Column(name = "dashboard_page_id", nullable = false)
	private Integer dashboardPageId;
	
	@Column(name = "navigation_bar_id", nullable = false)
	private Integer navigationBarId;
	
	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "parent_organization_id", nullable = false)
	private Integer parentOrganizationId=0;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;
	
	

}
