package AlgorithmDesign.fuck04;

import java.io.*;
import java.util.*;

class Point {
	double x, y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class DoubleTourSalesmanProblem {
	static int n;
	static Point[] points;

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			n = Integer.parseInt(reader.readLine());
			points = new Point[n];
			for (int i = 0; i < n; i++) {
				String[] coordinates = reader.readLine().split(" ");
				double x = Double.parseDouble(coordinates[0]);
				double y = Double.parseDouble(coordinates[1]);
				points[i] = new Point(x, y);
			}
			reader.close();

			double shortestTourLength = calculateShortestDoubleTour();

			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write(String.format("%.2f", shortestTourLength));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static double calculateShortestDoubleTour() {
		int n = points.length;
		double[][] dp = new double[n][n];
		Arrays.fill(dp, Double.POSITIVE_INFINITY);
		dp[0][0] = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				double dist = distance(points[i], points[j]);
				dp[i][j] = dist + dp[j][i - 1];
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {
				dp[i][j] = Math.min(dp[i][j], distance(points[i], points[j]) + dp[j][i + 1]);
			}
		}
		double shortestTourLength = Double.POSITIVE_INFINITY;
		for (int i = 0; i < n - 1; i++) {
			shortestTourLength = Math.min(shortestTourLength, dp[n - 1][i]);
		}

		return shortestTourLength;
	}
	private static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
}
