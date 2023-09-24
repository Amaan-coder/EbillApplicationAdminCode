package com.example.ebill.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebill.dto.UserDto;

@Repository
public interface UserRepo extends JpaRepository<UserDto, Integer> {
	
	UserDto findByUserId(String userId);

	UserDto findById(Long customerId);
	 UserDto findByCustomerId(Long customerId);
	
}
