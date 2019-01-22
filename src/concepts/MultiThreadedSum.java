package concepts;

import java.util.Arrays;

public class MultiThreadedSum {

	static int[] arr = new int[100];
	static int partialSum=0;
	//static int sum=0;
	public static void main(String[] args) throws InterruptedException {
		Arrays.fill(arr, 1);
		Thread t1 = new Thread(new MySum(51, 99));
		t1.start();
		int sum=0;
		for(int i=0;i<=50;i++) {
			sum+=arr[i];
		}
		t1.join();
		sum+=partialSum;
		System.out.println(sum);
		
	}

}

class MySum implements Runnable{
	private int startIndex;
	private int endIndex;
	
	public MySum(int startIndex, int endIndex) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	@Override
	public void run() {
		for(int i=startIndex;i<=endIndex;i++) {
			MultiThreadedSum.partialSum+=MultiThreadedSum.arr[i];
			//MultiThreadedSum.sum+=MultiThreadedSum.arr[i];
		}
		//MultiThreadedSum.sum+=MultiThreadedSum.partialSum;
		
	}
	
}