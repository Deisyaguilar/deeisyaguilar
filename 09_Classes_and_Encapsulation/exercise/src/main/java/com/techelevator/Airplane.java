package com.techelevator;
//Instance variables
//Attribute 	            Data Type	Get	    Set	    Description
//planeNumber	            String	    X		        The six-character plane number.
//totalFirstClassSeats	    int     	X		        The total number of first class seats.
//bookedFirstClassSeats	    int     	X		        The number of already booked first class seats.
//availableFirstClassSeats 	int     	X		        The number of available first class seats.
//^(derived)
//totalCoachSeats	        int     	X		        The total number of coach seats.
//bookedCoachSeats	        int     	X		        The number of already booked coach seats.
//availableCoachSeats	    int     	X		        The number of available coach seats.
//^(derived)
//Notes
//
//availableFirstClassSeats is a derived value calculated by subtracting bookedFirstClassSeats from totalFirstClassSeats.
//availableCoachSeats is a derived value calculated by subtracting bookedCoachSeats from totalCoachSeats.
//        Constructors
//Create a constructor for this class that accepts three parameters: String planeNumber, int totalFirstClassSeats, and int totalCoachSeats.
// Use these parameters in this order to set the properties of the class:
//
//planeNumber is the plane number assigned to the airplane.
//totalFirstClassSeats is the initial number of total first class seats.
//totalCoachSeats is the initial number of total coach seats.
//        Methods
//Create a method called reserveSeats() that returns a boolean and accepts two parameters: a boolean called forFirstClass and an int called totalNumberOfSeats.
//
//If forFirstClass is true, add totalNumberOfSeats to the value for bookedFirstClassSeats.
//If forFirstClass is false, add totalNumberOfSeats to the value for bookedCoachSeats.
//It returns true if there were enough seats to make the reservation, otherwise it returns false and the number of booked seats doesn't change.

public class Airplane {

 private String planeNumber;
 private int totalFirstClassSeats;
 private int bookedFirstClassSeats;
 private int availableFirstClassSeats;
 private int totalCoachSeats;
 private int bookedCoachSeats;
 private int availableCoachSeats;

 public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
     this.planeNumber = planeNumber;
     this.totalFirstClassSeats = totalFirstClassSeats;
     this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

//Create a method called reserveSeats() that returns a boolean and accepts two parameters: a boolean called forFirstClass and an int called totalNumberOfSeats.
//If forFirstClass is true, add totalNumberOfSeats to the value for bookedFirstClassSeats.
//If forFirstClass is false, add totalNumberOfSeats to the value for bookedCoachSeats.
//It returns true if there were enough seats to make the reservation, otherwise it returns false and the number of booked seats doesn't change.

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
     if(forFirstClass){
         if(totalNumberOfSeats > getAvailableFirstClassSeats()){
             return false;
         }
         bookedFirstClassSeats += totalNumberOfSeats;
     } else {
         if (totalNumberOfSeats > getAvailableCoachSeats()){
             return false;
         }
         bookedCoachSeats += totalNumberOfSeats;
     }
     return true;
    }
}
