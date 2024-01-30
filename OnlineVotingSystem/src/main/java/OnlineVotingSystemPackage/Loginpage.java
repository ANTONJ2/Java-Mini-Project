package OnlineVotingSystemPackage;

import java.util.Scanner;


public class Loginpage extends userregistration  {
	
	Loginpage(){
		
	}
Loginpage(String mailid, String password ){
	System.out.println("Welcome to the VOTERS PORTAL, \nplease enter your mail id and password to continue....");
	Scanner sc=new Scanner(System.in);
	userregistration u=new userregistration();
	System.out.println("please enter your MAILID:");
	String mailidoflogin=sc.next();
	System.out.println("please enter your PASSWORD:");
	String passwordoflogin=sc.next();
	if(password.isEmpty()|| mailid.isEmpty()) {
		System.out.println("Please reenter the login credentials..");
	}else if(mailidoflogin.equalsIgnoreCase(mailid)||passwordoflogin.equalsIgnoreCase(password)) {
		System.out.println("you have successfully logged into the voters portal");
	}else {
		System.out.println("please enter valid credentials");
	}
	}
	public static void main(String[] args) {
		
		
        
	}
	


	
	
		
	}

	


