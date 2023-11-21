package DesignPattern.damn02_1;

public class AppleFactory implements AbstractFactory {
	@Override
	public Computer createComputer() {
		return new MAC();
	}

	@Override
	public Phone createPhone() {
		return new iPhone();
	}
}
