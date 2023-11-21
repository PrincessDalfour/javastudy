package test.c04;

import java.util.Scanner;

public class pro2
{

	public static void main(String[] args)
	{
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Please enter the value of n:");
			int n = myScanner.nextInt();
			System.out.print("sum = " +(1-Math.pow(2,n)/(1-2)));
		}
	}
}
