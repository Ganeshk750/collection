package TreeSetCol;

import java.util.TreeSet;

public class FirstOne {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("ganesh");
		t.add("shrithi");
		t.add("anjali");
		System.out.println(t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(101);
		t1.add(25);
		t1.add(500);
		System.out.println(t1);
		
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("ganesh");
		t2.add(null);
		System.out.println(t2);//java.lang.NullPointerException
		

	}
	
	
}
