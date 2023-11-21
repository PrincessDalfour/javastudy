/*package TransferMajor.homework8;

import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] content = sc.nextLine().toCharArray();
		int i,letter = 0,space = 0,number = 0,other = 0;
		for(i = 0;i < content.length;i++){
			if(Character.isLetter(content[i])){
				letter++;
			} else if(Character.isDigit(content[i])){
				number++;
			} else if(Character.isWhitespace(content[i])){
				space++;
			}else {
				other++;
			}
		}
		System.out.println("The number of letter is:"+letter);
		System.out.println("The number of space is:"+space);
		System.out.println("The number of number is:"+number);
		System.out.println("The number of other character is:"+other);
	}
}
*/