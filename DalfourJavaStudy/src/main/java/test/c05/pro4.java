package test.c05;

import java.util.Scanner;

public class pro4
{
	public static void main(String[] args)
	{
		Cale Calculate = new Cale();
		try (Scanner myScanner = new Scanner(System.in)) {
			double n1 = myScanner.nextDouble();
			double n2 = myScanner.nextDouble();
			System.out.println(Calculate.Plus(n1,n2));
			System.out.println(Calculate.Subtract(n1,n2));
			System.out.println(Calculate.Multiplication(n1,n2));
			double resultDevided = Calculate.Divide(n1,n2);
			if(Calculate.t)
				System.out.println(resultDevided);
			else
				System.out.println("No number can be divided by 0.");
		}
	}
}
class Cale
{
	public Cale()
	{
		
	};
	
	boolean t = true;
	public double Plus(double number_1,double number_2)
	{
		return (number_1 + number_2);
	}
	
	public double Subtract(double number_1,double number_2)
	{
		return (number_1 - number_2);
	}
	
	public double Divide(double number_1,double number_2)
	{
		if(number_2 == 0)
		{
			t = false;
			return 0;
		}
		else
		{
			t = true;
			return (number_1 / number_2);
		}
	}
	
	public double Multiplication(double number_1,double number_2)
	{
		return (number_1 * number_2);
	}
}