package test.c01;

import  java.util.Scanner;
public class encrypt {
	    public static void main(String[] args) {
	        Scanner myScanner = new Scanner(System.in);
	        System.out.println("leg:");
	        int leg = myScanner.nextInt();
	        System.out.println("head:");
	        int head = myScanner.nextInt();
	        int chick,hare;
	        if(head > leg/2)
	        	System.out.println("input error.");
	        for(chick = 0;chick < leg/2;chick++)
	        	for(hare = 0;hare < leg/4;hare++)
	        			if(4 * hare + 2 * chick == leg && hare + chick == head)
	        					System.out.println("chick="+chick+",hare="+hare);
	        			
	    }
}


 