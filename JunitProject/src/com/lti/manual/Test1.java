package com.lti.manual;

import com.lti.java.SavingsAccount;

public class Test1 { 
	public static void main(String[] args) {
		double currentBalance=5000;
		SavingsAccount savObj = new SavingsAccount(101,"Julie", currentBalance);
		System.out.println("savObj : "+savObj);
		
		double amountToWithdraw=2000;
		double amountToDeposit=2000;
		
		savObj.deposit(amountToDeposit);

		double expectedBalance = currentBalance + amountToDeposit;
		
		if(expectedBalance == savObj.getAccountBalance()) {
			
			System.out.println("deposit passed");
			
		}
		else {
			System.out.println("Expected : "+expectedBalance+" But Found : "+savObj.getAccountBalance());
			System.out.println("deposit failed!!!");
		}
		
	
		System.out.println("savObj : "+savObj);
		
	}
}
/* first flight
 * 
 * FlightEngine -> should it be tested before deploying on the wings of the
 * aircraft - 2000 hours consistent - HA 7th 17th 27th 70th hour, 
 * 
 * daily operations => Mum <-> Lon 9 hours journey 10pm-> 6am mum-lon
 * 												   10am-> 6pm lon-mum
 * Why LTI conducts the exam????
 * 
 * Junit - Testing Framework (semi developed application)
 * 
 */
