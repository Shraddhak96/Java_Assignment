package classLock;

public class Test2 implements Runnable {
	public void run() {
		disp2();
	}

	public static void disp2() {
		for (int i = 50; i >= 1; i--)
			System.out.print(" " + i);
	}
}
