
public class StringBpresentInStringA {

	public static void main(String[] args) {
		 String str = "HeyDearHowareyou";
	      String substr = "Howareyou";
	      int n1 = str.length();
	      int n2 = substr.length();
	      System.out.println("String: " + str);
	      System.out.println("Substring: " + substr);
	      for (int i = 0; i <= n1 - n2; i++) {
	         int j;
	         for (j = 0; j < n2; j++) {
	            if (str.charAt(i + j) != substr.charAt(j))
	               break;
	         }
	         if (j == n2) {
	            System.out.println("The substring is present in the string at index " + i);
	            return;
	         }
	      }
	      System.out.println("The substring is not present in the string");

	}

}
