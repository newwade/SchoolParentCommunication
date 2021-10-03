package com.cg.spc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Parent;
import com.cg.spc.entities.User;
import com.cg.spc.service.IUserService;
import com.cg.spc.service.impl.IUserServiceImpl;

@RestController
@RequestMapping(value = "/user")
public class IUserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping(value = "/add")
	public User createUser(@RequestBody User user) {
		return userService.addNewUser(user);
		
	}
	
	@PostMapping(value = "/signIn")
	public User signInUser(@RequestBody User user) {
		return userService.signIn(user);
		
	}
	
	@PostMapping(value = "/signOut")
	public User signOutUser(@RequestBody User user) {
		return userService.signOut(user);
	}
	
	
	

}
