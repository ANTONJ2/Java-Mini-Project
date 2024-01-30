package OnlineVotingSystemPackage;
interface agechecker{
	public void agechecker(userregistration u);
}
public class agefilter extends Loginpage implements agechecker {

	@Override
	public void agechecker(userregistration u) {
		
		
		if(u.age<18) {
			System.out.println("you arent 18 years old, you are not allowed to vote! Thank you");
		}else {
			System.out.println("YOU HAVE ACCESS TO THE BALLOT, \nyou can caste your vote for your favourite member from the below list");
		}
	}

}
