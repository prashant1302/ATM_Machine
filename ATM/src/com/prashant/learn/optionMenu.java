package com.prashant.learn;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class optionMenu extends account{

	Scanner menuinput = new Scanner(System.in);
	Scanner accountset = new Scanner(System.in);
	
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getlogin() throws IOException{

		int x=1;

		do {
			try {
				data.put(123443, 636280);
				data.put(567887, 123456);

				System.out.println("Welcome to XYZ bank ATM");
				System.out.println("Enter your coustomer no: ");
				setCustomerNumber(menuinput.nextInt());

				System.out.println("Enter your PIN no.");
				setPINNumber(menuinput.nextInt());		
			} catch(Exception e) {
				System.out.println("\n" + "Invalid characters(s) Only Numbers" + "\n");
				x=2;
			}

			int cn = getCustomerNumber();
			int pn = getPINNumber();
			if(data.containsKey(cn) && data.get(cn)== pn ) {
				getAccountType();
			}
			else
				System.out.println("\n" + "Wrong Coustomer no. or PIN no." + "\n");
		} 
		while (x==1);		
	}

	public void getAccountType() {
		System.out.println("Select the Account type you want to access: ");
		System.out.println("Type1 - Current Account");
		System.out.println("Type2 - Savings Account");
		System.out.println("Type3 - Set new PIN");
		System.out.println("Type4 - Exit");

		int selection = menuinput.nextInt();
		switch(selection) {
		case 1:
			getCurrentAcc();
			break;

			case 2:
				getSavingAcc();
			break;

			case 3:
				System.out.println("Feature is not avaliable right now");
				getAccountType();
			break;

			case 4:
				System.out.println("Thank you for using ATM \n");
			break;

		default:
			System.out.println("\n" + "Invalid choice" + "\n");
			getAccountType();
		}
	}
	
	public void getCurrentAcc() {
		System.out.println("Current Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuinput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Balance: " + moneyformat.format(getCurrentBal()));
			getAccountType();
			break;
			
			case 2:
				getCurrentWithdrawInput();
			getAccountType();
			break;
			
			case 3:
				System.out.println("Thankyou for Using ATM");
				
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getCurrentAcc();			
		}		
	}

	public void getSavingAcc() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Back");
		System.out.println("Choice: ");
		
		int selection = menuinput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Balance: " + moneyformat.format(getSavingBal()));
			getAccountType();
			break;
			
			case 2:
				getSavingWithdrawInput();
			getAccountType();
			break;
			
			case 3:
				System.out.println("Thankyou for Using ATM");
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getCurrentAcc();			
		}
	}

}
