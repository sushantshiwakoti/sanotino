package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.UserRespository;

@Service
public class UserService {
	@Autowired	
	private UserRespository respository;
	public List<User> findAllUsers(){
		return respository.findAll();
	}
	public User createUser(User user) {
		User createUser = new User();
		createUser.setUsername(user.getUsername());
		createUser.setPassword(user.getPassword());
		return respository.save(createUser);
		
	}
//	public List<User> findUserByOfficeId(Long officeId) {
//		return respository.findUserByOfficeId(officeId);
//		
//	}

}
