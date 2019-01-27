package concepts;

public class WaitNotify {
	public static void main(String[] args) throws InterruptedException {
		StringBuilder s = new StringBuilder();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		c.start();
		Thread.sleep(5000);
		p.start();
	}
}

class Producer extends Thread{
	private StringBuilder str;
	
	public Producer(StringBuilder str) {
		this.str = str;
	}

	@Override
	public void run() {
		synchronized (str) {
			str.append("ABC");
			str.notifyAll();
		}
		
	}
}
class Consumer extends Thread{
	private StringBuilder str;
	
	public Consumer(StringBuilder str) {
		this.str = str;
	}

	@Override
	public void run() {
		synchronized (str) {
			while (str.length()==0) {
				try {
					System.out.println("Consumer is waiting....");
					str.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(str.length());
		}
	}
}