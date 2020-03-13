package TreeSetCol;

import java.util.Comparator;
import java.util.TreeSet;

public class Second {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("ganesh");
		t.add("shrithi");
		t.add("anjali");
		System.out.println(t);
		
		TreeSet<Integer> t3 = new TreeSet<Integer>(new MyComp2());
		t3.add(10);
		t3.add(500);
		t3.add(8);
		t3.add(600);
		System.out.println(t3);
		
		TreeSet<Product> t1 = new TreeSet<Product>(new MyComp1());
		
        t1.add(new Product(101,"bag",1000.5));
        t1.add(new Product(111,"mobile",8000.5));
        t1.add(new Product(105,"pen",100.5));
        t1.add(new Product(121,"laptop",20000.5));
       // System.out.println(t1);//java.lang.ClassCastException:
        
        for(Product p : t1) {
        	System.out.println(p.id+"-->"+p.name+"-->"+p.cost);
        }
	}

}

class MyComp implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		return -arg0.name.compareTo(arg1.name);
	}
	
}

class MyComp1 implements Comparator<Product> {

	@Override
	public int compare(Product p, Product p1) {
		// TODO Auto-generated method stub
		if(p.id == p1.id) {
			return 0;
		}
		if(p.id > p1.id) {
			return +1;
		}
		return -1;
	}
	
}

class MyComp2 implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
		return -arg0.compareTo(arg1);
	}

	
	
}
