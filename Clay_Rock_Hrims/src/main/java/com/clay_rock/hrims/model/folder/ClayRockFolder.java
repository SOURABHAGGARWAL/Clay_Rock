package com.clay_rock.hrims.model.folder;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_folder", uniqueConstraints = { @UniqueConstraint(columnNames = { "folder_id" }) })
public class ClayRockFolder  implements Serializable{

	private static final long serialVersionUID = 3711112087782462740L;

	@Id
	@Column(name = "folder_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer folderId;

	@Column(name = "folder_name", nullable = false)
	private String folderName;
	
	@Column(name = "parent_folder_id", nullable = false)
	private Integer parentFolderId=0;
	
	@Column(name = "folder_path", nullable = false)
	private Integer folderPath;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;
	
}
