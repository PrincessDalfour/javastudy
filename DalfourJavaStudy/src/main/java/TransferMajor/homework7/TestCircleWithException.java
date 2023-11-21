package TransferMajor.homework7;

import  java.util.*;
public  class  TestCircleWithException  {
	public  static  void  main(String[]  args)  {
		Scanner  in  =  new  Scanner(System.in);
		int  radius  =  in.nextInt();
		if (radius < 0) {
			System.out.println("java.lang.IllegalArgumentException: Radius cannot be negative");
		} else {
			CircleWithException circle = new CircleWithException(radius);
			try {
				circle.setRadius(radius);
				System.out.printf("The area of the circle is:%.2f", circle.findArea());
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			}
		}

	}
}

class  CircleWithException  {
	private  double  radius;

	public  CircleWithException(double  newRadius)  {
		setRadius(newRadius);
	}

	public  double  getRadius()  {
		return  radius;
	}

	public  void  setRadius(double  newRadius) throws  IllegalArgumentException  {

		if(newRadius >= 0){
			radius = newRadius;
		}else{
			throw new IllegalArgumentException("Radius cannot be negative");
		}

	}

	public  double  findArea()  {
		return  radius  *  radius  *  3.14159;
	}
}