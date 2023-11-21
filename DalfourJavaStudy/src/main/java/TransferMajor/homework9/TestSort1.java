package TransferMajor.homework9;
import java.util.ArrayList;
import java.util.Collections;

public class TestSort1{
	public static void main(String args[]){
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jai",21));
		al.add(new Student(102,"KJai",22));
		al.add(new Student(104,"KJai",21));

		Collections.sort(al);
		for(Student st : al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
//Student 定义
class Student<T> implements Comparable {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.age - s.age;
	}
}