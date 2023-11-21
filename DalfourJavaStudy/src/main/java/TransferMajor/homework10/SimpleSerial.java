package TransferMajor.homework10;

import java.io.*;

class Box implements Serializable {
	private int width = 1;
	private int height = 1;

	public Box() {

	}

	public Box(int w, int h) {
		width = w;
		height = h;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box width:" + width + " height:" + height;
	}
}

class Person implements Serializable {

	private String name = null;

	private Integer age = null;

	private Box box = null;

	public Person() {
		System.out.println("none-arg constructor");
	}

	public Person(String name, Integer age, Box box) {
		System.out.println("arg constructor");
		this.name = name;
		this.age = age;
		this.box = box;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + box + "]";
	}
}


public class SimpleSerial {

	public static void main(String[] args) throws Exception {
		File file = new File("person.out");
		//创建ObjectOutputStream  对象（一行代码）
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

		Person person = new Person(args[0], Integer.valueOf(args[1]), new Box(Integer.valueOf(args[2]), Integer.valueOf(args[3])));
		//写入对象和关闭流对象（两行代码）
		out.writeObject(person);
		out.close();
		//编写从文件读取对象代码，创建输入对象流，读取流对象，关闭流，对象newPerson 为Object类型的引用（三行代码，）
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		Person newPerson = (Person) in.readObject();
		in.close();
		System.out.println(newPerson);
	}
}
