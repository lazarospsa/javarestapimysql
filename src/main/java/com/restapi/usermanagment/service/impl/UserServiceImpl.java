package com.restapi.usermanagment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.usermanagment.dao.UserDao;
import com.restapi.usermanagment.entity.User;
import com.restapi.usermanagment.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveAndFlush(user);
	}

	@Override
	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return userDao.findOne(userId);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userDao.delete(userId);
	}

}
