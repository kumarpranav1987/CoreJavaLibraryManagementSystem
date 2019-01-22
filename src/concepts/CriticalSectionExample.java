package concepts;

public class CriticalSectionExample {

	public static void main(String[] args) throws InterruptedException {
		MyCounterClass c = new MyCounterClass();
		Thread t1 = new IncrementerThread(c);
		Thread t2 = new IncrementerThread(c);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.getCounter());
	}

}

class MyCounterClass {
	private int counter;

	public   void increment() {
		System.out.println("Value="+counter);	
		synchronized (this) {
			
			counter++;
		}
		
		
	}

	public  int getCounter() {
		return counter;
	}
}

class IncrementerThread extends Thread{
	private MyCounterClass counterInIncrementThread;

	public IncrementerThread(MyCounterClass counter) {
		this.counterInIncrementThread = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			counterInIncrementThread.increment();
		}
	}
}