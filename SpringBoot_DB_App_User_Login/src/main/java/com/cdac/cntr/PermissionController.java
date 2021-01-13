package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Permission;
import com.cdac.service.IPermissionService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class PermissionController {
	
	@Autowired
	IPermissionService permissionService;

	@PostMapping(value = "addPermission")
	public String addPermissions(@RequestBody Permission permission) {
		permissionService.addPermission(permission);
		return "permission added";
	}
}
