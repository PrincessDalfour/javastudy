package test.c03;

import java.util.Scanner;

public class pro1
{
	public static void main(String[] args)
	{
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Please enter the answer:");
			int answer = myScanner.nextInt();
			boolean b = false;
			int standardAnswer=(int)(Math.random()*10);
			while(b == false)
			{
				if(answer == standardAnswer)
				{
					System.out.println("Right!");
					b = true;
				}
				else
				{
					System.out.println("Please enter the other answer:");
					answer = myScanner.nextInt();
					b = false;
				}
			}
		}
		
	}
}
