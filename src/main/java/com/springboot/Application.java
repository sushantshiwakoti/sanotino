package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Office;
import com.springboot.model.User;
import com.springboot.services.OfficeService;
import com.springboot.services.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private UserService service;
	@Autowired
	private OfficeService officeService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("Sushant");
		user.setPassword("password");
		Office office= officeService.findByOfficeId(Long.valueOf(1));
		System.out.print("office"+office.getId());
		user.setOffice(office);
		service.createUser(user);
		
	}

}
