package com.lti.java;

public class SavingsAccount {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		if(accountNumber<0) {
			throw new RuntimeException("Negative account number");
		}
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	public void withdraw(double amountToWithdraw) {
		if(amountToWithdraw > accountBalance ) {
			throw new RuntimeException("Insufficient balance exception");
		}
		this.accountBalance = this.accountBalance - amountToWithdraw;
		//this.accountBalance=this.accountBalance-10; //out of contract 
	}
	public void deposit(double amountTodeposit) {
		this.accountBalance = this.accountBalance + amountTodeposit;
		//this.accountBalance = this.accountBalance + 10;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}