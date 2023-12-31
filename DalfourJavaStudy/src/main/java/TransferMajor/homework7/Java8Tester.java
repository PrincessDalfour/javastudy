package TransferMajor.homework7;

interface MathOperation {
	int operation(int a, int b);
}
interface greetingService {
	void sayMessage(String message);
}
public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();

		// 加操作对象
		MathOperation addition = (int a, int b) -> a + b;

		// 减操作对象
		MathOperation subtraction = (a, b) -> a - b;

		// 乘操作对象
		MathOperation multiplication = (int a, int b) -> { return a * b; };

		// 除操作对象
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// 不用括号
		greetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		greetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");
	}

	private int operate(int a, int b, MathOperation mathoperation) {
		return mathoperation.operation(a, b);
	}

}
