package TransferMajor.homework7;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {

		System.out.println("Input a radius:");
		Scanner sc = new Scanner(System.in);
		try{
			double input = Double.parseDouble(sc.next());
			System.out.println("area="+input*input*Math.PI);
		}catch (NumberFormatException e){
			System.out.println("java.util.InputMismatchException");
			System.out.println("Number Format Error.");
		}
	}

}
