package TransferMajor.homework8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String content = sc.nextLine();
		System.out.println(content.length()+" characters");
		String[] words = content.split(" ");
		System.out.println(words[0]+words[2]);
		System.out.println(words.length+" words");
	}
}
