package com.clay_rock.hrims.model.dashlet;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_dashlet", uniqueConstraints = { @UniqueConstraint(columnNames = { "dashlet_id" }) })
public class ClayRockDashlet  implements Serializable{

	private static final long serialVersionUID = -975103753471469550L;

	@Id
	@Column(name = "dashlet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dashletId;

	@Column(name = "dashlet_name", nullable = false)
	private String dashletName;
	
	@Column(name = "dashlet_title", nullable = false)
	private String dashletTitle;
	
	@Column(name = "dashboard_id", nullable = false)
	private String dashboardId;

	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;
	
}
