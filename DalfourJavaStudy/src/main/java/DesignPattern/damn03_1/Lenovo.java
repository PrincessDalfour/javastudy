package DesignPattern.damn03_1;

public class Lenovo extends Builder{
	@Override
	public void buildCPU() {
		computer.setCPU("i7-13800");
	}

	@Override
	public void buildGPU() {
		computer.setGPU("RTX4090");
	}

	@Override
	public Computer createComputer() {
		return computer;
	}
}
