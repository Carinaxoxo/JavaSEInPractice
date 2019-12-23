package chapter6_interfaces_lambdaExpressions_innerClasses.interfaces_6_1;

import java.util.*;

// this program demonstrates the use of the Comparable interface

public class EmployeeSortTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tommy Tester", 38000);
		
		Arrays.sort(staff);
		
		// print out info about all Employee objects
		for (Employee e : staff)
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
	}
}