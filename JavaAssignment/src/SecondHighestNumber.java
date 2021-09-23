import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
	
		int a[]= {3,6,5,4,8,9,11};
		int b[]= {12,4,6,9,2,15,20,22};
		System.out.println("Second largest number: "+ getSecondLargest(a,7));
		System.out.println("Second largest number: "+ getSecondLargest(b,8));
		
	}

	public static int getSecondLargest(int[] a,int total) {
		Arrays.sort(a);
		return a[total-2];
		
	}
}
