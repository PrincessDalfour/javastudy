package DesignPattern.damn02;

public class MacFactory implements AbstractFactory{
	@Override
	public CPU produceCPU() {
		return new MacCPU();
	}

	@Override
	public RAM produceRAM() {
		return new MacRAM();
	}
}
