package TransferMajor.homework2;

import java.util.Scanner;

public class TEA {
	 public static void main(String[] args){
	  try (Scanner myScanner = new Scanner(System.in)) {
		System.out.println("Please enter the plsintext you want to encrypt:");
		  String plsinText = myScanner.next(); 
		  encrypt e = new encrypt();
		  System.out.println(e.encode(plsinText));
	}
	 }
}

	class encrypt{
		public char[] encode(String plsinText) {
			char[] cipherText = plsinText.toCharArray();
			char[] error = {'e','r','r','o','r'};
			for(int i=0;i<cipherText.length;i++){
				if(cipherText[i] >= 97 && cipherText[i] <= 122){
					cipherText[i] = (char)(219 - cipherText[i]);
					}else if(cipherText[i] >= 48 && cipherText[i] <= 57){
						cipherText[i] = (char)(cipherText[i] + 5);
					}else if(cipherText[i] >= 65 && cipherText[i] <= 88){
						cipherText[i] = (char)(cipherText[i] + 2);
					}else if(cipherText[i] >= 89 && cipherText[i] <= 90){
						cipherText[i] = (char)(cipherText[i] - 24);
					}else if(cipherText[i] >= 19968 && cipherText[i] <= 40869){
						cipherText[i] = '$';
					}else{
						return error;
			}
		}
			return cipherText;	
	}
}