package concepts;

public class StringSplit {
	public static void main(String[] args) {
		String s = "Steak_House		Food		5		1650";
		String[] str = s.split("\t\t");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
