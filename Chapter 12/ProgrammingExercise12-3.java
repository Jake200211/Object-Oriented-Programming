/*
Author: Jacob Almeida
Date: 02-19-2019
*/
import java.util.*;

class ProgrammingExercise12_3 {
	public static void main(String[] args) {
		int[] test = new int[100];
		for(int i = 0; i < 100; i++){
			test[i] = (int)(Math.random() * 10000);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type in an index in the array, 0-99: ");
		int index = input.nextInt();
		try {
			System.out.println(test[index]);
		} catch (Exception ex) {
			System.out.println("The input you gave is not valid.  Please enter an integer from 0-99.");
		}
	}
}