package TransferMajor.homework8;
import java.util.Scanner;
public class NumberPlate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String content = sc.nextLine();
		if(content.equals("4rt56")){
			System.out.println("4RT56");
		}else if(content.equals("ga321")){
			System.out.println("GA321");
		}else {
			System.out.println("license plate error.");
		}
	}
}
