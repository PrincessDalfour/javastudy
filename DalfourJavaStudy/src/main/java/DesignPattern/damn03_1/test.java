package DesignPattern.damn03_1;

public class test {
	public static void main(String[] args) {
		Director director = new Director(new Lenovo());
		Computer computer = director.constructComputer();
		System.out.println(computer.getCPU());
		System.out.println(computer.getGPU());
	}
}
