package com.cdac.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="record")
public class Record {
	@Id
	@GeneratedValue
	@Column(name="record_id")
	private long recordId;
	
	
	@OneToOne
	@JoinColumn(name = "record_id",unique = true)
	private FileType fileTypeId;
	
//	@Column(name="doctor_id")
//	private long doctorId;
//	
//	@Column(name="patient_id")
//	private long patientId;
	
	@Column(name="record_name",length=50,nullable = false)
	private String recordName;
	
	@Column(name="date",nullable = false)
	private String date ;
	
	@Column(name="disease_name",length=50)
	private String disceaseName;
	
	@Column(name="prescription")
	private String prescription;
	
	@Column(name="files")
	private byte[] files;
	
	
	public Record() {
		// TODO Auto-generated constructor stub
	}
	public long getRecordId() {
		return recordId;
	}
	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}
//	public long getDoctorId() {
//		return doctorId;
//	}
//	public void setDoctorId(long doctorId) {
//		this.doctorId = doctorId;
//	}
//	public long getPatientId() {
//		return patientId;
//	}
//	public void setPatientId(long patientId) {
//		this.patientId = patientId;
//	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDisceaseName() {
		return disceaseName;
	}
	public void setDisceaseName(String disceaseName) {
		this.disceaseName = disceaseName;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public byte[] getFiles() {
		return files;
	}
	public void setFiles(byte[] files) {
		this.files = files;
	}
	

	@Override
	public String toString() {
		return  recordId + " " + fileTypeId + " " 
				+ recordName + " " + date + " " + disceaseName
				+ " " + prescription + " " + files;
	}
	
	
}
