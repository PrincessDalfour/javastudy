package TransferMajor.homework4;

import java.util.Scanner;

public class SimpleCircle {
	int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	double getArea(int n) {
		return (Math.PI * n * n);
	}
	
	static void printAreas(SimpleCircle myCircle, int n) {
		for (int i = 1; i <= n; i++) {
	        System.out.printf("Area is:%.2f\n",myCircle.getArea(i));
	    }
	}
	public static void main(String[] args){
		SimpleCircle myCircle = new SimpleCircle();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0 && n < 10) {
        	myCircle.setR(n);
        }else
        	System.out.println("error");
        printAreas(myCircle,n);
	}
}
