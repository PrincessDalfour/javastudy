package DesignPattern.damn03_1;

public class Director {
	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}

	public Computer constructComputer(){
		builder.buildCPU();
		builder.buildGPU();
		return builder.createComputer();
	}
}
