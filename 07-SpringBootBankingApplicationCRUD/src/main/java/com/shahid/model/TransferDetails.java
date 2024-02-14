package com.shahid.model;

public class TransferDetails {

	private long accountNumber;
	private double balance;
	private double tamount;
	private long tar_account;
	private double prevBalance;
	private double currentBalance;
	
	public TransferDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferDetails(long accountNumber, double balance, double tamount, long tar_account, double prevBalance,
			double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.tamount = tamount;
		this.tar_account = tar_account;
		this.prevBalance = prevBalance;
		this.currentBalance = currentBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTamount() {
		return tamount;
	}
	public void setTamount(double tamount) {
		this.tamount = tamount;
	}
	public long getTar_account() {
		return tar_account;
	}
	public void setTar_account(long tar_account) {
		this.tar_account = tar_account;
	}
	public double getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(double prevBalance) {
		this.prevBalance = prevBalance;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	@Override
	public String toString() {
		return "TransferDetails [accountNummber=" + accountNumber + ", balance=" + balance + ", tamount=" + tamount
				+ ", tar_account=" + tar_account + ", prevBalance=" + prevBalance + ", currentBalance=" + currentBalance
				+ "]";
	}
	
	
}

