package TransferMajor.homework9;

import java.util.ArrayList;
import java.util.List;

public class BoxTest  {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		integerBox.add(new Integer(Integer.valueOf(args[0])));
		stringBox.add(new String(args[1]));
		System.out.printf("Integer is :%d\n", integerBox.get());
		System.out.printf("String is :%s\n", stringBox.get());
	}
}
class Box<T>{
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
