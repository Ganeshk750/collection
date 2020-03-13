import java.util.ArrayList;

// ArrayList Method are size(),set(index or values), remove(index or ""), add(), clear(),isEmpty()
public class TestSix {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("ganesh");
		al.add("ajeet");
		al.add(10);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, "aditya");
	    System.out.println(al);
	    
	    al.remove("aditya");
	    System.out.println(al);
	    
	    al.set(1, "abc");
	    System.out.println(al);
	    
	    System.out.println(al.isEmpty());
	    al.clear();
	    System.out.println(al.isEmpty());
		

	}

}
