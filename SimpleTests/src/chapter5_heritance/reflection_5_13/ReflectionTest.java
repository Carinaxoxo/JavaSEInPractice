package chapter5_heritance.reflection_5_13;

import java.util.*;
import java.lang.reflect.*;

// this program uses reflection to print all features of a class

public class ReflectionTest{
	public static void main(String[] args) {
		// read class name from command line args or user input
		String name;
		if (args.length > 0) name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date: )");
			name = in.next();
		}
		
		try {
			// print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print("class " + name);
			if (supercl != null && supercl != Object.class) System.out.print(" extends "
					+ supercl.getName());
			System.out.print("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.print("}");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	// prints all constructors of a class
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");
			
			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	// print all methods of a class
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		
		for (Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();
			
			System.out.print("   ");
			// print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			
			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) System.out.print(" ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	// print all fields of a class
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		
		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(type.getName() + " " + name + ";");
		}
	}
}