package DesignPattern.damn02;

public class Client {

	public static void main(String[] args) {
		CPU cpu;
		RAM ram;
		AbstractFactory factory = new PcFactory();
		cpu = factory.produceCPU();
		ram = factory.produceRAM();
		cpu.play();
		ram.play();
	}
}

