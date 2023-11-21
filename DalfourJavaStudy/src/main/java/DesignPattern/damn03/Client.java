package DesignPattern.damn03;

public class Client {
	public static void main(String[] args) {
		Director director = new Director(new CommonHouse());
		House house = director.createHouse();
		System.out.println(house.getBasic());
		System.out.println(house.getWall());
		System.out.println(house.getRoofed());
	}
}
