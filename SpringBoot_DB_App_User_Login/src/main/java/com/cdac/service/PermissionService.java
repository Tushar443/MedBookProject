package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Permission;
import com.cdac.repo.PermissionRepo;

@Service
public class PermissionService implements IPermissionService {

	@Autowired
	private PermissionRepo permissionRepo;
	
	@Override
	public void addPermission(Permission permission) {
		permissionRepo.save(permission);
	}
	

}
