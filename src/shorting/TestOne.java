package shorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestOne {
	
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		
		a.add(new Employee(102, "Ganesh"));
		a.add(new Employee(144, "Manish"));
		a.add(new Employee(103, "Aditya"));
		a.add(new Employee(111, "Deepak"));
		
		Collections.sort(a);
		for(Employee e : a) {
			System.out.println(e.id + "-->"+e.ename);
		}
	}

}
