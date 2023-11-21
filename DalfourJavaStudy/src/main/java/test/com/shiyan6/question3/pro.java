package test.com.shiyan6.question3;

public class pro {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("dalfour");
		s.setAge(18);
		s.setID(5124);
		s.setScore(98);
		s.say();
	}

}
class Person {
	private String name;
	private int age;
	public void getName() {
		System.out.println("name:"+name);
	}
	public void getAge() {
		System.out.println("age:"+age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void say() {
		System.out.print("name:"+name+",age:"+age);
	}
}
class Student extends Person{
	private int id;
	private int score;
	public void getID() {
		System.out.println("id:"+id);
	}
	public void getScore() {
		System.out.println("score:"+score);
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void say() {
		super.say();
		System.out.print(",id:"+id+",score:"+score);
	}
}