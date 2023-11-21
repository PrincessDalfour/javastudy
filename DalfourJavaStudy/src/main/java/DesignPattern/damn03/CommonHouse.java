package DesignPattern.damn03;

public class CommonHouse extends ABSHouse{
	@Override
	public void BuildBasic() {
		house.setBasic("木");
	}

	@Override
	public void BuildWalls() {
		house.setWall("竹");
	}

	@Override
	public void roofed() {
		house.setRoofed("叶");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
