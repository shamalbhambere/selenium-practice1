import java.util.ArrayList;

public class RemoveElementsFromSpecificIndexOfArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Oops");
		list.add("Collection");
		list.add("Threads");
		list.add("Function");
		list.add("Code");
		list.add("Basics");

		System.out.println("List of Array List:" + list);

		System.out.println("Size of Array List:" + list.size());

		list.remove(3);
		
		System.out.println("List of Array List:" + list);

		System.out.println("Size of Array List:" + list.size());

	}

}
