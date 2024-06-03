package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	/*If the number is divisible by 3, print Fizz.
If the number is divisible by 5, print Buzz.
If the number is divisible by 3 and 5, print FizzBuzz.
Otherwise, print the number.
The program must prompt the user for the following values:

The destination file
If the file already exists, it must be overwritten.
If the user enters an invalid destination file, the program indicates this and exits.
	 */

	public void run() {
		/* Your code goes here */

		String fileName = userInput.nextLine();

		try(PrintWriter writer = new PrintWriter(fileName)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					writer.println("FizzBuzz");
				} else if (i % 5 == 0) {
					writer.println("Buzz");
				} else if (i % 3 == 0 ) {
					writer.println("Fizz");
				} else {
					writer.println(i);
				}
				}
			}

		catch (FileNotFoundException e) {
			System.err.println("Cannot open file");
            throw new RuntimeException(e);
        }

    }
}
