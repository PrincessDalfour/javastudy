package DesignPattern.damn03;

public abstract class ABSHouse {
	protected House house = new House();

	public abstract void BuildBasic();
	public abstract void BuildWalls();
	public abstract void roofed();

	public abstract House getHouse();
}
