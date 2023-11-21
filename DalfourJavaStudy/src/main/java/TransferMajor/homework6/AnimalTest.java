package TransferMajor.homework6;

public class AnimalTest {

	public static void main(String args[]){
		MammalInt m = new MammalInt();
		m.eat(args[0]);
		m.travel(args[1]);
	}

}

//interface Animal
interface Animal {
	public void eat(String food);
	public void travel(String place);
}

//class MammalInt
class MammalInt implements Animal{

	public void eat(String food){
		System.out.println("Mammal eats " + food);
	}

	public void travel(String place){
		System.out.println("Mammal travels "+place);
	}
}


