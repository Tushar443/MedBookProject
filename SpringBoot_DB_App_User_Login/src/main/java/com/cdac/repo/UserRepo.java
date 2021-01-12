package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.User;
@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
	
	User findByEmailId(String emailId);

}
