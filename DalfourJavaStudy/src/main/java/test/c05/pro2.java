package test.c05;

import java.util.Scanner;

public class pro2
{
	public static void main(String[] args)
	{
		String[] str = {"d","a","l","f","o","u","r"};
		A02 a = new A02();
		try (Scanner myScanner = new Scanner(System.in)) {
			String findStr = myScanner.next();
			int index = a.find(findStr,str);
			System.out.println(index);
		}
	}
}
class A02
{
	public int find(String findStr,String[] str)
	{
		int i;
		int notFound = -1;
		for(i = 0;i<str.length;i++)
		{
			if(findStr.equals(str[i]))
				return i;
		}
		return notFound;
	}
}