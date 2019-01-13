package concepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args){
		
		/*int a=10;
		int b=0;
		
		int[] arr = new int[2];
		arr[0]=100;
		arr[1]=200;
		System.out.println(arr[5]);*/
				
		//createFileReader();
		FileReader reader=null;
		try {
			reader = new FileReader(
					"C:\\Users\\Pranav Kumar\\Desktop\\Courses\\LibraryManagementSystem\\Core_Java_Library_Management_System\\input1.txt");
		myMethod();
		
		
		System.out.println("File Found");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		System.out.println("After Catch");
	}

	/*public static void createFileReader() throws FileNotFoundException {
		FileReader reader = new FileReader("C:\\Users\\Pranav Kumar\\Desktop\\Courses\\LibraryManagementSystem\\Core_Java_Library_Management_System\\input1.txt");
	}*/
	
	public static void myMethod() throws SQLException{
		
	}
}
