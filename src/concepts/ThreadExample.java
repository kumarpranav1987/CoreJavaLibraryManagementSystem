package concepts;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"    1");
		System.out.println(Thread.currentThread().getName()+"    2");
		MyRunnable r = new MyRunnable();
		Thread t2 = new Thread(r, "A");
		t2.start();
		
		Thread t1 = new MyThread();
		t1.start();
		
		System.out.println(Thread.currentThread().getName()+"    5");
		System.out.println(Thread.currentThread().getName()+"    6");
		System.out.println(Thread.currentThread().getName()+"    7");
		System.out.println(Thread.currentThread().getName()+"    8");
		System.out.println(Thread.currentThread().getName()+"    9");
		System.out.println(Thread.currentThread().getName()+"    10");
		System.out.println(Thread.currentThread().getName()+"    11");
		System.out.println(Thread.currentThread().getName()+"    12");
	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"    3");
		System.out.println(Thread.currentThread().getName()+"    4");
	}
}

class MyRunnable implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"    13");
		System.out.println(Thread.currentThread().getName()+"    14");
		
	}
	
}