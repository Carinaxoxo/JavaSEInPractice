package chapter4_objects_and_classes.calendarTest_4_1;
import java.time.*;

public class CalenderTest{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //current date
		int month = date.getMonthValue(); //current month
		int today = date.getDayOfMonth(); // today with a mark
		
		date = date.minusDays(today-1); //set to start of the month
		DayOfWeek weekday = date.getDayOfWeek(); // and get the weekday of that date
		// System.out.print(weekday);
		int value = weekday.getValue(); //1 = monday, ... 7 = sunday
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1;i < value; i++ ) {
			System.out.print("    ");
		}
		while (date.getMonthValue() == month) { // if the day is sitll in the same month
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else 
				System.out.print(" ");
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1)
				System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1)
			System.out.println();
	}
}