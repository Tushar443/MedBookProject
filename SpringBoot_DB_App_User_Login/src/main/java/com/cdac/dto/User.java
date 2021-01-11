package com.cdac.dto;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserInfo")
public class User {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long userId;
	
	@Column(name="patient_id")
	private long patientId;
	
	@Column(name="doctor_id")
	private long doctorId;
	
	@Column(name="address_id")
	private long addressId;
	
	@Column(name="email_id",length = 50,nullable = false)
	private String emailId;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Column(name="name",length = 50,nullable = false)
	private String name;
	
	@Column(name="contact_number",length = 30,nullable = false)
	private String contactNumber;
	
	@Column(name="date_of_birth",nullable = false)
	private Date dateOfBirth;
	
	@Column(name="role",length = 5,nullable = false)
	private String role;
	
	@Column(name="gender",length = 5,nullable = false)
	private String gender;
	

	private int age;
	

	private String photo;
	
	public User() {
		super();
		
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return userId + " " + patientId + " " + doctorId + " "
				+ addressId + " " + emailId + " " + password + " " + name + " "
				+ contactNumber + " " + dateOfBirth + " " + role + " " + gender + " "
				+ age + " " + photo;
	}

	
	
}