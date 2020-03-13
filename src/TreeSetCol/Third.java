package TreeSetCol;

import java.util.SortedSet;
import java.util.TreeSet;

public class Third {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i = 1 ; i < 11; i++) {
			t.add(i);
		}
		System.out.println(t);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		 SortedSet s = t.subSet(3, 7);
		 TreeSet<Integer> t1 = new TreeSet<Integer>(s);
		 System.out.println(t1);//[3, 4, 5, 6]
		 
		 SortedSet s1 = t.tailSet(5);
		 TreeSet<Integer> t2 = new TreeSet<Integer>(s1);
		 System.out.println(t2);// [5, 6, 7, 8, 9, 10]
		 
		 SortedSet s2 = t.headSet(5);
		 TreeSet<Integer> t3 = new TreeSet<Integer>(s2);
		 System.out.println(t3);//[1, 2, 3, 4]

	}

}
