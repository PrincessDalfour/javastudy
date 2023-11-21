package test.c02;

import java.util.Scanner;

public class pro4
{
	public static void main(String[] args)
	{
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Please enter the value of x,y,z:");
			int x = myScanner.nextInt();
			int y = myScanner.nextInt();
			int z = myScanner.nextInt();
			if(x>y)
			{
				int temp;
				temp = x;
				x = y;
				y = temp;
			}
			if(y>z)
			{
				int temp;
				temp = y;
				y = z;
				z = temp;
			}
			if(x>y)
			{
				int temp;
				temp = x;
				x = y;
				y = temp;
			}
			System.out.print(""+x);
			System.out.print(" "+y);
			System.out.print(" "+z);
		}
	}
}
