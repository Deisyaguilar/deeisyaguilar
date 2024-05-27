package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class QuizMaker {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		QuizMaker quizMaker = new QuizMaker();
		quizMaker.run();
	}

	public void run() {
		/* Your code goes here */

		System.out.println("Enter the fully qualified name of the file to read in for quiz question");
		String inputFile = userInput.nextLine();
		File userFile = new File(inputFile);
		List<String> quizQuestions = new ArrayList<>();


		try(Scanner fileInput = new Scanner(userFile)){
			while(fileInput.hasNextLine()){
				String fileLine = fileInput.nextLine();
				quizQuestions.add(fileLine);
			}
			int answerNumber = 1;
			String questions = null;
			int correctAnswer = 0;
			int score = 0;

			List<String> answers = new ArrayList<>();

			for (String quizQuestion : quizQuestions){
				System.out.println(quizQuestion);
			if(quizQuestion != null && !quizQuestion.isEmpty()){
				String[] split = quizQuestion.split("\\|");
				questions = split[0];

				for (int i = 1; i < split.length; i++){
					if(split[i].endsWith("*")){
						correctAnswer = i;
						answers.add(split[i].replace("*", ""));
					}else{
						answers.add(split[i]);
					}
				}
				System.out.println(questions);
				for(String answer: answers){
					System.out.println(answerNumber + ". " + answer);
					answerNumber++;
				}
				int userInputAnswer = userInput.nextInt();
				System.out.println("your answer: "+ userInputAnswer);
				if(userInputAnswer == correctAnswer){
					System.out.println("RIGHT!");
					score++;
				}else{
					System.out.println("WRONG!");
				}
				answerNumber = 1;
				answers.clear();
				System.out.println("You got "+ score +" correct out of "+quizQuestions.size());
			}
			}

		}catch (FileNotFoundException e){
			System.err.println("File not found" + userFile.getAbsolutePath());
			throw new RuntimeException(e);
		}



	}

}
