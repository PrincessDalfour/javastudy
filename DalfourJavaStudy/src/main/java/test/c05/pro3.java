package test.c05;

import java.util.Scanner;

public class pro3
{
	public static void main(String[] args)
	{
		Book book = new Book();
		try (Scanner myScanner = new Scanner(System.in)) {
			int price = myScanner.nextInt();
			System.out.println(book.updatePrice(price));
		}
	}
}
class Book
{
	public int updatePrice(int price)
	{
		if(price > 150)
			price = 150;
		else if(price > 100 && price <= 150)
			price = 100;
		return price;
	}
}