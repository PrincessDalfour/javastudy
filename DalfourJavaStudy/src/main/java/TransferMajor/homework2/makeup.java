package TransferMajor.homework2;

import java.util.Scanner;

public class makeup {
	public static boolean isPrime(long n){ 
		int i = 2;
		while ((long) i *i <= n){
				if (n % i ==0)
					return false;
				i++;
		}
		return true;
	}
	
	public static String reverseStr(String str){
		String result = "";
		for (int i = str.length()-1; i >= 0; i--){
			result+= str.charAt(i);
		}
		return result;
	}
	
	public static boolean reverseJudge(long n){
		String nStr = reverseStr(n + "");
		return isPrime(Integer.parseInt(nStr));
	}
	
	public static boolean isPalindromic(long n){
		String str1 = n + "";
		String str2 = reverseStr(str1);
		return !str1.equals(str2);
	}
	
	public static void main(String[] args){
		int n = 0;
		int i = 2;
		try (Scanner myScanner = new Scanner(System.in)) {
			int m = myScanner.nextInt();
			while (n < m){
				if (isPalindromic(i) && isPrime(i) && reverseJudge(i)){
					System.out.print(i + " ");
					n++;
					if (n % 10 == 0)
						System.out.println();
				}
				i++;
			}
		}
	}
}

