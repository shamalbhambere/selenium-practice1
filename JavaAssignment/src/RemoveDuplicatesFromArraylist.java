import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicatesFromArraylist {

	public static void main(String[] args) {

		ArrayList<String> duplicate = new ArrayList<String>();
		duplicate.add("java");
		duplicate.add("javaScript");
		duplicate.add("java");
		duplicate.add("Selenium");
		duplicate.add("C#");
		duplicate.add("java");
		duplicate.add("C#");
		
		ArrayList<String> nonduplicate = new ArrayList<String>();
		Iterator<String> it = duplicate.iterator();
		while(it.hasNext()) {
			String dupWord=it.next();
			if(nonduplicate.contains(dupWord)) {
				it.remove();
			}else {
				nonduplicate.add(dupWord);
			}
		}
		
		System.out.println("Non Duplicate Elements List:"+nonduplicate);
		
	}

}
