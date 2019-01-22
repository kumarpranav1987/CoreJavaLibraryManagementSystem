package concepts;

public class StringBasics {

	public static void main(String[] args) {
		String x = null;
		x = getAString(x);
		//System.out.println(x);

		StringBuilder str = new StringBuilder("ABC");
		System.out.println(str);
		modify(str);
		System.out.println(str);
	}

	
	public static String getAString(String x) {
		x ="GeekQuiz";
		return x;
	}
	
	public static void modify(StringBuilder x) {
		x.append(" XYZ");
	}
}
