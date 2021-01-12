package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Doctor;
import com.cdac.repo.DoctorRepo;
@Service
public class DoctorService implements IDoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

}
