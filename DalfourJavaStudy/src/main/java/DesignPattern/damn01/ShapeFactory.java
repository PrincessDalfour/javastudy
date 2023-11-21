package DesignPattern.damn01;

public class ShapeFactory {
	public static Shape createShape(String type) {
		if (type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Triangle")) {
			return new Triangle();
		} else if (type.equals("Rectangle")) {
			return new Rectangle();
		} else
			return null;
	}
}
