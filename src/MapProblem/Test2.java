package MapProblem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashMap<Emp, Stu> m = new LinkedHashMap<Emp, Stu>();
		m.put(new Emp(101,"ganesh"), new Stu(105,"gopal"));
		m.put(new Emp(108,"manish"), new Stu(98,"mukesh"));
		m.put(new Emp(105,"aditya"), new Stu(102,"arnav"));
		
		System.out.println(m);//{MapProblem.Emp@15db9742=MapProblem.Stu@4e25154f, MapProblem.Emp@6d06d69c=MapProblem.Stu@70dea4e, MapProblem.Emp@7852e922=MapProblem.Stu@5c647e05}
       
		Set<Emp> e = m.keySet();
		for(Emp ee : e) {
			System.out.println(ee.eid+" "+ ee.ename);
		}
		//Here we are printing keys
		System.out.println("---------------");
		for(Emp e1 : m.keySet()) {
		    System.out.println(e1.eid+" "+ e1.ename);
		}
		//Here We are printing values
		System.out.println("---------------");
		for(Stu s : m.values()) {
			System.out.println(s.id+" "+s.name);
		}
		
		//Here we are printing entry
		Set<Entry<Emp,Stu>> e2 = m.entrySet();
		Iterator<Entry<Emp,Stu>> itr = e2.iterator();
		while(itr.hasNext()) {
			
			  Entry<Emp,Stu> e3 = itr.next();
			  Emp e4 = e3.getKey();
			  System.out.println(e4.eid+" "+e4.ename); 
			  Stu s1 = e3.getValue();
			  System.out.println(s1.id+" "+s1.name);
			  
		}
		
	}

}
