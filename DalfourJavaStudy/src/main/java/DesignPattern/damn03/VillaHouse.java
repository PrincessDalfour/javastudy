package DesignPattern.damn03;

public class VillaHouse extends ABSHouse{
	@Override
	public void BuildBasic() {
		house.setBasic("砼");
	}

	@Override
	public void BuildWalls() {
		house.setWall("木");
	}

	@Override
	public void roofed() {
		house.setRoofed("瓦");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
