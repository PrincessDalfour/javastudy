package TransferMajor.homework15;

public class SynchPrint implements Runnable {
	public static void main(String[] args) {
		SynchPrint sp = new SynchPrint();
		sp.t1.start();
		sp.t2.start();
		while (sp.t1.isAlive() || sp.t2.isAlive()) {
		}
		System.out.println(sp.buffer);//这句输出的内容是?
	}

	StringBuffer buffer = new StringBuffer();
	Thread t1, t2;

	SynchPrint() {
		t1 = new Thread(this);
		t2 = new Thread(this);
	}

	public synchronized void addChar(char c) {
		if (Thread.currentThread() == t1) {
			while (buffer.length() == 0) {
				try {
					wait();
				} catch (Exception e) {
				}
				buffer.append(c);
			}
		}
		if (Thread.currentThread() == t2) {
			buffer.append(c);
			notifyAll();
		}
	}

	@Override
	public void run() {
		if (Thread.currentThread() == t1) {
			addChar('A');
		}
		if (Thread.currentThread() == t2) {
			addChar('B');
		}
	}
}
