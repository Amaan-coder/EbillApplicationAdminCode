package com.example.ebill.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ebill.dto.UserDto;
import com.example.ebill.dto.ResponseDto;
import com.example.ebill.exception.ValidationFailedException;
import com.example.ebill.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo dao;

	public ResponseDto signup(UserDto ebillDto) {

		Long consumerId;
		String userId;
		String outMessage;
		Long billNumber;
		String consumerIdLenght;

		List<UserDto> ebill = dao.findAll();

		for (UserDto user : ebill) {
			consumerId = user.getConsumerId();
			userId = user.getUserId();

			if (consumerId.equals(ebillDto.getConsumerId())) {
				outMessage = "Customer already exist";
				throw new ValidationFailedException(outMessage);
			}
			if (userId.equals(ebillDto.getUserId())) {
				outMessage = "UserId is already exist, make some other userId";
				throw new ValidationFailedException(outMessage);
			}
		}
		consumerIdLenght = String.valueOf(ebillDto.getConsumerId());
		if (consumerIdLenght.length() < 13) {
			throw new ValidationFailedException("ConsumerId could not be less than 13");
		}
		String lastFiveDigits = getLastFiveDigits(ebillDto.getConsumerId());
		ebillDto.setBillNumber(lastFiveDigits);
		Random rand = new Random();

		Long customerId = (long) rand.nextInt(100000000);

		ebillDto.setCustomerId(customerId);
		System.out.println("CustomerId----->" + customerId);

		dao.save(ebillDto);
		outMessage = "Customer Added Sucessfully";
		return new ResponseDto(outMessage);
	}

	private String getLastFiveDigits(Long consumerId) {
		String consumerIdStr = String.valueOf(consumerId);

		int length = consumerIdStr.length();

		if (length >= 5) {
			int startIndex = length - 5;
			return consumerIdStr.substring(startIndex);
		} else {
			throw new ValidationFailedException("Consumer Id not less than 13");
		}
	}

	// Login user
	public ResponseDto login(UserDto userDto) {
		String outMessage = null;

		UserDto retrievedUser = dao.findByUserId(userDto.getUserId());
		if (retrievedUser != null) {

			if (retrievedUser.getPassword().equals(userDto.getPassword())
					&& retrievedUser.getUserId().equals(userDto.getUserId())) {
				outMessage = "User Login Successful";
			} else {
				throw new ValidationFailedException("Incorrect username or password");
			}

		} else {
			throw new ValidationFailedException("User not found");
		}
		return new ResponseDto(outMessage);
	}

	//Login end here
	
	
	public ResponseDto fetchUserList() {
		List<UserDto> ebill = dao.findAll();
		return new ResponseDto(ebill);
	}

	

}
