import java.util.ArrayList;

public class TestNine {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Ganesh", "Developer");
		Employee e2 = new Employee(102, "Deepak", "Tester");
		Employee e3 = new Employee(103, "Aditya", "BA");
		Employee e4 = new Employee(104, "Mudit", "Tester");
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
	
		ArrayList<Employee> a2 = new ArrayList<Employee>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
	     a2.removeAll(a1);
		
		
		/*
		 * System.out.println(a2.contains(e1)); System.out.println(a2.containsAll(a1));
		 */
		 
		
		
		for(Employee e : a2) {
			System.out.println(e.id+"-->"+e.name+"-->"+e.branch);
		}
	}

}
