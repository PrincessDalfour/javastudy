package DesignPattern.damn14;

public class Gj19Student implements Comparable<Gj19Student> {
	private String name;
	private int age;
	public Gj19Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public  Gj19Student(){}
	public int compareTo(Gj19Student stu) {
		if (this.age > stu.age) {
			return -1;
		} else if (this.age < stu.age) {
			return 1;
		}
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Gj19Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}