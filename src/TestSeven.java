import java.util.ArrayList;

public class TestSeven {
	public static void main(String[] args) {
		
		//Approach -1 constructor -> only one collections to another
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		ArrayList<Integer> a  = new ArrayList<Integer>(al);
		a.add(100);
		a.add(200);
		System.out.println(a);
	}

}
