package test.c02;

public class pro2
{
	public static void main(String[] args)
	{
		boolean b = true;
		for(int i = 101;i <= 200;i++)
		{
			for(int j = 2;j < i;j++)//觉用sqrt会快一点
			{
				if(i%j == 0)
				{	
					b = false;
					break;
				}
			}
			if(b)
			{
				System.out.print(" " + i);
			}
			b = true;
		}
	}
}
