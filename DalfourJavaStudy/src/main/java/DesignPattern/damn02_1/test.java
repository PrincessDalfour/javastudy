package DesignPattern.damn02_1;

public class test {
	public static void main(String[] args) {
		Phone phone;
		Computer computer;
		AbstractFactory factory = new AppleFactory();
		phone = factory.createPhone();
		computer = factory.createComputer();
		phone.fix();
		computer.fix();
		factory = new LenovoFactory();
		phone = factory.createPhone();
		computer = factory.createComputer();
		phone.fix();
		computer.fix();
	}
}
