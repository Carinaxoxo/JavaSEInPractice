package chapter5_heritance.objectAnalyzer_5_14;

import java.util.ArrayList;

// this program uses reflection to spy on objects

public class ObjectAnalyzerTest{
	public static void main() {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 1; i <= 5; i++) 
			squares.add(i * i);
		System.out.println(new ObjectAnalyzer().toString(squares));
	}
}