import java.util.ArrayList;

public class TestEight {

	public static void main(String[] args) {
		//Approach -2: addAll() => to add more than one collection into another;
	
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(100);
       ArrayList<Integer> a2 = new ArrayList<Integer>();
       a2.add(200);
       ArrayList<Integer> a3 = new ArrayList<Integer>();
       a3.addAll(al);
       a3.addAll(a2);
       a3.add(300);
       System.out.println(a3);
       
	}

}
