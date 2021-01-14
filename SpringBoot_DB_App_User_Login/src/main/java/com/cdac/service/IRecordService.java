package com.cdac.service;

import java.util.List;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.Record;

public interface IRecordService {
	Record addRecord(Record record);

	List<Record> findRecordByDoctor(Patient patient, Doctor doctor);

	List<Record> findAllRecords(Patient patient);
}
