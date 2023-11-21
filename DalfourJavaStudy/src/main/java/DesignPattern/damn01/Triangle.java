package DesignPattern.damn01;

public class Triangle implements Shape {
	@Override
	public void Draw() {
		System.out.println("drawing Triangle");
	}

	@Override
	public void Erase() {
		System.out.println("erasing Triangle");
	}
}
