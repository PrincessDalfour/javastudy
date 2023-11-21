package AlgorithmDesign.fuck01;

import java.util.*;



public class Hamilton {
	private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 上下左右
	private boolean[][] visited; // 记录访问过的位置
	private int m, n; // 棋盘大小
	private boolean[][] board; // 棋盘初始状态

	public Hamilton(int m, int n) {
		this.m = m;
		this.n = n;
		board = new boolean[m][n];
		visited = new boolean[m][n];
	}

	public void solve() {
		if (place(0, 0)) {
			printSolution();
		} else {
			System.out.println("No solution found.");
		}
	}

	private boolean place(int x, int y) {
		if (x == m - 1 && y == n - 1) { // 到达终点
			return true;
		}

		for (int[] direction : DIRECTIONS) {
			int newX = x + direction[0], newY = y + direction[1];
			if (isValid(newX, newY) && !visited[newX][newY]) {
				visited[newX][newY] = true;
				if (place(newX, newY)) {
					return true;
				}
				// 如果在此处回溯，需要将已访问标记撤销
				visited[newX][newY] = false;
			}
		}

		return false;
	}

	private boolean isValid(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n && !board[x][y];
	}

	private void printSolution() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j]) {
					System.out.print("(" + i + "," + j + ") ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}