package TransferMajor.homework2;

import java.util.Scanner;

public class averagescore {
		public static void main(String[] args) {
	    	float result = 0;
	        Scanner sc = new Scanner(System.in);
	        float[] grade = new float[10];
	        Scanner myScanner = new Scanner(System.in);
	        int n = myScanner.nextInt();
	        for (int j = 0; j < n; j++) {
	            float countGrade = sc.nextFloat(); 
	            grade[j] = countGrade;
	        float tall = grade[0];
	        float tow  = grade[0];
	        for (int i = 0; i < n; i++) {
	            if(grade[i] > tall){
	                tall = grade[i];
	            }
	            if(grade[i] < tow){
	                tow = grade[i];
	            }
	        }
	        
	        for (int p = 0;p < n;p++) {
	            result = result + p;
	        }
	        result = (result-tall-tow)/(n-2);
	    }
	        System.out.println("average score:"+result);
	    }
	    }