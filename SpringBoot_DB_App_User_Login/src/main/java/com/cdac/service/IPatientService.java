package com.cdac.service;

import java.util.Optional;

import com.cdac.dto.Patient;

public interface IPatientService {
	
	Patient addPatient(Patient patient);

	Optional<Patient> findPatientById(long patientId);
	
}
