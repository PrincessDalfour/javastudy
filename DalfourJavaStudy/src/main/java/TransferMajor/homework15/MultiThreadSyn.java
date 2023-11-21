package TransferMajor.homework15;

import java.util.Scanner;

class NumManage {
	int maxNum;
	int currentNum = 2;

	public NumManage(int maxNum) {
		this.maxNum = maxNum;
	}

	//  当返回-1代表不能已经完成工作
	//getCurrentNum方法
	public synchronized int getCurrentNum() {
		if (currentNum <= maxNum) {
			int num = currentNum;
			currentNum++;
			return num;
		} else {
			return -1;
		}
	}
}


class NumTask implements Runnable {
	NumManage nm;

	public NumTask(NumManage nm) {
		this.nm = nm;
	}

	public void run() {
		int num = 1;
		while (num > 0) try {


			Thread.sleep(200);

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class MultiThreadSyn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		NumManage n = new NumManage(num);//对象共享，所有线程用同一个对象

		for (int i = 0; i < 5; i++) {
			NumTask nt = new NumTask(n);
			Thread t = new Thread(nt);
			t.start();
		}

	}

}