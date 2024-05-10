package com.techelevator;

//Instance variables
//Attribute 	Data Type	Get	    Set 	Description
//earnedMarks	   int     	X	    X	    The total number of correct marks submitter received on the assignment.
//possibleMarks	   int  	X		        The number of possible marks on the assignment.
//submitterName	  String	X		        The submitter's name for the assignment.
//letterGrade     String	X		        The letter grade for the assignment.
//^(derived)
//Notes
//
//letterGrade is a derived attribute that's calculated using earnedMarks and possibleMarks:
//For 90% or greater, it returns "A"
//For 80-89%, it returns "B"
//For 70-79%, it returns "C"
//For 60-69%, it returns "D"
//Otherwise, it returns "F"
//hint: possibleMarks and earnedMarks are ints. What happens when a smaller integer is divided by a larger integer?
//Constructor
//The HomeworkAssignment class has a single constructor. It accepts two arguments: int possibleMarks and String submitterName.
// Use these parameters to set the instance variables of the class.

public class HomeworkAssignment {

private int earnedMarks;
private int possibleMarks;
private String submitterName;
private String letterGrade;

public HomeworkAssignment(int possibleMarks, String submitterName){
    this.possibleMarks = possibleMarks;
    this.submitterName = submitterName;
    }

    public int getPossibleMarks(){
    return possibleMarks;
    }
    public int getEarnedMarks(){
    return earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks){
    this.earnedMarks = earnedMarks;
    }
    public String getSubmitterName(){
    return submitterName;
    }

    public String getLetterGrade(){
    double percentage = (double) earnedMarks/possibleMarks;
        if (percentage >= .90){
            return "A";
        } else if (percentage >= .80){
            return "B";
        } else if (percentage >= .70){
            return "C";
        } else if (percentage >= .60){
            return "D";
        } else {
        return "F";
        }
}

}
