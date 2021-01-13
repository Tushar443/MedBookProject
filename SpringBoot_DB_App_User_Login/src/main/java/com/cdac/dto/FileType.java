package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "file_type")
public class FileType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "file_type_id")
	private long fileTypeId;
	
	@Column(name = "file_type_name" ,length = 30)
	private String fileTypeName;
	
	
	public FileType() {
		// TODO Auto-generated constructor stub
	}


	public FileType(int fileTypeId, String fileTypeName) {
		super();
		this.fileTypeId = fileTypeId;
		this.fileTypeName = fileTypeName;
	}


	public long getFileTypeId() {
		return fileTypeId;
	}


	public void setFileTypeId(long fileTypeId) {
		this.fileTypeId = fileTypeId;
	}


	public String getFileTypeName() {
		return fileTypeName;
	}


	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}


	@Override
	public String toString() {
		return fileTypeId + " " + fileTypeName;
	}

}
