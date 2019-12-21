package chapter5_heritance.abstractClasses_5_4;

public abstract class Person{
	public abstract String getDescription();
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}