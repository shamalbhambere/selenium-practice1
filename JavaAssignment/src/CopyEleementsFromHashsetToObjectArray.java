import java.util.HashSet;
import java.util.Set;

public class CopyEleementsFromHashsetToObjectArray {

	public static void main(String[] args) {

          Set<Integer> hs = new HashSet<Integer>();
          hs.add(2);
          hs.add(12);
          hs.add(25);
          hs.add(29);
          hs.add(30);
          hs.add(5);
          hs.add(23);
          hs.add(54);
          hs.add(50);
          
          System.out.println("Elements in hashset:"+hs);
          
          Object[] obArr = hs.toArray();
          for(Object ob : obArr) {
        	  	System.out.println("Elements in Object Array:"+ob);
          }
	}

}
