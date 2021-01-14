package com.cdac.cntr;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.Record;
import com.cdac.dto.User;
import com.cdac.service.IDoctorService;
import com.cdac.service.IPatientService;
import com.cdac.service.IRecordService;
import com.cdac.service.IUserService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class RecordController {
	
	@Autowired
	private IRecordService recordService;
	
	@Autowired
	private IPatientService patientService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IUserService userService;

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
		record.setDoctorId(doctor);
		record.setPatientId(patient);
		recordService.addRecord(record);
		return "Record Added";
	}
	
	//to request http://localhost:3033/getPatientId?patientId=1
		@GetMapping(value = "getRecordbyDoctor")
		public List<Record> getPatient(@RequestParam("patientId") long patientId,@RequestParam("doctorId") long doctorId,HttpSession session) {
		Optional<Patient> val = patientService.findPatientById(patientId);
		Patient patient = null;
		if(val.isPresent()) {
			patient = val.get();
		}
		Doctor doctor=null;
		
		Optional<Doctor> vald = doctorService.findDoctor(doctorId);
		if(vald.isPresent()) {
			doctor = vald.get();
		}
		List<Record> records = recordService.findRecordByDoctor(patient,doctor);
			return records;
		}
		
		@GetMapping(value = "getAllRecords")
		public List<Record> getAllRecords(@RequestParam("patientId") long patientId,HttpSession session){
			Optional<Patient> val = patientService.findPatientById(patientId);
			Patient patient = null;
			if(val.isPresent()) {
				patient = val.get();
			}
			User user = null;
			List<Record> records = recordService.findAllRecords(patient);
			for (Record record : records) {
				Doctor doctor= record.getDoctorId();
				
				 user =userService.findUserByDoctorId(doctor);
				
				
			}
			System.out.println("@@@@@@@@@@@@@ "+user.getName());
			return 	records;	
		}
			
			
			
		
		
		
		
		
}
