package chapter5_heritance.abstractClasses_5_4;

public class Student extends Person{
	private String major;
	
	/**
	 * @param name the student's name
	 * @param major the studen's major
	 */
	public Student(String name, String major) {
		// pass n to superclass constructor
		super(name);
		this.major = major;
	}
	
	public String getDescription() {
		return "a student majoring in " + major;
	}
}