package concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyTry {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
			
		}
		Iterator<Integer>itr = list.iterator();
		int size = list.size();
		for(int i=0;i<size;i++) {
			System.out.println(itr.next());
			itr.remove();
		}

	}

}
