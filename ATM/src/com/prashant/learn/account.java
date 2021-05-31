package com.prashant.learn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class account {

	private int customerNumber;
	private int pinNumber;
	private double currentBalance=1000;
	private double savingsBalance=1000;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat();
	
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPINNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPINNumber() {
		return pinNumber;
	}
	
	public double getCurrentBal() {
		return currentBalance;
	}
	
	public double getSavingBal() {
		return savingsBalance;
	}
	
	public double calCurrentWithdraw(double amount) {
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}
	
	public double calSavingWithdraw(double amount) {
		savingsBalance = (savingsBalance - amount);
		return savingsBalance;
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Savings Balance: " + moneyformat.format(savingsBalance));
		System.out.println("Amount to Withdraw: ");
		double amount = input.nextDouble();
		
		if((savingsBalance - amount)>=0) {
			calSavingWithdraw(amount);
			System.out.println("Fund withdrawn" + "\n" + "New Balance :" + moneyformat.format(savingsBalance));
		}
		else {
			System.out.println("Not enough Balance to withdraw" + "\n");
		}
	}

	
	public void getCurrentWithdrawInput() {
		System.out.println("Current Balance: " + moneyformat.format(currentBalance));
		System.out.println("Amount to Withdraw: ");
		double amount = input.nextDouble();
		
		if((currentBalance - amount)>=0) {
			calCurrentWithdraw(amount);
			System.out.println("Fund withdrawn" + "\n" + "New Balance :" + moneyformat.format(currentBalance));
		}
		else {
			System.out.println("Not enough Balance to withdraw" + "\n");
		}
	}
}
