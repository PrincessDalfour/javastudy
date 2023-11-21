package TransferMajor.homework6.demo1;

public class interfacetest {
	
	 public  static  void  main(String[]  args)  {
         FootballExtends  ft  =  new  FootballExtends();
         HockeyExtends  he  =  new  HockeyExtends();
         
         Sports  s  =  (Sports) ft;
         s.setHomeTeam(args[0]);
         s.setVisitingTeam(args[1]);
         
         Football  f  =  (Football) ft;
         f.homeTeamScored(Integer.parseInt(args[2]));
         
         s  =  he;
         s.setHomeTeam(args[0]);
         s.setVisitingTeam(args[1]);
         
         Hockey  h  =  he;
         h.endOfPeriod(Integer.parseInt(args[2]));
         
 }
}
