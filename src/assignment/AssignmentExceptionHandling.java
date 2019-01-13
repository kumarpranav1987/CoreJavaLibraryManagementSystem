package assignment;

public class AssignmentExceptionHandling {
	public static void main(String[] args) {
		int arr[] = new int[2];
		arr[0]=100;
		arr[1]=200;
		System.out.println(arr[0]);
		try {
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println("End of Try Blok");
		}catch (Exception e) {
			System.out.println("Inside Catch Blok");
		}finally {
			System.out.println("Inside Finally Block");
		}
	}
}
