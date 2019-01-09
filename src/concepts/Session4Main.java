package concepts;

public class Session4Main {

	public static void main(String[] args) {
		Vehicle v = new TwoWheeler();
		//v.method1();
		
		
		Vehicle v1 = new FourWheeler();
		//v1.method1();
		
		simpleMethod(v1);
		/*v.method2();
		
		
		
		
		TwoWheeler two = new TwoWheeler();
		FourWheeler four = new FourWheeler();
		
		two.method1();
		two.method2();
		two.method3();
		
		four.method1();
		four.method2();*/
		
		//simpleMethod(two);

	}

	static void simpleMethod(Vehicle v) {
		v.method1();
		v.method2();
	}
}
