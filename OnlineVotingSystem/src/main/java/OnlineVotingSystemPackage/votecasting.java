package OnlineVotingSystemPackage;

import java.util.Scanner;

public class votecasting extends listOfCandidates{
public votecasting() {
	listOfCandidates l=new listOfCandidates();
	
	
	System.out.println("Who would you like to vote for?");
	super.displaycandidates();
	Scanner s=new Scanner(System.in);
	System.out.println("please cast your vote");
	String vote=s.next().toLowerCase();
	switch(vote) {
	case "raj":
		System.out.println("you have voted for Raj! Your vote has been casted");
		break;
	case "ven":
		System.out.println("you have voted for Ven! Your vote has been casted");
		break;
	case "nick":
		System.out.println("you have voted for Nick! Your vote has been casted");
		break;
	case "shine":
		System.out.println("you have voted for Shine! Your vote has been casted");
		break;
		default:
			System.out.println("Your vote has been repealed, try again later!");
		
						
	}
}

	

}
