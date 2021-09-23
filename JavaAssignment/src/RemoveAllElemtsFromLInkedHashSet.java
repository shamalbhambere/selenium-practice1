import java.util.LinkedHashSet;

public class RemoveAllElemtsFromLInkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("JavaScript");
		lhs.add("Angular");
		lhs.add("React");
		lhs.add("Selenium");
		lhs.add("Cucumber");
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("Java");
		lhs1.add("React");
		lhs1.add("Selenium");
		
		lhs.removeAll(lhs1);
		System.out.println("Remove all elements from linkedhashset :"+lhs1);
		
		

	}

}
