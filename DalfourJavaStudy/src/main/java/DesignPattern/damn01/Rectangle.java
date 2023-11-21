package DesignPattern.damn01;

public class Rectangle implements Shape {
	@Override
	public void Draw() {
		System.out.println("drawing Rectangle");
	}

	@Override
	public void Erase() {
		System.out.println("erasing Rectangle");
	}
}
