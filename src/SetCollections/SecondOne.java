package SetCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SecondOne {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> h = new LinkedHashSet<Employee>();
		h.add(new Employee(101,"ganesh"));
		h.add(new Employee(111,"durga"));
		h.add(new Employee(105,"ratan"));
		
		 Iterator<Employee> i = h.iterator();
		 while(i.hasNext()) {
			 Employee e = i.next();
			 if(e.id == 101) {
				 i.remove();
			 }
			 if(e.name.equals("ratan")) {
				 i.remove();
			 }
			 
			 
		 }
		 for(Employee e : h) {
			 System.out.println(e.id+"-->"+e.name);
		 }
	}

}
