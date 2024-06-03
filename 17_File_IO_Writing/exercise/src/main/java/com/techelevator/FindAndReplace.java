package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    /*The search word
The word to replace the search word with
The source file
This must be an existing file. If the user enters an invalid source file, the program indicates this to the user and exits.
The destination file
The program creates a copy of the source file with the requested replacements at this location. If the file already exists,
it must be overwritten. If the user enters an invalid destination file, the program indicates this to the user and exits.
     */
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String fileSource = userInput.nextLine();
        File file = new File(fileSource);

        System.out.println("What is the destination file?");
        String destination = userInput.nextLine();
        File destinationFile = new File(destination);

        try (Scanner dataInput = new Scanner(file); PrintWriter dataOutput = new PrintWriter(destination)) {
            while(dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                dataOutput.println(lineOfInput.replace(searchWord, replacementWord));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open the file for writing.");
        }

        userInput.close();


    }

}
