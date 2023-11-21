package DesignPattern.damn03_1;

public class MAC extends Builder{
	@Override
	public void buildCPU() {
		computer.setCPU("M2");
	}

	@Override
	public void buildGPU() {
		computer.setGPU("NULL");
	}

	@Override
	public Computer createComputer() {
		return computer;
	}
}
