package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Office;
import com.springboot.model.User;
import com.springboot.repository.OfficeRepository;
import com.springboot.repository.UserRespository;
import com.springboot.services.OfficeService;
import com.springboot.services.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private UserRespository respository;
	@Autowired
	private OfficeRepository officeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Office office = new Office();
		office.setOfficeName("RaiseTech");
		office.setAddress("ThapaGaon");
		office.setPanNo(98765);
		office.setShortName("raiseT");
		officeRepository.save(office);
		User user = new User();
		user.setUsername("Sushant");
		user.setPassword("password");

		user.setOffice(office);
		respository.save(user);

	}

}
