package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Patient;
import com.cdac.repo.PatientRepo;

@Service
public class PatientService implements IPatientService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public Patient addPatient(Patient patient) {
		Patient dbPatient = patientRepo.save(patient);
		return dbPatient;
	}

	@Override
	public Optional<Patient> findPatientById(long patientId) {
		
		return patientRepo.findById(patientId);
	}
	
}
