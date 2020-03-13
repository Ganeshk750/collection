import java.util.ArrayList;
import java.util.Set;

public class TestFour {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Shruthi", "Tester"));
		al.add(new Employee(102, "Anjali", "Tester"));
		
		for(Employee e : al) {
			System.out.println(e.id+"---"+e.name+"---"+e.branch);
		}
		
		System.out.println("<=========Getting By Index==========>");
         Employee e1 = al.get(0);
         System.out.println(e1.id+"---"+e1.name+"---"+e1.branch);
         
         
         System.out.println("<===========For Student ===========>");
         ArrayList<Student> a2 = new ArrayList<Student>();
 		a2.add(new Student(101, "Shruthi", "Tester"));
 		a2.add(new Student(102, "Anjali", "Tester"));
 		
 		for(Student s : a2) {
 			System.out.println(s.id+"=>"+s.name+"=>"+s.address);
 		}
 		System.out.println("<=========Getting By Index==========>");
        Student s1 = a2.get(1);
        System.out.println(s1.id+"=>"+s1.name+"=>"+s1.address);
	}

}
