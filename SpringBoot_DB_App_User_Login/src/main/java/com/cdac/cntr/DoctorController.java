package com.cdac.cntr;

import java.util.List;

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
import com.cdac.dto.Record;
import com.cdac.service.IDoctorService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class DoctorController {

	@Autowired
	private IDoctorService doctorService;
	
	@GetMapping(value = "getDRes")
	public String getDRes() {
		return "Doctor Api";
	}
	
	@PostMapping(value = "addDoctor")
	public String addDoctor(@RequestBody Doctor doctor,HttpSession session) {
		Doctor dbDoctor = doctorService.addDoctor(doctor);
		session.setAttribute("doctor", dbDoctor);
		return "Doctor Added";
	}
	
//	//to request http://localhost:3033/getPatientId?patientId=1
//	@GetMapping(value = "getPatientId")
//	public Patient getPatient(@RequestParam("patientId") long patientId) {
//		
//		Patient patient = doctorService.findPatient(patientId);
//		
//		
//		return patient;
//	}
	
	
	
}
