package TransferMajor.homework8;

import  java.util.Scanner;

public  class  Work6  {
	public  static  void  main(String[]  args)  {
		Scanner  input  =  new  Scanner(System.in);
		String  str  =  input.nextLine();
		StringBuilder  sb  =  new  StringBuilder("");

		char  current  =  str.charAt(0);
		int  count  =  1;
		//

		for(int i = 1;i < str.length();i++){
			char c = str.charAt(i);
			if(c == current){
				count++;
			} else {
				if(count == 1){
					sb.append(current);
				} else {
					sb.append(current).append(count);
				}
				current = c;
				count = 1;
			}
		}


		if  (count  ==  1)  sb.append(current);
		else  sb.append(current).append(count);

		System.out.println(sb.toString());
	}
}
