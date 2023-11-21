package TransferMajor.homework5;

public class DifferentPeopleToString{

	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
    }
    
    public static void m(Object x) {
    	System.out.println(x.toString());
    }

}

class Person{
    public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Student extends Person{
    
}

class GraduateStudent extends Student{
    
}