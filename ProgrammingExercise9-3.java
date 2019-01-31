/*
Author: Jacob Almeida
Date: 01-23-2018
Description: Date object class

UML Diagram
--------------------------------
+date: Date()
+i: long
--------------------------------
+main(String[] args)
*/
import java.util.Date;
class ProgrammingExercise9_3 {
	public static void main(String[] args) {
		Date date = new Date();
		
		for (long i = 10000L; i < 100000000000L; i *= 10) {
				date.setTime(i);
			System.out.print(date + "\n");
		}
	}
}