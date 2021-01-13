package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Permission;

@Repository
public interface PermissionRepo extends CrudRepository<Permission, Long>{

	
}
