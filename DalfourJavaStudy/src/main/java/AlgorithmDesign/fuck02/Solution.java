package AlgorithmDesign.fuck02;

import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		int[][] dp = new int[n+1][m+1];
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = dp[i-1][j-1] + dp[i-j][j];
			}
		}
		reader.close();
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		writer.println(dp[n][m]);
		writer.close();
	}
}