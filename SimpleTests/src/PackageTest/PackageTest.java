package PackageTest;
import com.horstmann.corejava.Employee;
// the Employee class is defined in that package

import static java.lang.System.*;
// this program demonstrates the use of package

public class PackageTest{
	public static void main(String[] args) {
		// we have already included the class in com.horstmann.corejava package
		Employee harry = new Employee("Harry Hacker", 50000.0, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		// because of the static import statement, we don't have to use System.out here
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());
	}
}
