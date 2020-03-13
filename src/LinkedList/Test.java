package LinkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("ganesh");
		l.add("sontosh");
		l.add("pintu");
		l.add("mukul");
	    System.out.println(l);//[ganesh, sontosh, pintu, mukul]
	    System.out.println(l.size());//4
	    
	    l.addFirst("ratan");
	    l.addLast("durga");
	    System.out.println(l);
	    
	    l.set(0,"anu");
	    System.out.println(l);
	    
	    l.remove(0);
	    l.remove("durga");
	    System.out.println(l);
	    
	    System.out.println(l.isEmpty());
	    l.clear();
	    System.out.println(l.isEmpty());
	}

}
