package com.cdac.service;

import java.util.Optional;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;

public interface IDoctorService {

	Doctor addDoctor(Doctor doctor);

	Patient findPatient(long patientId);

	Optional<Doctor> findDoctor(long i);
}
