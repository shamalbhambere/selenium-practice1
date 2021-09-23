import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertKeysOfMapToList {

	public static void main(String[] args) {
          
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "Java");
		hashMap.put(2, "JavaScript");
		hashMap.put(4, "C#");
		hashMap.put(6, "Selenium");
		hashMap.put(5, "Ruby");
		hashMap.put(3, "Php");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashMap.keySet());
		System.out.println("Contents of the list holding keys of the map:"+arrayList);
		 
		

	}

}
