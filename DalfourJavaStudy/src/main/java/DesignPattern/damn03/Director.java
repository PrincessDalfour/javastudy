package DesignPattern.damn03;

public class Director {
	private ABSHouse absHouse;
	public Director(ABSHouse absHouse){
		this.absHouse = absHouse;
	}
	public House createHouse(){
		absHouse.BuildBasic();
		absHouse.BuildWalls();
		absHouse.roofed();
		return absHouse.getHouse();
	}
}
