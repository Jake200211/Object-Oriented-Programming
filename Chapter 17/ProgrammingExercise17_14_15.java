import java.util.Scanner;
import java.io.*;

class ProgrammingExercise17_14_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Menu\n(1) Encrypt\n(2) Decrypt\n Menu Choice: ");
		int action = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter input file name: ");
		String file = input.nextLine();
		File inFile = new File(file);
		
		System.out.print("Enter output file name: ");
		File outFile = new File(input.nextLine());
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile));
		) {
			if (action ==1) {
				encrypt(in, out);
			}
			else if (action == 2) {
				decrypt(in, out);
			}
			else {
				System.out.println("You didn't enter 1 or 2 for menu.");
			}
		}
		catch (IOException e) {
			System.out.println("File could not be opened");
		}
	}
	public static void encrypt(BufferedInputStream in, BufferedOutputStream out) {
		try {
			int value1 = in.read();
			while(value1!= -1) {
				out.write(value1 + 5);
				
				value1 = in.read();
			}
		} 
		catch (IOException e) {
			System.out.println("Something went wrong");
		}
	}
	public static void decrypt(BufferedInputStream in, BufferedOutputStream out) {
		try {
			int value1 = in.read();
			while (value1!= -1) {
				out.write(value1 - 5);
				
				value1 = in.read();
			}
		}
		catch (IOException e) {
			System.out.println("Something went wrong");
		}
	}
}