package TransferMajor.homework6;

import java.util.Scanner;

//Math.PI
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w,h,ph,r;
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		h = sc.nextInt();
		ph = sc.nextInt();
		r = sc.nextInt();

		Pillar pillar;
		Geometry bottom;


		bottom = new Rect(w,h); //接口实现方法
		pillar = new Pillar (bottom, ph);
		System.out.println("Rect bottom Pillar volume:" + pillar.Volume());

		bottom = new Circle(r);
		pillar = new Pillar(bottom, ph);
		System.out.println("Circle bottom Pillar volume:" + pillar.Volume());
	}

}


/*
 * interface Geometry
 */
interface Geometry {
	public double getArea();
}

/*
 * class Pillar
 */
class Pillar{
	Geometry bottom;
	double height;
	public Pillar(Geometry bottom, double height){
		this.bottom=bottom;
		this.height=height;
	}
	public double Volume(){
		return bottom.getArea()*this.height;
	}
}

/*
 * class Circle
 */
class Circle implements Geometry {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}

}

/*
 * class Rect
 */
class Rect implements Geometry {
	double wide, length;

	public Rect(double wide, double length) {
		this.wide = wide;
		this.length = length;
	}

	public double getArea() {
		return wide * length;
	}
}


