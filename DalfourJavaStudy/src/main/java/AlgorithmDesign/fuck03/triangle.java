package AlgorithmDesign.fuck03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangle {
	public static void main(String[] args) {
		int n = 5; // 数字三角形的行数
		int[] triangle = new int[n]; // 存储数字三角形的数据
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(" ");
				for (int i = parts.length - 1; i >= 0; i--) {
					triangle[i] += Integer.parseInt(parts[i]);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int maxSum = 0;
		for (int i = n - 1; i >= 0; i--) {
			maxSum += triangle[i];
			for (int j = i + 1; j < n; j++) {
				maxSum += triangle[j] - triangle[i];
			}
		}
		System.out.println(maxSum);
	}
}
