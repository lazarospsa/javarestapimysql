package com.restapi.usermanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.usermanagment.entity.User;
import com.restapi.usermanagment.service.UserService;

@RequestMapping("user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public User save(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUserList();
	}
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable(name = "userId") Long userId) {
		return userService.getUser(userId);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable(name = "userId") Long userId) {
		userService.deleteUser(userId);
	}
}
