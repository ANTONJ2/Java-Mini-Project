package OnlineVotingSystemPackage;

import java.util.Scanner;

public class userregistration{
public int id;	
public String name;
public int age;
public String place;
public String MAILId;
public String Password;
userregistration(){
	
}
	userregistration(int id,String name, int age, String place,String mailid, String password){
		
		this.id=id;
		this.name=name;
		this.age=age;
		this.place=place;
		this.MAILId=mailid;
		this.Password=password;
		System.out.println("Hi "+name.toUpperCase()+" \n Thank you for registering to the voters portal");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter ID");
		int enterId=sc.nextInt();
		System.out.println("enter Name");
		String enterName=sc.next();
		System.out.println("How old are you?");
		int enterAge=sc.nextInt();
		System.out.println("enter your place");
		String enterplace=sc.next();
		System.out.println("enter mail id");
		String mailid=sc.next();
		System.out.println("set your password");
		String password=sc.next();
		userregistration u=new userregistration(enterId,enterName,enterAge,enterplace,mailid,password);
		Loginpage l=new Loginpage(mailid,password);
		agefilter a=new agefilter();
		a.agechecker(u);
		votecasting v=new votecasting();
		
		
	

	}

}
