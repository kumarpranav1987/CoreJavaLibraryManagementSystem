package concepts;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Student s10;
	public static void main(String[] args) {
		
		
		Student[] array = new Student[5];
		/*array[0]=s1;
		array[1]=s2;
		array[2]=s3;*/
		//System.out.println(array.length);
		
		//System.out.println("Enter the name");
		//Scanner s = new Scanner(System.in);
		//String name = s.nextLine();
		
		/*for(int i=0;i<array.length;i++) {
			Student st = array[i];
			if(st.getName().equals(name)) {
				System.out.println("Found");
				break;
			}
		}*/
				
		/*List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);*/	
		//System.out.println(list.size());
		/*for(int i=0;i<list.size();i++) {
			Student st = list.get(i);
			if(st.getName().equals(name)) {
				System.out.println("Found");
				break;
			}
		}*/
		
		Student s1 = new Student("A", 1, 20);
		Student s2 = new Student("B", 2, 20);
		Student s3 = new Student("C", 3, 20);
		
		Student[] array1 = new Student[3];
		array1[0]=s1;
		array1[1]=s2;
		array1[2]=s3;
		
		System.out.println("Give me a roll no");
		Scanner s = new Scanner(System.in);
		int roll = s.nextInt();
		for(int i=0;i<array1.length;i++) {
			if(array1[i].getRoolNo() == roll) {
				System.out.println("Age="+array1[i].getAge());
			}
		}
		
		//System.out.println(s1 == s2);
		//System.out.println(s1.equals(s2));
		
		
		Set<Student>set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		
		//System.out.println(set.size());
		
		/*Set<Integer> intSet = new HashSet<>();
		intSet.add(1);
		intSet.add(1);
		intSet.add(5);
		intSet.add(5);
		System.out.println(intSet.size());*/
		
		
		
		
	}

}
