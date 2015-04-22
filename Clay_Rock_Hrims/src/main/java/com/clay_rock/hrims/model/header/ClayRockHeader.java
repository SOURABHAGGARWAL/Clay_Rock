package com.clay_rock.hrims.model.header;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "clay_rock_header", uniqueConstraints = { @UniqueConstraint(columnNames = { "header_id" }) })
public class ClayRockHeader  implements Serializable{
	
	private static final long serialVersionUID = 8030656963751773876L;

	@Id
	@Column(name = "header_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer headerId;

	@Column(name = "header_name", nullable = false)
	private String headerName;

	@Column(name = "layout_id", nullable = false)
	private Integer layoutId;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "header_content", nullable = false)
	private Integer headerContent;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

}
