package DesignPattern.damn01;

public class test {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = ShapeFactory.createShape("Circle");
		circle.Draw();
		circle.Erase();
	}
}
