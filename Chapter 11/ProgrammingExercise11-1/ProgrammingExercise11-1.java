/*
Author: Jacob Almeida
Date: 02-11-2019
*/

import java.util.Scanner;

class ProgrammingExercise11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String color = "";
		char isFilled = ' ';
		boolean filled = false;
		
		//Prompt user for input
		System.out.print("Enter length of side 1: ");
		s1 = input.nextDouble();
		System.out.print("Enter length of side 2: ");
		s2 = input.nextDouble();
		System.out.print("Enter length of side 3: ");
		s3 = input.nextDouble();
		System.out.println("Enter color: ");
		//Clear input for nextLine(); method
		input.nextLine();
		color = input.nextLine().trim();
		System.out.print("Is this shape filled? (true/false) ");
		filled = input.nextBoolean();
		
		//Create the triangle
		Triangle t1 = new Triangle(s1, s2, s3);
		t1.setColor(color);
		t1.setFilled(filled);
		
		System.out.println(t1.toString());
	}
}