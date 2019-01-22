package concepts;

public class SyncExample {
	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		IncrementCounter c = new IncrementCounter();
		Thread t1 = new Thread(c);
		t1.start();
		for (int i = 0; i < 10000; i++) {

			SyncExample.counter++;

		}
		t1.join();
		System.out.println(SyncExample.counter);
	}
}

class IncrementCounter implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			SyncExample.counter++;
		}

	}
}
