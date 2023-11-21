package AlgorithmDesign.fuck02;

import java.io.*;

public class HanoiTower {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		int n = Integer.parseInt(reader.readLine());
		char[] result = hanoi(n, 'A', 'B', 'C');
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		for (char c : result) {
			writer.print(c);
			writer.print(' ');
		}
		writer.close();
	}

	public static char[] hanoi(int n, char A, char B, char C) {
		if (n == 1) {
			return new char[]{A, B};
		} else {
			char[] result = hanoi(n - 1, A, C, B);
			result[0] = A;
			result[1] = C;
			result[2] = B;
			result[3] = result[4] = A;
			return result;
		}
	}
}