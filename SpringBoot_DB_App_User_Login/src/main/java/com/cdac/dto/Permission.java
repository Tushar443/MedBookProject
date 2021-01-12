package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Permission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_id")
	private int permissionId;

//	@Column(name = "patient_id")
//	private int patientId;
//	
//	@Column(name = "doctorId")
//	private int doctorId;
	
	@Column(columnDefinition = "varchar(5) default 'YES'")
	private String accessibility ;

	public Permission() {
		// TODO Auto-generated constructor stub
	}

	public Permission(int permissionId, String accessibility) {
		super();
		this.permissionId = permissionId;
		this.accessibility = accessibility;
	}

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(String accessibility) {
		this.accessibility = accessibility;
	}

	@Override
	public String toString() {
		return permissionId + " " + accessibility ;
	}

	
}
