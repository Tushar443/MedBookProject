package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.User;
import com.cdac.repo.UserRepo;
@Service
public class UserServiceImple implements IUserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User findUser(String emailId) {
		
		return userRepo.findByEmailId(emailId);
	}

}
