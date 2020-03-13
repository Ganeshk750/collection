import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestTen {

	public static void main(String[] args) {
	
		// swaping method in ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ganesh");
		a.add("Arnav");
		a.add("mukul");
		a.add("Vikash");
		System.out.println("Before swaping:"+a);
		Collections.swap(a, 1, 2);
		System.out.println("After swaping:"+ a);
		
		
		//subList method in ArrayList
		ArrayList<String> aa = new ArrayList<String>(a.subList(1, 4));
		System.out.println(aa);
		
        

	}

}
