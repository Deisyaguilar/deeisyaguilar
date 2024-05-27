package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}
	// collect users input and perform search
	// look for search word
	// include line number
	// display a message to the user about the error
	// make sure that  the caseSensitiveSearch_LineNumbers and caseSensitiveSearch_LineText tests now pass

	public void run() {
		/* Your code goes here */

		System.out.println("What is the fully qualified name of this file that should be searched?");
		String inputFile = userInput.nextLine();
		File userFile = new File(inputFile);


		if(userFile.exists() == false){
			System.out.println(userFile + " does not exist.");
			System.exit(0);
		} else if (userFile.isFile() == false){
			System.out.println(userFile + " is not a file.");
			System.exit(0);
		}
		System.out.println("What is the search word you are looking for?");
		String searchWord = userInput.nextLine();

		if(searchWord == null || searchWord.isEmpty()){
			System.out.println(searchWord + " the word is not valid");
			System.exit(0);
		}
		System.out.println("Should the search be case sensitive? (Y/N)");
		String caseSensitive = userInput.nextLine();


		int lineNumber = 0;

		try (Scanner userFileScanner = new Scanner(userFile)){
			while(userFileScanner.hasNextLine()){
				String lineFile = userFileScanner.nextLine();
				lineNumber++;

				if(caseSensitive.equalsIgnoreCase("Y")) {
					if (lineFile.contains(searchWord)) {
						System.out.println(lineNumber + ") " + lineFile);
					}
				}else if (lineFile.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineNumber + ") " + lineFile);

				}
			}
		} catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
