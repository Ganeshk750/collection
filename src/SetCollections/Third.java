package SetCollections;

import java.util.LinkedHashSet;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet h = new LinkedHashSet<String>();
        
		h.add("ganesh");
		h.add("arnav");
		h.add("aditya");
		System.out.println(h);
		
		LinkedHashSet h1 = new LinkedHashSet<String>(h);
		h1.add("mudit");
		System.out.println(h1);
		LinkedHashSet h2 = new LinkedHashSet<String>();
		h2.addAll(h);
		System.out.println(h2);
		LinkedHashSet h3 = new LinkedHashSet<String>();
		h3.addAll(h1);
		System.out.println(h3);
	}   

}
