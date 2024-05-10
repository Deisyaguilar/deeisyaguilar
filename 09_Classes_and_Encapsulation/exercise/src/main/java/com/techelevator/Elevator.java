package com.techelevator;

//Instance variables
//Attribute	        Data Type	Get 	Set 	Description
//currentFloor  	int	        X		        The current floor that the elevator is on.
//numberOfFloors	int	        X		        The number of floors available to the elevator.
//doorOpen	        boolean 	X		        Whether the elevator door is open or not.
//Constructor
//The Elevator class has a single constructor that accepts one parameter, int numberOfLevels, which indicates how many floors are available to the elevator.
//
//Either provide a default value or set it in the constructor so new elevators start on floor one.
//
//        Methods
//Create methods based on the following signatures:
//
//void openDoor()
//void closeDoor()
//void goUp(int desiredFloor)
//void goDown(int desiredFloor)
//Notes
//
//openDoor() opens the elevator door.
//closeDoor() closes the elevator door.
//goUp(int desiredFloor) sends the elevator upward to the desired floor as long as the door isn't open. The elevator can't go past the last floor.
//goDown(int desiredFloor) sends the elevator downward to the desired floor as long as the door isn't open. It can't go past floor one.

public class Elevator {

private int currentFloor;
private int numberOfFloors;
private boolean doorOpen;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }

        public int getCurrentFloor() {
            return currentFloor;
        }
        public int getNumberOfFloors() {
            return numberOfFloors;
        }
        public boolean isDoorOpen() {
            return doorOpen;
        }

    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if(!doorOpen && desiredFloor > currentFloor && desiredFloor <= numberOfFloors){
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desireFloor){
        if(!doorOpen && desireFloor < currentFloor && desireFloor > 0){
            currentFloor = desireFloor;
        }
    }
}
