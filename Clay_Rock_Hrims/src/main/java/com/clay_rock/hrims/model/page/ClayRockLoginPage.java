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
@Table(name = "clay_rock_login_page", uniqueConstraints = { @UniqueConstraint(columnNames = { "login_page_id" }) })
public class ClayRockLoginPage  implements Serializable{

	private static final long serialVersionUID = 7519287183584539490L;

	@Id
	@Column(name = "login_page_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loginPageId;

	@Column(name = "login_page_name", nullable = false)
	private String loginPageName;
	
	@Column(name = "login_page_desc", nullable = false)
	private String loginPageDescription;
	
	@Column(name = "login_page_layout", nullable = false)
	private ClayRockLayout loginPageLayout;

	@Column(name = "login_page_theme", nullable = false)
	private ClayRockTheme loginPageTheme;
	
	@Column(name = "login_page_footer", nullable = false)
	private ClayRockFooter loginPageFooter;
	
	@Column(name = "login_page_header", nullable = false)
	private ClayRockHeader loginPageHeader;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getLoginPageId() {
		return loginPageId;
	}

	public void setLoginPageId(Integer loginPageId) {
		this.loginPageId = loginPageId;
	}

	public String getLoginPageName() {
		return loginPageName;
	}

	public void setLoginPageName(String loginPageName) {
		this.loginPageName = loginPageName;
	}

	public String getLoginPageDescription() {
		return loginPageDescription;
	}

	public void setLoginPageDescription(String loginPageDescription) {
		this.loginPageDescription = loginPageDescription;
	}

	public ClayRockLayout getLoginPageLayout() {
		return loginPageLayout;
	}

	public void setLoginPageLayout(ClayRockLayout loginPageLayout) {
		this.loginPageLayout = loginPageLayout;
	}

	public ClayRockTheme getLoginPageTheme() {
		return loginPageTheme;
	}

	public void setLoginPageTheme(ClayRockTheme loginPageTheme) {
		this.loginPageTheme = loginPageTheme;
	}

	public ClayRockFooter getLoginPageFooter() {
		return loginPageFooter;
	}

	public void setLoginPageFooter(ClayRockFooter loginPageFooter) {
		this.loginPageFooter = loginPageFooter;
	}

	public ClayRockHeader getLoginPageHeader() {
		return loginPageHeader;
	}

	public void setLoginPageHeader(ClayRockHeader loginPageHeader) {
		this.loginPageHeader = loginPageHeader;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
