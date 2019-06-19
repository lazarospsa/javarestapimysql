package com.restapi.usermanagment.service;

import java.util.List;

import com.restapi.usermanagment.entity.User;

public interface UserService {

	User saveUser(User user);
	
	User updateUser(User user);
	
	List<User> getAllUserList();
	
	User getUser(Long userId);
	
	void deleteUser(Long userId);
}
