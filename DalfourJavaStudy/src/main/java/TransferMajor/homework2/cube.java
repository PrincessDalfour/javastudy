package TransferMajor.homework2;

import java.util.Scanner;
public class cube {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please input a int number a:");
				int ni=sc.nextInt();
				System.out.printf("invoke int cube()\nCube of a is:%d\n",Cube(ni));
				
				System.out.println("Please input a float number b:");
				float nf=sc.nextFloat();
				System.out.printf("invoke float cube()\nCube of b is:%.2f\n",Cube(nf));
				
				System.out.println("Please input a double number c:");
				double nb=sc.nextDouble();
				System.out.printf("invoke double cube()\nCube of c is:%.4f\n",Cube(nb));
			}

		}
		public static int Cube(int ni) {
			return ni*ni*ni;			
		}
		public static double Cube(double nb) {
			return nb*nb*nb;	
		}
		public static float Cube(float nf) {
			return nf*nf*nf;		
		}
	

}
