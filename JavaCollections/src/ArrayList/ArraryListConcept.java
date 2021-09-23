package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraryListConcept {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Java");
		lang.add("Python");
		lang.add("C#");
		lang.add("Ruby");
		lang.add("Java");

		System.out.println(lang);

		ArrayList<String> lang1 = new ArrayList<String>();
		lang1.add("JS");
		lang1.add(".Net");

		System.out.println(lang1);

		// lang.addAll(lang1);
		lang.addAll(2, lang1);
		System.out.println(lang);

		System.out.println(lang.contains("C#"));
		System.out.println(lang1.indexOf("JS"));

		ArrayList<String> cloneList = (ArrayList<String>) lang1.clone();
		System.out.println(cloneList);

		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int i = marks.lastIndexOf(8);
		System.out.println(i);
		
		//marks.remove(2);
		System.out.println(marks);
		
		//getting odd number
		//marks.removeIf(num -> num%2 ==0);
		//System.out.println(marks);
		
		//Getting even number
		marks.removeIf(num -> num%2 ==1);
		System.out.println(marks);
	}

}
