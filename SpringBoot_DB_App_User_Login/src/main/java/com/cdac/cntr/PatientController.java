package com.cdac.cntr;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.cdac.service.IPatientService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")

public class PatientController {
	
	@Autowired
	IPatientService patientService;
	
	@GetMapping(value = "getPRes")
	public String getResPonse() {
		return "Patient Api";
	}
	
	@PostMapping(value = "addPatient")
	public String addPatient(@RequestBody Patient patient,HttpSession session) {
		Patient dbPatient= patientService.addPatient(patient);
		session.setAttribute("patient", dbPatient);
		return "Patient Added";
	}
	
	@PostMapping(value = "allRecords")
	public String getAllRecords(HttpSession session) {
		
		Patient patient =(Patient) session.getAttribute("patient");
//		List<Record> records =  
		return "";
	}
	
	

}
