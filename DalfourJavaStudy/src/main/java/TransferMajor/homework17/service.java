package TransferMajor.homework17;


public class service {
	public static void main(String[] args) {
		people p;
		p = new teacher();p.Service();
		p = new doctor();p.Service();
		p = new police();p.Service();
		p = new soldier();p.Service();
		p = new people();p.Service();
	}
}

class people implements ServeThePeople{
	String name = "people";
	public void Service() {
		System.out.println("Do your job.");
	}
}
class teacher extends people{
	String name = "teacher";
	public void Service() {
		System.out.println("Preach,Knowledge,Dispels doubt.");
	}
}
class doctor extends people{
	String name = "doctor";

	@Override
	public void Service() {
		System.out.println("heal the wounded and rescue the dying.");
	}
}
class police extends people{
	String name = "police";

	@Override
	public void Service() {
		System.out.println("uphold the rule of law.");
	}
}
class soldier extends people{
	String name = "soldier";

	@Override
	public void Service() {
		System.out.println("protect our homes and defend our country.");
	}
}
