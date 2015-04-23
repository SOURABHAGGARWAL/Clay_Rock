package com.clay_rock.hrims.model.page;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.footer.ClayRockFooter;
import com.clay_rock.hrims.model.header.ClayRockHeader;
import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.role.Role;
import com.clay_rock.hrims.model.theme.ClayRockTheme;


@Entity
@Table(name = "clay_rock_page", uniqueConstraints = { @UniqueConstraint(columnNames = { "age_id" }) })
public class ClayRockPage  implements Serializable{

	private static final long serialVersionUID = 6478734322989719216L;

	@Id
	@Column(name = "page_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pageId;

	@Column(name = "page_name", nullable = false)
	private String pageName;
	
	@Column(name = "page_desc", nullable = false)
	private String pageDescription;
	
	@Column(name = "page_layout", nullable = false)
	private ClayRockLayout pageLayout;

	@Column(name = "page_theme", nullable = false)
	private ClayRockTheme pageTheme;
	
	@Column(name = "page_footer", nullable = false)
	private ClayRockFooter pageFooter;
	
	@Column(name = "page_header", nullable = false)
	private ClayRockHeader pageHeader;
	
	@Column(name = "page_role", nullable = false)
	private Role pageRole;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getPageId() {
		return pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageDescription() {
		return pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}

	public ClayRockLayout getPageLayout() {
		return pageLayout;
	}

	public void setPageLayout(ClayRockLayout pageLayout) {
		this.pageLayout = pageLayout;
	}

	public ClayRockTheme getPageTheme() {
		return pageTheme;
	}

	public void setPageTheme(ClayRockTheme pageTheme) {
		this.pageTheme = pageTheme;
	}

	public ClayRockFooter getPageFooter() {
		return pageFooter;
	}

	public void setPageFooter(ClayRockFooter pageFooter) {
		this.pageFooter = pageFooter;
	}

	public ClayRockHeader getPageHeader() {
		return pageHeader;
	}

	public void setPageHeader(ClayRockHeader pageHeader) {
		this.pageHeader = pageHeader;
	}
	
	public Role getPageRole() {
		return pageRole;
	}

	public void setPageRole(Role pageRole) {
		this.pageRole = pageRole;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
