package TransferMajor.homework6.demo1;

public class FootballExtends implements Football{

	@Override
	public void setHomeTeam(String homeTeamName) {
		
		System.out.println("Football homeTeam is "+homeTeamName);
	}

	@Override
	public void setVisitingTeam(String visitingTeamName) {
		
		System.out.println("Football visitingTeam is "+visitingTeamName);
	}

	@Override
	public void homeTeamScored(int homeTeamScore) {
		System.out.println("Football homeTeam scored "+homeTeamScore);
	}

}
