package com.cdac.dto;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_id")
	private long patientId;

	@ManyToMany(mappedBy = "allPatient")
	private Set<Doctor> allDoctors = new HashSet<Doctor>();
	
	
	@Column(name = "mode_of_notification",columnDefinition = "varchar(5) default 'y'")
	private String modeOfNotification;
	
	@Column(name="patient_blood_group",length = 5)
	private String patientBloodGroup;
	
	
	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
	public Set<Doctor> getAllDoctors() {
		return allDoctors;
	}

	public void setAllDoctors(Set<Doctor> allDoctors) {
		this.allDoctors = allDoctors;
	}
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public String getModeOfNotification() {
		return modeOfNotification;
	}

	public void setModeOfNotification(String modeOfNotification) {
		this.modeOfNotification = modeOfNotification;
	}

	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}

	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}

	@Override
	public String toString() {
		return  patientId + " "
				+ modeOfNotification + " " + patientBloodGroup ;
	}

	public Patient(long patientId, long doctorId, String modeOfNotification, String patientBloodGroup) {
		super();
		this.patientId = patientId;
		this.modeOfNotification = modeOfNotification;
		this.patientBloodGroup = patientBloodGroup;
	}

		
	
}
