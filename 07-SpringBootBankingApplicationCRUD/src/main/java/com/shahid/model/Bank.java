package com.shahid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private long accountNumber;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobileNumber;
	
	@Enumerated(EnumType.STRING)
    private AccountStatus status = AccountStatus.active;

 public enum AccountStatus {
	   active, inactive
	
	   
 }

public Bank() {
	super();
	// TODO Auto-generated constructor stub
}

public Bank(long accountNumber, String name, String password, double amount, String address, long mobileNumber,
		AccountStatus status) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.password = password;
	this.amount = amount;
	this.address = address;
	this.mobileNumber = mobileNumber;
	this.status = status;
}

public long getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public AccountStatus getStatus() {
	return status;
}

public void setStatus(AccountStatus status) {
	this.status = status;
}

@Override
public String toString() {
	return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password + ", amount=" + amount
			+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", status=" + status + "]";
}   
	   
}   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

