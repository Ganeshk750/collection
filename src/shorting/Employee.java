package shorting;

public class Employee implements Comparable<Employee> {
	
	int id;
	String ename;
	
	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}

	@Override
	public int compareTo(Employee e) {
		
		return ename.compareTo(e.ename);
	}

	/*
	 * @Override public int compareTo(Object o) { Employee e = (Employee) o; if(id
	 * == e.id) { return 0; }else if(id > e.id) { return +1; }else { return -1; }
	 * 
	 * }
	 */

}
