package AlgorithmDesign.fuck01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mode {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			HashMap<Integer, Integer> frequencyMap = new HashMap<>();
			while (n-- > 0) {
				line = reader.readLine();
				int num = Integer.parseInt(line);
				frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
			}
			int maxFrequency = 0;
			int mode = 0;
			for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
				if (entry.getValue() > maxFrequency) {
					maxFrequency = entry.getValue();
					mode = entry.getKey();
				}
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write(mode + "\n");
			writer.write(maxFrequency + "\n");
			writer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}