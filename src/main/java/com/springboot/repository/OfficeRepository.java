package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long>{

}
