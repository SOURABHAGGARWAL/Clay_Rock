package com.clay_rock.hrims.model.file;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "clay_rock_file", uniqueConstraints = { @UniqueConstraint(columnNames = { "file_id" }) })
public class ClayRockFile  implements Serializable{
	
	private static final long serialVersionUID = -1210187095639380808L;

	@Id
	@Column(name = "file_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fileId;

	@Column(name = "file_name", nullable = false)
	private String fileName;
	
	@Column(name = "folder_id", nullable = false)
	private Integer folderId;
	
	@Column(name = "file_type", nullable = false)
	private Integer fileType;
	
	@Column(name = "file_size", nullable = false)
	private Integer fileSize;
	
	@Column(name = "permission_id", nullable = true)
	private Integer permissionId;
	
	@Column(name = "encryption_key", nullable = true)
	private Integer encryptionKey;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;
	
}
