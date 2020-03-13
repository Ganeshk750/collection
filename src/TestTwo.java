import java.util.ArrayList;

public class TestTwo {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(new Student(101, "Ganesh", "Bangalore"));
		a1.add(new Employee(201, "Deepak", "Bangalore"));
		a1.add("Anjali");
		a1.add(null);
		a1.add(10.256);
		a1.add(10);
		System.out.println(a1);
		System.out.println(a1.toString());
		
        for(Object o : a1) {
        	if(o instanceof Employee) {
        		Employee e = (Employee) o;
        		   System.out.println(e.id+"->"+ e.name+"->"+ e.branch);
        	}
        	if(o instanceof Student) {
        		Student s = (Student) o;
        		System.out.println(s.id+"-->"+s.name+"-->"+s.address);
        	}
        	if(o instanceof Integer) {
        		System.out.println(o);
        	}
        	if(o instanceof String) {
        		System.out.println(o);
        	}
        	if(o instanceof Double) {
        		System.out.println(o);
        	}
        	if(o == null) {
        		System.out.println(o);
        	}
        }
	}
	

}
