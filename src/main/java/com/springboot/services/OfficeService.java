package com.springboot.services;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Office;
import com.springboot.repository.OfficeRepository;

@Service
public class OfficeService {
	
	@Autowired
	private OfficeRepository repository;
	
	public List<Office> findAllOffice() {
		return repository.findAll();
	}
	public Office createOffice(Office office) {
		return repository.save(office);
	}
	public Office findByOfficeId(Long id) {
		Office  office= repository.findById(id).get();
		if(office==null) {
			throw new NoResultException("No result");
		}
		return office;
	}
}
