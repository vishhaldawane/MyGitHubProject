package com.lti.test;
/*
 * 
 * what is the syntax for importing static members using import keyword?
 * 
 * 	1. import static
 *  2. static import
 *  3. import
 *  4. package static
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.lti.java.Bank;
import com.lti.java.SavingsAccount;

public class SavingsAccountTest {  //TestCase,  Tests, begin or end with Test
	
	static SavingsAccount savingsAccount;
	
	@BeforeAll
	static void initialize() {
		
		savingsAccount = Bank.getObject();
		System.out.println("initialize "+savingsAccount);
	}
	
	@BeforeEach
	void setUp() {
		 System.out.println("setUp() beforeEach invoked...");
		 //savingsAccount = Bank.getObject();
		 System.out.println("some coding...1");
		 System.out.println("some coding...2");
		 System.out.println("some coding...3");	   	
	}
	
	@Test
	void test3() {
	        System.out.println("Testing the deposit() method");
	        System.out.println("Creating object...");
	        
	    assertNotNull(savingsAccount);
	    
	        System.out.println("Object created..."+savingsAccount.hashCode());

	        double balanceBeforeDeposit = savingsAccount.getAccountBalance();
	        System.out.println("Invoking method");
	        double amountToDeposit = 3000;

	        savingsAccount.deposit(amountToDeposit);

	    assertEquals(balanceBeforeDeposit+amountToDeposit,  savingsAccount.getAccountBalance());

	    //  savingsAccount.withdraw(2000);
	        System.out.println("Deposit Method succeeded ..");
	}
	
	@Test
	public void test2() {
		System.out.println("Testing started  : .....");
		
		assertTrue(14>5); //strong belief - opinion
		System.out.println("passed1");
		
		assertTrue(240>50);
		System.out.println("passed2");
		
		assertTrue(34>5);
		System.out.println("passed3");
		
		SavingsAccount savObj = new SavingsAccount(100,"Julie",5000);
		
		System.out.println("Testing finished : .....");
	}
	
	//@RepeatedTest(3)
	@Test
	void test1() {
	        System.out.println("Testing the withdraw() method");
	        System.out.println("Creating object...");
	    String str="A"; // String str = something.getSomething();
	    byte array[] = str.getBytes(); // = {10,20,30};
	    
	    assertTrue(array.length>0);
	    System.out.println("running the for loop..");
	    for(int x : array ) {
	    	System.out.println(x+" x "+(char)x);
	    }
	    System.out.println("for loop is over...");
	    
	    assertNotNull(savingsAccount);

        System.out.println("Object created..."+savingsAccount.hashCode());

        	double balanceBeforeWithdraw = savingsAccount.getAccountBalance();
	        System.out.println("Invoking method");
	        double amountToBeWithdrawn = 3500;
	        Throwable throwable = assertThrows(RuntimeException.class, () -> 
	        	savingsAccount.withdraw(amountToBeWithdrawn));

	       
	    assertNotEquals("Insufficient balance exception",throwable.getMessage());
	           		
	    assertEquals(balanceBeforeWithdraw-amountToBeWithdrawn,  savingsAccount.getAccountBalance() );

	    //  savingsAccount.withdraw(2000);
	    assertTrue(savingsAccount.getAccountBalance() > 0 );
	        System.out.println("Withdraw Method succeeded .."+savingsAccount.getAccountBalance());
	        System.out.println("----------------------");
	}
	//bus booking system - 43 test cases - 
	//findBus() { }  findTicket() { }  findCustomer()
	//bookTicket() {} cancelTicket() { }
	// reservationChart(){ }
	//seatSelection(){ }	...
	
}
/*

	layer1	-	database tables
	layer2	-	pojo
	layer3	-	repo - jdbc - jpa code
					 
					
	layer4  -   service - business layer bookTicket() { .... } cancelTicket() { ... }
					
					
	layer5  -   controller
	layer6  -   Angular
	
	
	
	
	Maven
			- project management tool
			
			
	machine1	machine2	machine3	machin4		machine5
	x86			x86			x86			PowerPC		x86
	Windows10	Windows8	Redhat		Mac			Ubuntu
	JDK16		JDK11		JDK8		JDK9		JDK8
	jvm-jars	jvm-jar		jvm-jar		jvm-jar		jvm-jar
	oracle10	ora12		oracle18	oracle10	oracle11
	.jar		.jar		.jar		.jar		.jar
	ojdbc6.jar   			ojdbc8.jar	..			..	
	
	JavaProject1			JavaProject1	
	office					home
	1000					1200	
	eclipse jdk16
	
	cmd -> jdk8
	
	Develop		Savings.java  Current.java Fixed.java 
	validation
	Test		TestSavings.java TestCurrent... 15 test cases
	package		jar -cvf bank.jar  *.class *.gif *.conf *.txt
	Deployment	copy jar at the target machine for customer use
	
	
	Tar - Tape ARchieve
	
	Java ARchieve - 
			|
			single file ( bundled with multiple files in it )
			
	
	Repositories
		|
	-------------------
	|		|		|
	local 	central	remote
	
	c:\vishhal> 
			|
		myproject
			|
			mvn --> searches for a file build.xml
	
	
	
		mvn archetype:generate  
		1
		2
		3
		4
		5
		..
		44
		555
		667
		Enter your choice : 5
		
		project has a package name -> groupId				com.lti
		project has a name		   -> artifactId			BankingProject
		project structure		   -> archetypeArtifactId 	maven-archetype-quickstart
		if you want to skip
		interactiveness from maven -> interactiveMode=false  
		
1. start the cmd prompt
2. make a desired folder - mkdir myprojects - u may skip this step
3. cd myprojects						- u may skip this step
4. mvn archetype:generate -DgroupId=com.lti -DartifactId=BankingProject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
5. cd BankingProject <-- change directory
6. add the properties tag in pom.xml file - U MAY SKIP THIS
	=> notepad pom.xml and put the following line before 
	<dependencies>
	 <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

7. mvn compile <-- if u are getting error of compile version of source code then follow step 6
8. tree/f
9. mvn test
10. tree/f
11. mvn package
12. tree/f
13. cd target 
14. java -cp BankingProject-1.0-SNAPSHOT.jar com.lti.App
    


1 validate - source code version validation
2 compile - javac 
3 test  - junit
4 package -jar

5 integration-test
6 verify
7 install
8 deploy

		
		Core Java		WebProject		WebProjectSpring	WebProject Spring JPA
		|					|					|		
	-------				-------			-----------				-----
	|    |				|	
	bin	src				WEB-INF
						|
					--------
					|
					classes
		
		
		
		
		
	
	
	
	
	repository | kitchen | code/resources storage 
	
	
	git 			and 		github
	|								|
	client						central repository 
	side
	utility command
	to maintain
	local files
	--------
	local repository
	management
	
	VERSION CONTROL SYSTEM
	
								github - remote repository
								  |
								  BankingProject <- repository
									|
									com.lti
									|
						pojo	payee	statement  transfer  controller
	
	git					git				git				git					git
	lyricist			musician		singer			chorus				music-director
	1 --
	2 --
	   3 -- [chorus[
	   4 --
	 
	    
	MACHINE1			MACHINE2		MACHINE3		Machine4			Machine5
	|					|				|				|						|				
	jack				janet			robert			smith				 julie
	|					|				|					|					|
1	Savings.java	AddPayee.java	Statement.java		  TransferService   Controller.java
	Current.java	ViewPayee.java  YearlyStatement.java  PayeeService
	Fixed.java		DeletePayee.java
	
2
3
4
5
	1. start the gitbash
	2. make a folder
	3. cd folder
	4. git init <-- to initlalize the repo
	5. git add abc.java
	6. git add pqr.java
	7. git status
	8. git config --global user.email "github lti signupe mail"
	9. git config --global user.name "github user name"
	10. if password is prompted - sign in with browser
	11. git branch -M main <-- switching main branch
	12. git remote add origin https:...repo name.git
	13. git push -u origin main
	
	
	
	
	
	
	
	
	
	
	

*/