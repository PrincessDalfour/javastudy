package test.c02;

public class pro3
{
	public static void main(String[] args)
	{
		boolean b = true;
		for(int i = 100;i <= 999;i++)
		{
			int hundreds,tens,ones;
			hundreds = i/100;
			tens = (i - hundreds * 100)/10;
			ones = i - hundreds * 100 - tens * 10;
			if(hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones != i)
				b = false;
			if(b)
			{
				System.out.print(" " + i);
			}
			b = true;
		}
	}
}
