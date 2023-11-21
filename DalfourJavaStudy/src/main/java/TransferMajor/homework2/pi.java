package TransferMajor.homework2;

import java.util.Scanner;

public class pi {

	    public static void main(String[] args) {
	        double a,b = 0;
	        try (Scanner myScanner = new Scanner(System.in)) {
				System.out.println("Please input a number(10000-100000):");
				int n = myScanner.nextInt();
				int c;
				if(n < 10000 || n > 100000)
					System.out.println("The input data is out of range!");
				else {
					for (int i = 1; i <=n;  i++) {
						c = (i%2 == 0)? -1:1;
						b = b +c *(1.0/(2*i-1));
					}
				
				a = 4*b;
				System.out.println("PI="+a);
				}
			}
	    }

}
