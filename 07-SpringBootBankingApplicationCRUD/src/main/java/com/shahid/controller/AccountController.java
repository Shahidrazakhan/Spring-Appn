package com.shahid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.wls.shaded.org.apache.xalan.lib.Redirect;
import com.shahid.model.AmountResult;
import com.shahid.model.Bank;
import com.shahid.model.TransferDetails;
import com.shahid.service.BankService;

@Controller
public class AccountController {

	@Autowired
	private BankService service;
	
	@RequestMapping("/")
    public String homePage()
    {
		return "home";
    }
    @RequestMapping("/newAccount")
    public String newAccount()
    {
    	return "viewform";
    }
	@RequestMapping("/register")
	public String saveData(Bank bank)
	{
		Bank b1 = service.saveBank(bank);
		
		return "success";
	}
	
	@RequestMapping("/balance")
	public String getData()
	{	
		return "balanceform";
	}
	
	@RequestMapping("/accountBalance")
	public String balanceForm(@RequestParam long accountNumber,@RequestParam String name,@RequestParam String password ,ModelMap model)
	{
		Bank getAcc = service.getBalance(accountNumber,name,password);
		
		if(getAcc != null)
		{
			model.put("data", getAcc);
			
			return "getbalance";
		}
		else 
		{
			return "redirect:/balance";
		}
	}
    @RequestMapping("/deposite")
    public String depositeForm()
    {
    	return "depositeform";
    }
	@RequestMapping("/depositeinfo")
	public String depositeInfo(@RequestParam long accountNumber,@RequestParam String name,@RequestParam String password,@RequestParam double amount, ModelMap model)
	{
		AmountResult balance = service.depositeAmount(accountNumber, name, password, amount);
		
		if(balance != null)
		{
			model.put("deposite", balance);
			return "showdeposite";
		}
		else
		{
			return "redirect:/deposite";
		}
	}
	    @RequestMapping("/withdraw")
	    public String withdrawForm()
	    {
	    	return "withdrawform";
	    }
	
	  @RequestMapping("/withdrawinfo")
	  public String withdrawInfo(@RequestParam long accountNumber,@RequestParam String name,@RequestParam String password,@RequestParam double amount, ModelMap model)
	  {
		AmountResult balance = service.withdrawAmount(accountNumber, name, password, amount);
		
		 if(balance !=null)
		 {
			 model.put("withdraw", balance);
			 return "showWithdraw";	 
		 }
		 else {
			 return "rediect:/withdraw";
		 }
		  
	  }
	 @RequestMapping("/transfer")
	 public String transfer()
	 {
		 return "transfer";
	 }
	@RequestMapping("/tranferinfo")
	public String tranferForm(@RequestParam long accountNumber,@RequestParam String name,@RequestParam String password,@RequestParam long targetAccountNo,@RequestParam double amount,ModelMap model)
	{
		TransferDetails details = service.transferAmount(accountNumber, name, password, targetAccountNo, amount);
		
		if(details != null)
		{
			model.put("transfer", details);
			return "showtransfer";
		}
		else {
			 return "redirect:/transfer";
		}
	
	}
	@RequestMapping("/closeAC")
	public String close()
	{
		return "close";
	}
	
	@RequestMapping("/closeinfo")
	public String closeForm(@RequestParam long accountNumber, @RequestParam String name, @RequestParam String password,ModelMap model)
	{
	  Bank bank = service.closeAccount(accountNumber, name, password);
	  
	  if(bank != null)
	  {
		  model.put("close", bank);
		  return "closeform";
	  }
	  else {
		  return "closeform";
	  }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
