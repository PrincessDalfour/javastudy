package TransferMajor.homework2;

import java.util.Scanner;
public class reverse {
	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				int number = input.nextInt();
				Reverse(number);
			}
	    }
	    public static void Reverse(int number){
	        int reverseNumber = 0;
	        do {
	            reverseNumber = reverseNumber * 10 + (number % 10);
	            number /= 10;
	        }while (number > 0);
	        System.out.println(reverseNumber);
	    }

}
