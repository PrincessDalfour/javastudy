package test.c02;

import java.util.Scanner;

public class pro1
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		double upCab = 2.5,upCel = 3,upPork = 18.5;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Plesae enter the number of cabbage:");
		double numCab = myScanner.nextDouble();
		upCab = numCab * upCab;
		System.out.println("Plesae enter the number of celery:");
		double numCel = myScanner.nextDouble();
		upCel = numCel * upCel;
		System.out.println("Plesae enter the number of pork:");
		double numPork = myScanner.nextDouble();
		numPork = numPork * upPork + upCab + upCel;
		System.out.print("Total price is " + numPork);
	}
}
