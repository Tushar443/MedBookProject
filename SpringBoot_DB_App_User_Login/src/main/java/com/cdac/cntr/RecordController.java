package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.Record;
import com.cdac.service.IRecordService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class RecordController {
	
	@Autowired
	private IRecordService recordService;

	@GetMapping(value = "getRRes")
	public String getResRecord() {
		return "Record Api";
	}
	
	@PostMapping(value = "addRecords")
	public String addRecord(@RequestBody Record record,HttpSession session) {
		Patient patient = (Patient) session.getAttribute("patient");
		Doctor doctor =(Doctor) session.getAttribute("doctor");
		if(doctor == null) {
			doctor.setDoctorId(0);
		}
		doctor.getDoctorRecords().add(record);
		Record re =  recordService.addRecord(record);
		patient.getPatientRecords().add(re);
		return "Record Added";
	}
}
