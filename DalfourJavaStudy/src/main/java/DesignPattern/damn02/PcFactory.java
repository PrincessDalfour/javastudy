package DesignPattern.damn02;

public class PcFactory implements AbstractFactory{
	@Override
	public CPU produceCPU() {
		return new PcCPU();
	}

	@Override
	public RAM produceRAM() {
		return new PcRAM();
	}
}
