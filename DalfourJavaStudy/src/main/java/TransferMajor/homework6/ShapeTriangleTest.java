package TransferMajor.homework6;

public class ShapeTriangleTest {
	public static void main(String[] args) {
        Triangle t=new Triangle(3,4,5);
        System.out.println(t.area());
        System.out.println(t.perimeter());
	}
}
abstract class Shape{
	private  String  name;
    public  Shape()  {
    }
    public  Shape(String  name)  {
            this.name=name;
    }
    public  void  setName(String  name)  {
            this.name=name;                
    }
    public  String  getName()  {
            return  name;
    }
    abstract double perimeter();
    abstract double area();
}
class  Triangle extends Shape{
	double a,b,c;
	public Triangle() {
        super();
        this.a = 0;
        this.b = 0;
        this.c = 0;
}
	public Triangle(String  name)  {
        super(name);
	}
	
	public Triangle(double a,double b,double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
	}
	@Override
	double perimeter() {
		return a+b+c;
	}
	@Override
	double area() {
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}