package MapProblem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Product> l = new LinkedHashMap<Integer,Product>();
		l.put(1, new Product(101,"book",500.2));
		l.put(2, new Product(102,"pen",50.2));
		l.put(3, new Product(103,"bag",1000.2));
		l.put(4, new Product(104,"box",550.2));
		
		Set<Entry<Integer,Product>> s = l.entrySet();
		Iterator<Entry<Integer,Product>> itr = s.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Product> e = itr.next();
			Product p = e.getValue();
			if(p.pid == 102) 
				itr.remove();
			
			if(p.pname.equals("bag")) 
				itr.remove();
			
	      }
			//Here we are printing reameaning data using For-each Loop
			for(Entry<Integer,Product> e1 :l.entrySet()) {
				Product p1 = e1.getValue();
				System.out.println(p1.pid+"-->"+p1.pname+"-->"+p1.pcost);
			}
		}
	}

