package com.cdac.service;

import com.cdac.dto.Address;
import com.cdac.dto.User;

public interface IUserService {
	void addUser(User user);
	
	User findUser(String emailId);

	Address addAddress(Address address);
}
