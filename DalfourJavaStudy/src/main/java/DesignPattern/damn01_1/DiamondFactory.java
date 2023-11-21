package DesignPattern.damn01_1;

public class DiamondFactory implements AbstractShapeFactory{
	@Override
	public Shape createShape() {
		return new Diamond();
	}
}
