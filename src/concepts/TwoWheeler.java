package concepts;

public class TwoWheeler extends Vehicle{
	
	//compile 
	@Override
	public void method1() {
		System.out.println("Method1 from TwoWheeler");
	}
	
	public void method1(int i) {
		System.out.println("Method1 from TwoWheeler");
	}
	
	public void method1(String i,int j) {
		System.out.println("Method1 from TwoWheeler");
	}
	
	@Override
	public void method2() {
		System.out.println("Method2 from Two Wheeler");
		
	}

	public void method3() {
		System.out.println("Method3 from Two Wheel");
	}
}
