package com.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.springboot.model.QUser;
import com.springboot.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

	
//	EntityManager entityManager = null;
//	JPAQuery<?> query = new JPAQuery<Object>(entityManager);
//
//	@SuppressWarnings("unchecked")
//	default List<User> findUserByOfficeId(Long officeId) {
//		QUser user = QUser.user;
//		List<User> users = (List<User>) query.from(user).where(user.office.id.eq(officeId));
//		return users;
//	}
}
