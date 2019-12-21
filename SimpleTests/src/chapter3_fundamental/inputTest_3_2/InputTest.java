package chapter3_fundamental.inputTest_3_2;
import java.util.*;

public class InputTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("whats your name sis ");
		String name = in.nextLine();
		System.out.print("how old are you ");
		int age = in.nextInt();
		
		System.out.println("Hello " + name + ", next year you'll be " + (++age));
	}
}