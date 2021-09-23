import java.util.HashMap;

public class CountNumberWordsInString {

	public static void main(String[] args) {

		String str="I am java programmer and I love java";
		HashMap<String,Integer> hashMap = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word : words) {
			if(hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word)+1);
			}
			else {
				hashMap.put(word, 1);
			}
		}
		
		System.out.println(hashMap);
		

	}

}
