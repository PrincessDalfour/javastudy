package AlgorithmDesign.fuck03;

import java.io.*;
import java.util.Arrays;

public class stone {
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
		int[] stones = readIntLine(reader);
		int[] dp = new int[n + 1];
		Arrays.fill(dp, 0);
		dp[0] = 0;
		int minScore = 0;
		int maxScore = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i - 1; j >= 1; j--) {
				sum += stones[j];
				dp[i] = Math.max(dp[i], dp[j] + sum);
				minScore = Math.min(minScore, dp[i]);
				maxScore = Math.max(maxScore, dp[i]);
			}
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write(minScore + "");
		writer.newLine();
		writer.write(maxScore + "");
		writer.close();
	}
}