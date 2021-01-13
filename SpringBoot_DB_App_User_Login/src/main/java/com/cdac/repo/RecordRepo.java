package com.cdac.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.Record;
@Repository
public interface RecordRepo extends CrudRepository<Record, Long>{

	List<Record> findByDoctorIdAndPatientId(Doctor doctor,Patient patient);

}
