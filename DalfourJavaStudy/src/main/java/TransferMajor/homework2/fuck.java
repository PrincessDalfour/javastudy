package TransferMajor.homework2;

import java.util.Scanner;

public class fuck {
	public static void main(String[] args) {
		int p = 0;
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter n:");
			int n = myScanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int i,j,k = 1,flag;
			System.out.println("Enter n numbers:");
			for (i = 0; i < n; i++)
				a[i] = myScanner.nextInt();
			b[0] = a[0];
			for (i = 1; i < n; i++){
				flag = 1;
				for (j = 0; j < i; j++)
					if (a[j] == a[i]){
						flag = 0;
						p = j;
						break;
					}
				
				if (flag == 1){
					b[k] = a[i];
					k++;
				}
			}
			System.out.println("The number of distinct values is "+a[p]);
			for (i = 0; i < k; i++)
				System.out.printf("%d ",b[i]);
		}
		}	
}
