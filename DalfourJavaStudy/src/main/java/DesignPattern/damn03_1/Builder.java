package DesignPattern.damn03_1;

public abstract class Builder {
	protected Computer computer = new Computer();

	public abstract void buildCPU();
	public abstract void buildGPU();

	public abstract Computer createComputer();
}
