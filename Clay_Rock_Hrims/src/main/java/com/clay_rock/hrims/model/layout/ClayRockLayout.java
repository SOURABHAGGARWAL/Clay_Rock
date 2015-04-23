package com.clay_rock.hrims.model.layout;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_layout", uniqueConstraints = { @UniqueConstraint(columnNames = { "layout_id" }) })
public class ClayRockLayout  implements Serializable{
	
	private static final long serialVersionUID = -555718388124794496L;

	@Id
	@Column(name = "layout_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer layoutId;

	@Column(name = "layout_name", nullable = false)
	private String layoutName;
	
	@Column(name = "layout_description", nullable = false)
	private String layoutDescription;
	
	/**
	 * layout is for which type footer, header, login, logout etc.
	 */
	@Column(name = "layout_base_type", nullable = false)
	private String layoutBaseType;
	
	@Column(name = "layout_plugins_base_path", nullable = false)
	private String layoutPluginsBasePath;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getLayoutDescription() {
		return layoutDescription;
	}

	public void setLayoutDescription(String layoutDescription) {
		this.layoutDescription = layoutDescription;
	}

	public String getLayoutBaseType() {
		return layoutBaseType;
	}

	public void setLayoutBaseType(String layoutBaseType) {
		this.layoutBaseType = layoutBaseType;
	}

	public String getLayoutPluginsBasePath() {
		return layoutPluginsBasePath;
	}

	public void setLayoutPluginsBasePath(String layoutPluginsBasePath) {
		this.layoutPluginsBasePath = layoutPluginsBasePath;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
