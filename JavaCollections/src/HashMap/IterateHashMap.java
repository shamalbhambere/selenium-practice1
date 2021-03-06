package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {

		// no order & no index
		// store key-value pair
		// key cannot be duplicate

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Dehli");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");

		// iterator-over the key -using keySet
		Iterator<String> it = capitalMap.keySet().iterator();
         while(it.hasNext()) {
        	String key = it.next();
        	String value = capitalMap.get(key);
        	System.out.println("Key= " + key + ", Value= "+value);
         }
         System.out.println("-----");

         //iterator-over the set(pair)- using entrySet
         Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
         while(it1.hasNext()) {
        	 Entry<String,String> entry = it1.next();
        	 System.out.println("Key="+entry.getKey() + ", Value= "+entry.getValue());
        	 
         }
         System.out.println("-----");
         //iterate hashMap using Java 8 for each and lambda
         capitalMap.forEach((k,v) -> System.out.println("Key=" +k+ "  Value=" +v));
         
	}

}
