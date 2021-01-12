package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Patient;
import com.cdac.dto.User;
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
	
	@PostMapping(value = "AddUser")
	public String addUser(@RequestBody User user,HttpSession session) {
		if(user.getRole().equalsIgnoreCase("d")) {
			// Doctor Added
		}
		Patient patient=(Patient)session.getAttribute("patient");
		user.setPatientId(patient);
		userService.addUser(user);
		return "User Added";
	}
	@PostMapping(value = "getUser")
	public String GetResponse(@RequestBody User user,HttpSession session) {
		User dbUser= userService.findUser(user.getEmailId());
		if(dbUser !=null) {
		if(user.getPassword().equals(dbUser.getPassword())) {
			session.setAttribute("user", dbUser);
			return "Valid User";
		}
		else
			return "Not Valid";
		}
		else
		return "Not Registered";
	}
	
	@GetMapping(value = "getURes")
	public String getResPonseUser() {
		return "User Api";
	}
}
