
public class ConvertLowerToUpper {

	public static void main(String[] args) {
		
		String str="i love java programming";
		System.out.println("Lower case string is:"+str);
		char st[] = str.toCharArray();
		
		for(int i=0;i<st.length;i++) {
			if(st[i]>='a' && st[i]<='z') {
				st[i]=(char) ((int)st[i]-32);
			}
		}
		
		
		for(int i=0;i<st.length;i++) {
			System.out.println("Upper case string is:"+st[i]);
			
		}
	}

}
