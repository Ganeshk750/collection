package SetCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fourth {

	public static void main(String[] args) {
		
	  Set<String> s = new HashSet<String>();
	  s.add("ratan");
	  s.add("durga");
	 // System.out.println(s);
	  ArrayList<String> a = new ArrayList<String>();
	  a.add("ratan");
	  a.add("ratan");
	  a.add("ratan");
	  a.add("ratan");
	  a.add("durga");
	  
	  HashSet<String> h1 = new HashSet<String>();
	  h1.addAll(a);
	  System.out.println(h1);
	}

}
