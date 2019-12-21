package chapter4_objects_and_classes.paramTest_4_4;
// this is about parameters passing in Java

//import ClassPractices.Employee;

public class ParamTest{
	public static void main(String[] args){
		//test1: methods cannot modify numeric params
		System.out.println("testing tripleValue:");
		double percent = 10;
		System.out.println("before: percent=" + percent);
		tripleValue(percent);
		System.out.println("after: percent=" + percent);
		
		//test2: methods can change the state of object params
		System.out.println("\ntesing tripleSalary:");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("after: salary=" + harry.getSalary());
		
		//test3: methods cant attach new objects to object params
		System.out.println("\ntesting swap:");
		Employee a = new Employee("alice", 70000);
		Employee b = new Employee("bob", 60000);
		System.out.println("before: a=" + a.getName());
		System.out.println("before: b=" + b.getName());
		swap(a,b);
		System.out.println("after: a=" + a.getName());
		System.out.println("after: b=" + b.getName());
	}
	
	public static void tripleValue(double x){ //doesnt work
		x = 3*x;
		System.out.println("end of method: x=" + x);
	}
	
	public static void tripleSalary(Employee x){ // works
		x.raiseSalary(200);
		System.out.println("end of method: salary=" + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y){
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("end of method: x=" + x.getName());
		System.out.println("end of method: y=" + y.getName());
	}
}

class Employee{
	private String name;
	private double salary;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}