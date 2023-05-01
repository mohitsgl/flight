package com.duproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duproject.model.User;

public interface UserRepo extends JpaRepository<User, String>{
	
	
	
}
