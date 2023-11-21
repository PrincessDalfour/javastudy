package test.c04;

public class pro1
{
	public static void main(String[] args)
	{
		int total = 100,dogPrice = 2,catPrice = 3,rabbitPrice = 5;
		int count = 0;
		for(int dogNum = 1;dogNum <= total / dogPrice;dogNum++)
		{
			for(int catNum = 1;catNum <= total / catPrice;catNum++)
			{
				for(int rabbitNum = 1;rabbitNum <= total / rabbitPrice;rabbitNum++)
				{
					if(dogNum*dogPrice+catNum*catPrice+rabbitNum*rabbitPrice==100)
					{
						System.out.print("\ndog:"+dogNum+"  cat:"+catNum+"  rabbit:"+rabbitNum);
						count++;
					}
				}
			}
		}
		System.out.println("\nThere is(are) "+count+" purchase plan(s).");
	}
}
