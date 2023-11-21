package TransferMajor.homework4;

public class ShapeTest {
	
	 public static void main(String[] args) {

         Rectangle r = new Rectangle();
         System.out.println(r.area()+","+r.perimeter());
         Circle c = new Circle();
         System.out.println(c.area()+","+c.perimeter());
         @SuppressWarnings("unused")
		Shapes s = r;
         s = c;
         r = new Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
         System.out.println(r.area()+","+r.perimeter()); 
         c = new Circle(Double.parseDouble(args[2]));
         System.out.println(c.area()+","+c.perimeter());        
         
	}
	 
}

class Shapes{
	
    double area() {
    	return 0;
    }
    
    double perimeter() {
    	return 0;
    }
    
}

class Rectangle extends Shapes{
	
	double a,b;
	
	public Rectangle() {
		a = 1;
		b = 1;
	}
	
	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}

    double area() {
    	return a * b;
    }
    
	double perimeter() {
    	return 2 * ( a + b );
    }
}

class Circle extends Shapes{
	
	double r;

	public Circle() {
		r = 1;
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	double area() {
    	return Math.PI * r * r;
    }
	
	double perimeter() {
    	return 2 * Math.PI * r;
    }
	
}