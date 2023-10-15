package com.example.ebill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebill.dto.UserDto;
import com.example.ebill.repository.UserRepo;
import com.example.ebill.dto.ResponseDto;
import com.example.ebill.service.UserService;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/ebill")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepo dao;
	
	@PostConstruct
	public void postLogin() {
		userService.postLogin();
	}

	
	@PostMapping("/signup")
	public ResponseDto signup(@RequestBody UserDto userDto) {
		return userService.signup(userDto);

	}
	@PostMapping("/login")
	public ResponseDto login(@RequestBody UserDto userDto) {
		
		return userService.login(userDto);
	}
	
	
	@GetMapping("/userprofile/{userId}")
	public ResponseDto getUserProfile(@PathVariable String userId) {
		return userService.getUserProfile(userId);
	}
	
	@PostMapping("/updateuser/{customerId}")
	public ResponseDto updateUserByCustomerId(@PathVariable Long customerId, @RequestBody UserDto userDto) {
	    return userService.updateUserByCustomerId(customerId, userDto);
	}

	
	@GetMapping("/userlist")
	public ResponseDto userList(){
		return userService.fetchUserList();
	}
	
	
}
	

