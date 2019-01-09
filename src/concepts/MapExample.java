package concepts;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		/*Map<Integer, String> map = new HashMap<>();
		map.put(1, "Red");
		map.put(2, "Blue");
		map.put(3, "Green");
		System.out.println(map.get(2));*/
		Student s1 = new Student("A", 1, 20);
		Student s2 = new Student("B", 2, 20);
		Student s3 = new Student("C", 3, 20);

		Map<Student,String> gameMapping = new HashMap<>();
		gameMapping.put(s1, "Cricket");
		gameMapping.put(s2, "Football");
		gameMapping.put(s3, "Basketball");
		//gameMapping.put(s1, "Swim");
		
		
		Student s4 = new Student("A", 1, 20);
		System.out.println(gameMapping.get(s4));
	}

}
