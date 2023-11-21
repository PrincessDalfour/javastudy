package DesignPattern.damn02_1;

public class LenovoFactory implements AbstractFactory {
	@Override
	public Computer createComputer() {
		return new LenovoComputer();
	}

	@Override
	public Phone createPhone() {
		return new LenovoPhone();
	}
}
