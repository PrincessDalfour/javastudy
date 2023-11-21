package AlgorithmDesign.fuck02;

import java.io.*;
import java.util.*;

public class PermutationsWithDuplicates {
	static int n;
	static char[] arr;
	static List<String> output = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		String line = reader.readLine();
		n = Integer.parseInt(line);
		arr = new char[n];
		String[] arrStr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.readLine().charAt(0);
			arrStr[i] = String.valueOf(arr[i]);
		}
		reader.close();
		permute(0);
		Collections.sort(output); // sort the output permutations
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		for (String s : output) {
			writer.println(s);
		}
		writer.close();
	}

	private static void permute(int l) {
		if (l == n) {
			output.add(new String(arr));
			return;
		}
		for (int i = l; i < n; i++) {
			swap(l, i);
			permute(l + 1);
			swap(l, i);
		}
	}

	private static void swap(int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}