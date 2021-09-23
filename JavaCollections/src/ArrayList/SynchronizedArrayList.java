package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1.Collection.synchronizedList
		List<String> langNames = Collections
				.synchronizedList(new ArrayList<String>(Arrays.asList("Java", "C#", "C++", "Python")));

		// add & remove = we don't need explicit synchronization
		// traversing or iterating value from list = we have to use explicit
		// synchronization

		synchronized (langNames) {
			Iterator<String> it = langNames.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
        //2.CopyOnWriteArrayList- Its a class
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>(Arrays.asList("PHP",".Net","Testing"));
		
		//we don't need explicit synchronization for any operation - add/remove/traverse
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
