import java.util.LinkedHashSet;

public class ElementExistInLinkedHashSet {

	public static void main(String[] args) {


		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("JavaScript");
		lhs.add("Angular");
		lhs.add("React");
		lhs.add("Selenium");
		lhs.add("Cucumber");
		
		System.out.println(lhs.contains("Java"));

		System.out.println(lhs.contains("Selenium"));

		System.out.println(lhs.contains("PHP"));
		
	}

}
