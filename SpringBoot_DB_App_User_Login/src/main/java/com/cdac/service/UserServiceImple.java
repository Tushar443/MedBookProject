package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Address;
import com.cdac.dto.User;
import com.cdac.repo.AddressRepo;
import com.cdac.repo.UserRepo;
@Service
public class UserServiceImple implements IUserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AddressRepo addressRepo;
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User findUser(String emailId) {	
		return userRepo.findByEmailId(emailId);
	}

	@Override
	public Address addAddress(Address address) {
		
		return addressRepo.save(address);
	}

}
