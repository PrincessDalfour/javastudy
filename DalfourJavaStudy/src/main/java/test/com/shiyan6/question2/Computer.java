package test.com.shiyan6.question2;

public class Computer {
	String CPU;
	int RAM;
	String HDD;
	public void getDetails() {
		System.out.println(CPU);
		System.out.println(RAM);
		System.out.println(HDD);
	}
}
class PC extends Computer {
	String brand;
	public void getDetails() {
		System.out.println(CPU);
		System.out.println(RAM);
		System.out.println(HDD);
		System.out.println(brand);
	}
}
class NotePad extends Computer {
	String color;
	public void getDetails() {
		System.out.println(CPU);
		System.out.println(RAM);
		System.out.println(HDD);
		System.out.println(color);
	}
}