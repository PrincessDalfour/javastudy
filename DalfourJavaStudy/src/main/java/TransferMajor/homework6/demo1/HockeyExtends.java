package TransferMajor.homework6.demo1;

public class HockeyExtends implements Hockey{

	@Override
	public void setHomeTeam(String homeTeamName) {
		
		System.out.println("Hockey homeTeam is "+homeTeamName);
	}

	@Override
	public void setVisitingTeam(String visitingTeamName) {
		
		System.out.println("Hockey visitingTeam is "+visitingTeamName);
		
	}

	@Override
	public void endOfPeriod(int finalResult) {
		
		System.out.println("Hockey endOfPeriod is "+finalResult);
		
	}

}
