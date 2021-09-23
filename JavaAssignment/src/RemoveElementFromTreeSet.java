import java.util.TreeSet;

public class RemoveElementFromTreeSet {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Java");
		tree.add("Prgramming");
		tree.add("Assessment");
		tree.add("Script");
		tree.add("Coding");
		tree.add("JavaScript");
		
		System.out.println("Display TreeSet Element:"+tree);
		
		tree.remove("Script");
		tree.remove("JavaScript");
		
		System.out.println("Display Treeset After removing specific element:"+tree);
	}

}
