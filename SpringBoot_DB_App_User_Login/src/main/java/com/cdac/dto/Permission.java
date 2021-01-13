package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Permission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_id")
	private long permissionId;
	
	@Column(columnDefinition = "varchar(5) default 'y'")
	private String accessibility ;

	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patientId;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctorId;
	
	
	public Permission() {
		
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}
	public Permission(int permissionId, String accessibility) {
		super();
		this.permissionId = permissionId;
		this.accessibility = accessibility;
	}

	public long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(long permissionId) {
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