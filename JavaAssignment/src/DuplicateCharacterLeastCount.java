import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterLeastCount {

	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for (char c : strArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}

		}
		int minCount = 0;
		char minChar = ' ';
		char least = ' ';

		for (Map.Entry<Character, Integer> me : charMap.entrySet()) {
			if (minCount < me.getValue()) {
				minCount = me.getValue();
				minChar = me.getKey();
			} else {
				least = me.getKey();
				System.out.println("Least repeated character are: "+ least);
			}
		}

		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {

		getCharCount("ABCAABCAEBE");
	}

}
