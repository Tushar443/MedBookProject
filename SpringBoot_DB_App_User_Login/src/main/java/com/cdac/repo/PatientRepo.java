package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Long>{
	
}
