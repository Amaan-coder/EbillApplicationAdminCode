package com.example.ebill.dto;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "ebillapp")
public class EbillDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Long customerId;
	private Long consumerId;
	private String billNumber;
	private String title;
	private String customerName;
	private String email;
	private String countryCode;	
	private String mobileNumber;
	private String userId;
	private String password;
	@Transient
	private String confirmPassword;
	


	public Long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String lastFiveDigits) {
		this.billNumber = lastFiveDigits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


}
