import java.util.ArrayList;

public class TestThree {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
	
		a1.add(new Student(101, "Ganesh", "Bangalore"));
		a1.add(new Employee(201, "Deepak", "Bangalore"));
		
		/*
		 * Student s1 = (Student)a1.get(1); System.out.println(s1.id+"-->"+s1.name);
		 */
		
		Object o = a1.get(0);
		Object o1 = a1.get(1);
		if(o instanceof Student) {
			Student s = (Student) o;
			System.out.println(s.id+"---"+s.name);
		}
		if(o1 instanceof Employee) {
			Employee e = (Employee) o1;
			System.out.println(e.id+"---"+e.name);
		}

	}

}
