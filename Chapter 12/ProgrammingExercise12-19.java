import java.util.Scanner;

class ProgrammingExercise12_19 {
	public static void main(String[] args) {
		try {
			java.net.URL url = new java.net.URL(
				"http://cs.armstrong.edu/liang/Lincoln.txt");

			int count = 0;

			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				
				if (Character.isLetter((input.next()).charAt(0))) {
					count++;
				}
			}

			System.out.println("Number of words in President Abraham Lincoln's Gettysburg address: " + count);
		}
		
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		
		catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}
	}
}