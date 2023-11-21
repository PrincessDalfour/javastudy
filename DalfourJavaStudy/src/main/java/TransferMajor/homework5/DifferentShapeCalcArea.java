/*package study.dalfour.zzy.homework5;

public class DifferentShapeCalcArea {
	public static void main(String[] args) {
		//  TODO  Auto-generated  method  stub
		displayObject(new Triangle(3,4,5));
		displayObject(new Rectangle(5,9));
        displayObject(new Circle(7));
	}
	 //displayObject方法
	static void displayObject(Shape object){
		if(object instanceof Triangle) {
			System.out.println(object.area());
		}else if(object instanceof Rectangle) {
			System.out.println(object.perimeter());
		}else if(object instanceof Circle) {
			System.out.println(object.area());
			System.out.println(object.perimeter());
		}
	}
	
}
class  Shape{
    public double area(){
    	return  0;
	}
    public double perimeter(){
    	return  0;
	}
}

class Triangle extends Shape{
    private double a,b,c;
    
    public Triangle(double a,double b,double c) {
    	super();
    	this.a  =  a;
    	this.b  =  b;
	this.c  =  c;
    }        

    @Override
    public double area() {
    	//  TODO  Auto-generated  method  stub
    	double p=(a+b+c)/2;
    	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
    	//  TODO  Auto-generated  method  stub
    	return  a+b+c;
    }        
}

class  Rectangle  extends  Shape{
    private  double  length,width;
    
    public  Rectangle(double  length,  double  width)  {
            super();
            this.length  =  length;
            this.width  =  width;
    }

    @Override
    public  double  area()  {
            //  TODO  Auto-generated  method  stub
            return  length*width;
    }

    @Override
    public  double  perimeter()  {
            //  TODO  Auto-generated  method  stub
            return  2*(length+width);
    }        
}

class  Circle  extends  Shape{
    private  double  r;

    public  Circle(double  r)  {
            super();
            this.r  =  r;
    }

    @Override
    public  double  area()  {
            //  TODO  Auto-generated  method  stub
            return  Math.PI*r*r;
    }

    @Override
    public  double  perimeter()  {
            //  TODO  Auto-generated  method  stub
            return  2*Math.PI*r;
    }
}*/