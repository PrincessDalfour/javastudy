package AlgorithmDesign.fuck04;

import java.io.*;
import java.util.*;

public class MaxProduct {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		String[] line = reader.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		long number = Long.parseLong(reader.readLine());
		reader.close();

		long[] digits = new long[n];
		digits[0] = number % 10;
		for (int i = 1; i < n; i++) {
			digits[i] = (number / 10) % 10;
		}

		long maxProduct = 1;
		for (int i = 0; i < n; i += k) {
			long product = 1;
			for (int j = i; j < Math.min(i + k, n); j++) {
				product *= digits[j];
			}
			maxProduct = Math.max(maxProduct, product);
		}

		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		writer.println(maxProduct);
		writer.close();
	}
}