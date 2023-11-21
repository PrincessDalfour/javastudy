package DesignPattern.damn01;

public class Circle implements Shape {
	@Override
	public void Draw() {
		System.out.println("drawing Circle");
	}

	@Override
	public void Erase() {
		System.out.println("erasing Circle");
	}
}
