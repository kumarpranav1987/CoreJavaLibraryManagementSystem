package concepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args){
		BufferedReader br=null;
		BufferedWriter bw =null;
		try {
			//FileInputStream fis = new FileInputStream(new File("C:\\Users\\Pranav Kumar\\Desktop\\Courses\\LibraryManagementSystem\\Core_Java_Library_Management_System\\src\\concepts\\input.txt"));
			//FileReader fr = new FilReade
			//br = new BufferedReader(new FileReader("C:\\Users\\Pranav Kumar\\Desktop\\Courses\\LibraryManagementSystem\\Core_Java_Library_Management_System\\src\\concepts\\input.txt"));
			 bw= new BufferedWriter(new FileWriter("C:\\Users\\Pranav Kumar\\Desktop\\Courses\\LibraryManagementSystem\\Core_Java_Library_Management_System\\src\\concepts\\input.txt"));
			bw.write("123");
			//bw.flush();
			//BufferedReader br = new BufferedReader
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				bw.close();
				//System.out.println(br.readLine());
				//br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
