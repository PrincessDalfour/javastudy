package TransferMajor.homework10;
/**
 * import java.io.BufferedReader;
 * import java.io.BufferedWriter;
 * import java.io.FileNotFoundException;
 * import java.io.FileReader;
 * import java.io.FileWriter;
 * import java.io.IOException;
 * public class FileReadAndWrite{
 * public static void main(String[] args) {
 * write(args);//将args参数写入文件test.txt,每个参数一行
 * try {
 * // read file content from file
 * FileReader reader = new FileReader("test.txt");
 * BufferedReader br = new BufferedReader(reader);
 * String str = null;
 * while ((str = br.readLine()) != null) {
 * System.out.println(str);
 * }
 * br.close();
 * reader.close();
 * } catch (FileNotFoundException e) {
 * System.out.println("File Not Found");
 * } catch (IOException e) {
 * System.out.println("File IOException");
 * }
 * }
 * <p>
 * public static void write(String[] args) {
 * try {
 * FileWriter writer = new FileWriter("test.txt");
 * BufferedWriter bw = new BufferedWriter(writer);
 * for(String arg : args) {
 * bw.write(arg + "\n");
 * }
 * bw.close();
 * writer.close();
 * } catch (IOException e) {
 * System.out.println("Failed to write to file.");
 * }
 * }
 * }
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) {
		write(args);
		read("test.txt");

	}
	//public  static  void  read(String  filename)

	public static void read(String filename) {
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void write(String[] args) {

		try {
			FileWriter writer = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			for (int i = 0; i < args.length; i++) {
				bw.write(args[i] + '\n');
			}

			bw.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
