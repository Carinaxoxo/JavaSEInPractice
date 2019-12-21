package chapter4_objects_and_classes.staticTest_4_3;

// this program demonstrates object construction

public class StaticTest{
	public static void main(String[] args) {
		// fill the staff array with three employee objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom", 40000);
		staff[1] = new Employee("Dick", 60000);
		staff[2] = new Employee("Harry", 65000);
		
		// print out info about all employee objects
		for (Employee e : staff) {
			e.setId();
			System.out.println("name = " + e.getName() + ", id = " + e.getId()
				+ ", salary = " + e.getSalary());
		}
		
		int n = Employee.getNextId(); // call static method
		System.out.print("Next available id = " + n);
	}
}

class Employee{
	private static int nextId;
	
	private int id;
	private String name;
	private double salary;
	
	// three overloaded constructors
	public Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		id = nextId; // set id to next available id
		nextId++;
	}
	
	public static int getNextId() {
		return nextId; // returns static field
	}
	
	public static void main() {
		Employee e= new Employee("Harry", 50000);
		System.out.print(e.getName() + " " + e.getSalary());
	}
}