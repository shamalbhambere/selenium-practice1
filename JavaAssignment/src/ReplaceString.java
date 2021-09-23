
public class ReplaceString {

	public static void main(String[] args) {
		String st = "hello";
		char str[] = st.toCharArray();
		replaceString(str);
		System.out.println("The modified string is :");
		System.out.println(str);

	}

	static void replaceString(char s[]) {
		for (int i = 1; i < s.length; i++) {
			if (s[i - 1] == 'l' && s[i] == 'l') {
				s[i - 1] = 'a';
				s[i] = 'a';

			}
		}
		return;
	}

}
