package com.devsuperior.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
