package AlgorithmDesign.fuck04;

import java.util.*;
import java.io.*;

public class SampleCollection {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		String[] firstLine = reader.readLine().split(" ");
		int n = Integer.parseInt(firstLine[0]);
		int[][] grid = new int[n][n];
		int[][] dp = new int[n][n];
		int[][] dp2 = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] line = reader.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				grid[i][j] = Integer.parseInt(line[j]);
				dp[i][j] = Integer.MIN_VALUE;
				dp2[i][j] = Integer.MIN_VALUE;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = grid[i][j];
				} else if (i == 0) {
					dp[i][j] = Math.max(grid[i][j], dp[i][j - 1] + grid[i][j]);
				} else if (j == 0) {
					dp[i][j] = Math.max(grid[i][j], dp[i - 1][j] + grid[i][j]);
				} else {
					dp[i][j] = Math.max(grid[i][j], Math.max(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]));
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == n - 1 && j == n - 1) {
					dp2[i][j] = grid[i][j];
				} else if (i == n - 1) {
					dp2[i][j] = Math.max(grid[i][j], dp2[i][j + 1] + grid[i][j]);
				} else if (j == n - 1) {
					dp2[i][j] = Math.max(grid[i][j], dp2[i + 1][j] + grid[i][j]);
				} else {
					dp2[i][j] = Math.max(grid[i][j], Math.max(dp2[i][j + 1] + grid[i][j], dp2[i + 1][j] + grid[i][j]));
				}
			}
		}

		int maxValue = Math.max(dp[0][n - 1], dp2[0][n - 1]);
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		writer.println(maxValue);
		writer.close();
	}
}