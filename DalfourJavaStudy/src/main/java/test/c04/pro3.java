package test.c04;

public class pro3
{
	public static void main(String[] args)
	{
		int A,B,C,D,E,F;
		for(A = 0;A <= 1;A++)
		{
			for(B = 0;B <= 1;B++)
			{
				for(C = 0;C <= 1;C++)
				{
					for(D = 0;D <= 1;D++)
					{
						for(E = 0;E <= 1;E++)
						{
							for(F = 0;F <= 1;F++)
							{
								if(
									(A+B>=1)&&
									(A+E+F>=2)&&
									(A+D==1)&&
									(B+C!=1)&&
									(C+D==1)&&
									(
									 (D+E==0)||
									 (D+E==2)||
									 (
									  (D==1)&&(E==0)
									 )
									)
								  )
								{
									System.out.print("\n A:"+A);
									System.out.print("\n B:"+B);
									System.out.print("\n C:"+C);
									System.out.print("\n D:"+D);
									System.out.print("\n E:"+E);
									System.out.print("\n F:"+F);
								}
							}
						}
					}
				}
			}
		}
	}
}
