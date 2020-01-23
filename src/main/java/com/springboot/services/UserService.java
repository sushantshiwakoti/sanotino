package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.OfficeRepository;
import com.springboot.repository.UserRespository;

@Service
public class UserService {
	@Autowired	
	private UserRespository respository;
	@Autowired
	private OfficeRepository officeRepository;
	public List<User> findAllUsers(){
		return respository.findAll();
	}
	public User createUser(User user,Long officeId) {
		User createUser = new User();
		createUser.setUsername(user.getUsername());
		createUser.setPassword(user.getPassword());
		createUser.setOffice(officeRepository.findById(officeId).get());
		return respository.save(createUser);
		
	}
//	public List<User> findUserByOfficeId(Long officeId) {
//		return respository.findUserByOfficeId(officeId);
//		
//	}

}
