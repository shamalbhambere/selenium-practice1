package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTraversing {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>(
				Arrays.asList("Shamal", "Amit", "Audvik", "Tom", "Peter", "Lisa"));

		System.out.println(names);
		
		//Typical for loop
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("-----------");
		//for each loop-enhance for loop
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("-----------");
		//jdk8--streams with lambda
		names.stream().forEach(ele ->System.out.println(ele));
		System.out.println("-----------");
		//iterator
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
