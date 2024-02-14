package com.shahid.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahid.model.AmountResult;
import com.shahid.model.Bank;
import com.shahid.model.Bank.AccountStatus;
import com.shahid.model.TransferDetails;
import com.shahid.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {

	@Autowired
	private BankRepo repo;
	
	@Override
	public Bank saveBank(Bank bank) {
		
		Bank saveData = repo.save(bank);
		return saveData;
	}

	@Override
	public Bank getBalance(long accountNumber,String name,String password) {
		Bank bank = repo.findById(accountNumber).get();
		
		if(accountNumber == bank.getAccountNumber() && name.equals(bank.getName())&& password.equals(bank.getPassword()))
		{
			
			return bank;
		}
		else {
			
			return null;
		}
		
	}
	
	
	@Override
	public AmountResult depositeAmount(long accountNumber, String name, String password,double amount)
    {
	  Bank bank = repo.findById(accountNumber).get();
		
	  if(accountNumber == bank.getAccountNumber()&& name.equals(bank.getName()) && password.equals(bank.getPassword()))
	  {
		  double prevBalance = bank.getAmount();
		  double currentBalance = prevBalance + amount;
		  
		  bank.setAmount(currentBalance);
		  repo.save(bank);
		  
		  AmountResult deposite = new AmountResult();
		  
		  deposite.setPrevBalance(prevBalance);
		  deposite.setAmount(amount);
		  deposite.setCurrentBalance(currentBalance);	  
		  return deposite;
	  }
	  else {
		  return null;
		  
	  }	  
	}
	

	@Override
	public AmountResult withdrawAmount(long accountNumber,String name,String password,double amount)
	{
	 Bank bank = repo.findById(accountNumber).get();
	 
	 if(accountNumber == bank.getAccountNumber()&& name.equals(bank.getName()) && password.equals(bank.getPassword()) && amount < bank.getAmount())
	 {
		 double prevBalance = bank.getAmount();
		 double currentBalance = prevBalance - amount;
		 bank.setAmount(currentBalance);
		 repo.save(bank);
		 
		 AmountResult withdraw = new AmountResult();
		 withdraw.setPrevBalance(prevBalance);
		 withdraw.setAmount(amount);
		 withdraw.setCurrentBalance(currentBalance);
		 return withdraw;
	 }
	 else {
		 return null;
	 }
	 
	}

	@Override
	public TransferDetails transferAmount(long accountNumber,String name,String password,long targetAccountNo,double amount)
	{
	  Bank caccount = repo.findById(accountNumber).get();
	  Bank taccount = repo.findById(targetAccountNo).get();
		
	  if(accountNumber == caccount.getAccountNumber() && name.equals(caccount.getName()) && password.equals(caccount.getPassword()) && targetAccountNo == taccount.getAccountNumber() && amount < caccount.getAmount())
	  { 
		  double prevBalance = caccount.getAmount();
		  double currentBalance = prevBalance - amount;
		  caccount.setAmount(currentBalance);
			repo.save(caccount);	  
		  
		TransferDetails account = new TransferDetails();
		
		 account.setAccountNumber(accountNumber);
		 account.setBalance(prevBalance);
		 account.setTamount(amount);
		 
		 double previousBalance = taccount.getAmount();
		 double currentBalance1 = prevBalance + amount;
		 taccount.setAmount(currentBalance1);
		 repo.save(taccount);
		 
		 account.setTar_account(targetAccountNo);
		 account.setPrevBalance(previousBalance);
		 account.setCurrentBalance(currentBalance1);
		 
		 return account;	 
	  }  
	  else {
		  return null;
	  }
	
	}

	public Bank closeAccount(long accountNumber, String name,String password)
	{
		Bank bank = repo.findById(accountNumber).get();
		
		if(bank != null && accountNumber == bank.getAccountNumber() && name.equals(bank.getName()) && password.equals(bank.getPassword()))
        {
        	bank.setStatus(AccountStatus.inactive);
        	repo.save(bank);
        	
        	return bank;
        }
		else {
			
			return null;
		}

	}
	

}
