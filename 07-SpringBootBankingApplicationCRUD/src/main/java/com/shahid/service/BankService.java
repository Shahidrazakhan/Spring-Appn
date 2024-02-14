package com.shahid.service;



import com.shahid.model.AmountResult;
import com.shahid.model.Bank;
import com.shahid.model.TransferDetails;

public interface BankService {

	public Bank saveBank(Bank bank);
	
	public Bank getBalance(long accountNumber,String name,String password);
	
	public AmountResult depositeAmount(long accountNumber,String name,String password,double amount);
	
	public AmountResult withdrawAmount(long accountNumber,String name,String password,double amount);

	public TransferDetails transferAmount(long accountNumber,String name,String password,long targetAccountNo,double amount);
	
	public Bank closeAccount (long accountNumber, String name, String password);
	
	
	
	
}
