package AlgorithmDesign.fuck03;

import java.io.*;
import java.util.Arrays;

public class Main {
	static int[] readIntLine(BufferedReader reader) throws IOException {
		String line = reader.readLine();
		String[] parts = line.split(" ");
		int[] result = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			result[i] = Integer.parseInt(parts[i]);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		int n = readIntLine(reader)[0];
		int[] a = readIntLine(reader);
		int[] b = readIntLine(reader);
		int[][] dp = new int[n + 1][n * 10 + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], n * 10 + 1);
		}
		dp[0][0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i * 10; j++) {
				if (dp[i - 1][j] != n * 10 + 1) {
					if (j + a[i - 1] <= j) {
						dp[i][j + a[i - 1]] = Math.min(dp[i][j + a[i - 1]], dp[i - 1][j] + a[i - 1]);
					}
					if (j + b[i - 1] <= j) {
						dp[i][j + b[i - 1]] = Math.min(dp[i][j + b[i - 1]], dp[i - 1][j] + b[i - 1]);
					}
				}
			}
		}
		int minTime = n * 10 + 1;
		for (int j = 0; j <= n * 10; j++) {
			if (dp[n][j] != n * 10 + 1) {
				minTime = Math.min(minTime, dp[n][j]);
			}
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write(minTime + "");
		writer.close();
	}
}