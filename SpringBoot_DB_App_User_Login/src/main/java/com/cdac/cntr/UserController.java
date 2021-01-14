package com.cdac.cntr;

import java.util.Base64;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.dto.Address;
import com.cdac.dto.Doctor;
import com.cdac.dto.Patient;
import com.cdac.dto.User;
import com.cdac.extraClasses.User_Address;
import com.cdac.service.IDoctorService;
import com.cdac.service.IPatientService;
import com.cdac.service.IUserService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	IUserService userService;
	
	@Autowired
	IPatientService patientService;
	
	@Autowired 
	IDoctorService doctorService;
	
	@PostMapping(value = "AddUser")
	public String addUser(@RequestBody User_Address user_address,HttpSession session) {
		//get separate objects
		Address address = user_address.getAddressObj();
		User user = user_address.getUserObj();
		
		String encryptedPass = getEncryptPass(user.getPassword());
		user.setPassword(encryptedPass);
		// Add Address
		address= userService.addAddress(address);
		user.setAddressId(address);
		
		//check the role
		if(user.getRole().equalsIgnoreCase("d")) {
			Doctor doctor = doctorService.addDoctor(user_address.getDoctorObj());
			user.setDoctorId(doctor);
		}else {
		Patient patient=patientService.addPatient(user_address.getPatienObj());
		user.setPatientId(patient);
		}
		//add User
		user = userService.addUser(user);
		return "User Added";
	}
	
	protected String getEncryptPass(String userPass) {
		return Base64.getEncoder().encodeToString(userPass.getBytes());
	}
	protected String getDecryptPass(String userPass) {
		return new String(Base64.getMimeDecoder().decode(userPass));
	}
	@PostMapping(value = "getUser")
	public String GetResponse(@RequestBody User user,HttpSession session) {
		User dbUser= userService.findUser(user.getEmailId());
		
		if(dbUser !=null) {
			String decryptedPass = getDecryptPass(dbUser.getPassword());
		if(user.getPassword().equals(decryptedPass)) {
			if(user.getRole().equals("d")) {
				return "Doctor";
			}
			session.setAttribute("user", dbUser);
			return "User";
		}
		else
			return "Invalid Password";
		}
		
		
		else
		return "Email id is not registered";
	}
	
	@GetMapping(value = "getURes")
	public String getResPonseUser() {
		return "User Api";
	}
	
	@PostMapping(value = "addAddress")
	public String addAddress(@RequestBody Address address,HttpSession session) {
		 Address add =userService.addAddress(address);
		session.setAttribute("address", add);
		return "Address Added";
		
		
		
	}
	
	
}
