package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.User;
import com.springboot.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/userList")
	public List<User> getAllUsers(){
		return  userService.findAllUsers();
		
	}
	@PostMapping("/createUser")
	public User createUSer(@RequestBody User user) {
		return userService.createUser(user);
		
	}
//	@GetMapping("/{officeId}")
//	public List<User> findUserByOfficeId(@PathVariable("officeId")Long officeId) {
//		return userService.findUserByOfficeId(officeId);
//	}
}
