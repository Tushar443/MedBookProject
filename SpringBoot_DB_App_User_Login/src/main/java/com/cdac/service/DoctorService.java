package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.repo.DoctorRepo;
@Service
public class DoctorService implements IDoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	@Override
	public Patient findPatient(long patientId) {
		
		return null;
	}

	@Override
	public Optional<Doctor> findDoctor(long i) {
		
		return doctorRepo.findById(i);
	}

}
