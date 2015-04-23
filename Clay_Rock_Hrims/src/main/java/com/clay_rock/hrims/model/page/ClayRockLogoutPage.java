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
import com.clay_rock.hrims.model.theme.ClayRockTheme;


@Entity
@Table(name = "clay_rock_logout_page", uniqueConstraints = { @UniqueConstraint(columnNames = { "logout_page_id" }) })
public class ClayRockLogoutPage  implements Serializable{

	private static final long serialVersionUID = 7519287183584539490L;

	@Id
	@Column(name = "logout_page_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer logoutPageId;

	@Column(name = "logout_page_name", nullable = false)
	private String logoutPageName;
	
	@Column(name = "logout_page_desc", nullable = false)
	private String logoutPageDescription;
	
	@Column(name = "logout_page_layout", nullable = false)
	private ClayRockLayout logoutPageLayout;

	@Column(name = "logout_page_theme", nullable = false)
	private ClayRockTheme logoutPageTheme;
	
	@Column(name = "logout_page_footer", nullable = false)
	private ClayRockFooter logoutPageFooter;
	
	@Column(name = "logout_page_header", nullable = false)
	private ClayRockHeader logoutPageHeader;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getlogoutPageId() {
		return logoutPageId;
	}

	public void setlogoutPageId(Integer logoutPageId) {
		this.logoutPageId = logoutPageId;
	}

	public String getlogoutPageName() {
		return logoutPageName;
	}

	public void setlogoutPageName(String logoutPageName) {
		this.logoutPageName = logoutPageName;
	}

	public String getlogoutPageDescription() {
		return logoutPageDescription;
	}

	public void setlogoutPageDescription(String logoutPageDescription) {
		this.logoutPageDescription = logoutPageDescription;
	}

	public ClayRockLayout getlogoutPageLayout() {
		return logoutPageLayout;
	}

	public void setlogoutPageLayout(ClayRockLayout logoutPageLayout) {
		this.logoutPageLayout = logoutPageLayout;
	}

	public ClayRockTheme getlogoutPageTheme() {
		return logoutPageTheme;
	}

	public void setlogoutPageTheme(ClayRockTheme logoutPageTheme) {
		this.logoutPageTheme = logoutPageTheme;
	}

	public ClayRockFooter getlogoutPageFooter() {
		return logoutPageFooter;
	}

	public void setlogoutPageFooter(ClayRockFooter logoutPageFooter) {
		this.logoutPageFooter = logoutPageFooter;
	}

	public ClayRockHeader getlogoutPageHeader() {
		return logoutPageHeader;
	}

	public void setlogoutPageHeader(ClayRockHeader logoutPageHeader) {
		this.logoutPageHeader = logoutPageHeader;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
