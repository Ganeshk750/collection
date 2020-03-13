import java.util.Vector;

public class TestFive {

	public static void main(String[] args) {
	
		Vector<Employee> v = new Vector<Employee>();
		v.add(new Employee(501,"ganesh", "developer"));
		v.add(new Employee(555,"deepak", "Tester"));
		
		Vector<Student> v1 = new Vector<Student>();
		v1.add(new Student(501,"ganesh", "Bangalore"));
		v1.add(new Student(555,"deepak", "Bangalore"));
		
		/*
		 * System.out.println(v); System.out.println(v.toString());
		 */
		/*Here we are getting [Student@15db9742, Employee@6d06d69c] */
		/* These kind of output */
		
		/*
		 * for(Object o : v) { if(o instanceof Student) { Student s = (Student) o;
		 * System.out.println(s.id+"-->"+s.name); } if(o instanceof Employee) { Employee
		 * e = (Employee) o; System.out.println(e.id+"-->"+e.name); } }
		 */
        
		for(Employee e : v) {
			System.out.println(e.id+"-->"+e.name+"-->"+e.branch);
		}
		Employee e1 = v.get(0);
		System.out.println(e1.id+"-->"+e1.name+"-->"+e1.branch);
		System.out.println("<======================>");
		for(Student s : v1) {
			System.out.println(s.id+"-->"+s.name+"-->"+s.address);
		}
		Student s1 = v1.get(0);
		System.out.println(s1.id+"-->"+s1.name+"-->"+s1.address);
	}

}
