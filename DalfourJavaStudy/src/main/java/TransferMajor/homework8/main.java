package TransferMajor.homework8;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a string:");
		String originalString = scanner.nextLine();
		String reversedString = reverse(originalString);
		System.out.println("reverse is:" + reversedString);
		boolean isPalindrome = isPalindrome(originalString);
		System.out.println("ispalindrome:" + isPalindrome);
	}

	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}