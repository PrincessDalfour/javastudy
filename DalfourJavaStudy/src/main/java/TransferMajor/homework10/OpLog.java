package TransferMajor.homework10;

import java.util.Scanner;
import java.io.*;

public class OpLog {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try (FileWriter writer = new FileWriter("oplog.txt")) {

			while (scan.hasNextLine()) {
				String input = scan.nextLine();
				if (input.contains("#")) {
					writer.write(input.substring(0, input.indexOf('#')));// 单独写入#前的内容
					break;
				} else {
					writer.write(input + "\n");
				}
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		scan.close();

	}

}
