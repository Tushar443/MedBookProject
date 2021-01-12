package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		patient.setFlag("y");
		Patient dbPatient= patientService.addPatient(patient);
		session.setAttribute("patient", dbPatient);
		return "Patient Added";
	}

}
