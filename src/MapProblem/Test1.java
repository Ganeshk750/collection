package MapProblem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(101, "ganesh");
		h1.put(98, "manish");
		h1.put(105, "deepak");
		h1.put(102, "ganesh");
		System.out.println(h1);
		
		Set<Integer> s = h1.keySet();
		System.out.println(s);
		
		 Collection<String> c1 = h1.values();
		 System.out.println(c1);
		 
		 Set<Entry<Integer, String>> s1 = h1.entrySet();
		 for(Entry e : s1) {
			 System.out.println(e.getKey()+" "+e.getValue());
		 }
	}

}
