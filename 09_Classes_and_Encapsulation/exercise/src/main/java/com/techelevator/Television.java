package com.techelevator;
//Instance variables
//Attribute	        Data Type	Get	    Set	    Description
//isOn	            boolean	    X		        Whether or not the TV is turned on.
//currentChannel	int     	X		        The value for the current channel. Channel levels go between 3 and 18.
//currentVolume	    int	        X		        The current volume level.
//Constructors
//The Television class doesn't need a constructor. However, the instance variables need default values: a new TV is off by default.
// The channel is set to three and the volume level to two.
//
//Methods
//Create methods based on the following signatures:
//
//void turnOff()
//void turnOn()
//void changeChannel(int newChannel)
//void channelUp()
//void channelDown()
//void raiseVolume()
//void lowerVolume()
//Notes
//
//turnOff() turns off the TV.
//turnOn() turns the TV on and also resets the channel to three and the volume level to two.
//changeChannel(int newChannel) changes the current channel—only if it's on—to the value of newChannel as long as it's between 3 and 18.
//channelUp() increases the current channel by one, only if it's on. If the value goes past 18, then the current channel must be set to three.
//channelDown() decreases the current channel by one, only if it's on. If the value goes below three, then the current channel must be set to 18.
//raiseVolume() increases the volume by one, only if it's on. The limit is 10.
//lowerVolume() decreases the volume by one, only if it's on. The limit is zero.

public class Television {

private boolean isOn;
private int currentChannel = 3;
private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;
    }
    public void turnOn() {
        isOn = true;
        currentChannel = 3;
        currentVolume = 2;
    }
    public void changeChannel(int newChannel) {
        if(isOn && newChannel >=3 && newChannel <= 18){
            currentChannel = newChannel;
        }
    }
    public void channelUp() {
        if (isOn){
            if (currentChannel == 18) {
                currentChannel = 3;
            } else {
                currentChannel++;
            }
        }
    }
    public void channelDown() {
        if (isOn){
            if (currentChannel == 3){
                currentChannel = 18;
            }else {
                currentChannel--;
            }
        }
    }
    public void raiseVolume(){
        if(isOn && currentVolume < 10){
            currentVolume ++;
        }

    }
    public void lowerVolume(){
        if(isOn && currentVolume > 0){
            currentVolume -=1;
        }
    }
}

