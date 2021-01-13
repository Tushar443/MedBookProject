package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.Record;
import com.cdac.repo.RecordRepo;

@Service
public class RecordService implements IRecordService {

	@Autowired
	private RecordRepo recordRepo;
	
	@Override
	public Record addRecord(Record record) {
		return recordRepo.save(record);
	}
	@Override
	public List<Record> findPatient(Patient patient, Doctor doctor) {
		
		return recordRepo.findByDoctorIdAndPatientId(doctor, patient);
	}

}
