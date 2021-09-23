package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		//1.LinkedHashSet
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,3,4,5,6,6,6,7,7,8,9,9));
		LinkedHashSet<Integer> numberWithoutDuplicate = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> num = new ArrayList<Integer>(numberWithoutDuplicate);
		System.out.println(num);
		System.out.println("------");
		
		//JDK8-stream
		
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,3,4,5,6,6,6,7,7,8,9,9));
		List<Integer> n = number1.stream().distinct().collect(Collectors.toList());
		System.out.println(n);
	}

}
