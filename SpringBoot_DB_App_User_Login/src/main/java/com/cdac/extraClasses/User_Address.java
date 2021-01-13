package com.cdac.extraClasses;

import com.cdac.dto.Address;
import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.User;

public class User_Address {
	 public String name;
	    public String emailId;
	    public String password;
	    public String contactNumber;
	    public String dateOfBirth;
	    public String role;
	    public String gender;
	    public String age;
	    //public photo: File;
	    /**
	     * Address 
	     * */
	    public String flatNo;
	    public String area ;
	    public String street ;
	    public String city;
	    public String state;
	    public String country ;
	    public String pincode;
	    
	    /**
	     * Patient 
	     * */

	    public String patientBloodGroup;
	    
	    /**
	     * Doctor 
	     * */
	    
	   public String specialization;
	   public String doctorRegistrationCouncil;
	   public String doctorRegistrationYear;
	   public String doctorRegistrationNumber;
	   public String college;
	   public String degree;
	   public String yearOfCompletion;
	   public String yearOfExperiance;
	   public String establishmentName;
	   public String establishmentCity;
	   public String locality;
	   public String medicalProof;
	   public String establishmentProof;
	   public String identityProof;	
	   
	   
	   
	   public  User getUserObj() {
		   User user = new User();
			user.setContactNumber(contactNumber);
			user.setDateOfBirth(dateOfBirth);
			user.setEmailId(emailId);
			user.setGender(gender);
			user.setName(name);
			user.setPassword(password);
			user.setRole(role);
		   return user;
	   }
	   
	   public Address getAddressObj() {
		   Address address = new Address();
			address.setArea(area);
			address.setCity(city);
			address.setCountry(country);
			address.setFlatNo(flatNo);
			address.setPincode(pincode);
			address.setState(state);
			address.setStreet(street);
			return address;
	   }
	   
	   public Doctor getDoctorObj() {
		   Doctor doctor = new Doctor();
		   doctor.setCollege(college);
		   doctor.setDegree(degree);
		   doctor.setDoctorRegistrationCouncil(doctorRegistrationCouncil);
		   doctor.setDoctorRegistrationNumber(doctorRegistrationNumber);
		   doctor.setDoctorRegistrationYear(doctorRegistrationYear);
		   doctor.setEstablishmentCity(establishmentCity);
		   doctor.setEstablishmentName(establishmentName);
		   doctor.setEstablishmentProof(establishmentProof);
		   doctor.setLocality(locality);
		   doctor.setMedicalProof(medicalProof);
		   doctor.setIdentityProof(identityProof);
		   doctor.setSpecialization(specialization);
		   doctor.setYearOfCompletion(yearOfCompletion);
		   doctor.setYearOfExperiance(yearOfExperiance);
		   return doctor;
	   }
	   
	   public Patient getPatienObj() {
		   Patient patient = new Patient();
		   patient.setPatientBloodGroup(patientBloodGroup);
		   return patient;
	   }
}
