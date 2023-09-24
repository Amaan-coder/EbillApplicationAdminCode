package com.example.ebill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebill.dto.EbillDto;
import com.example.ebill.dto.ResponseDto;
import com.example.ebill.service.EbillService;


@RestController
@RequestMapping("/ebill")
public class EbillController {
	
	@Autowired
	private EbillService userService;

	
	@PostMapping("/signup")
	public ResponseDto signup(@RequestBody EbillDto userDto) {
		return userService.signup(userDto);

	}
	@GetMapping("/userlist")
	public ResponseDto userList(){
		return userService.fetchUserList();
	}
}
	

