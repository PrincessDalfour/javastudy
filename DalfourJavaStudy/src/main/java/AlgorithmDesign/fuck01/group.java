package AlgorithmDesign.fuck01;

import java.io.*;

public class group {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			int subsetCount = (int) Math.pow(2, n) - 1;
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write(subsetCount + "\n");
			writer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
