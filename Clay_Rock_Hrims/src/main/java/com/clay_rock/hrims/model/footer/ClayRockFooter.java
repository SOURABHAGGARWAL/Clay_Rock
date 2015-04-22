package com.clay_rock.hrims.model.footer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "clay_rock_footer", uniqueConstraints = { @UniqueConstraint(columnNames = { "footer_id" }) })
public class ClayRockFooter  implements Serializable{
	
	private static final long serialVersionUID = 8030656963751773876L;

	@Id
	@Column(name = "footer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer footerId;

	@Column(name = "footer_name", nullable = false)
	private String footerName;

	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "footer_content", nullable = false)
	private Integer footerContent;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
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

	public Integer getFooterContent() {
		return footerContent;
	}

	public void setFooterContent(Integer footerContent) {
		this.footerContent = footerContent;
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
