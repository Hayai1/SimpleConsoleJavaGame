package com.example;

import java.util.List;
import java.util.Scanner;

public class Game {
    private String gameName;

    public Game(String gameName){
        this.gameName = gameName;
    }
    public void Menu(){
        System.out.println("Welcome to "+ this.gameName);
        print("1. Start Game");
        print("2. info");
        print("3. Credits");
        print("4. Exit");
        String userChoice = input();
        switch (userChoice) {
            case "1":
                print("what is your name?");
                String name = input();     
                Start(name);        
                break;
            case "2":
                print("This is a " + this.gameName + " go through the story and choose your path to get to the your end");
                break;
            case "3":
                print("Created by: Dylan Hough");
                break;
            case "4":
                print("Goodbye");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void Start(String name){
        String userChoice;
        //user chooses a door to open
        print("You wake up and push yourself off a cobbled ground and look around, you see 3 doors in front of you...?");
        print("behind you a message is written in red pesto pasta sauce on the wall, it says 'Choose wisely' one door leads to what you desire and the other to your demise!!");
        print("which door do you chooose?");
        // door 1 leads to outside
        // door 2 leads to a trap door
        // door 3 leads to a goat
        print("1. Door 1");
        print("2. Door 2");
        print("3. Door 3");
        userChoice = input();
        String doorOpened = "";
        switch (userChoice) {
            case "1":
                print("you put your hand on the door handle but all of a sudden door 3 swings open!!!");
                doorOpened = "3";
                break;
            case "2":
                print("you put your hand on the door but all of a sudden door 3 swings open!!!");
                doorOpened = "3";
                break;
            case "3":
                print("you put your hand on the door handle but all of a sudden door 2 swings open!!!");
                doorOpened = "2";
                break;
        }
        print("do you stay with your descicion or change your mind?");
        print("1. Door 1");
        print("2. Door 2");
        print("3. Door 3");
        userChoice = input();
        switch (userChoice) {
            case "1":
                print("you open the door and see a bright light, you walk through and find yourself outside, you have escaped the trap");
                break;
            case "2":
                if (doorOpened == "2"){
                    print("you deside to further inspect the room with the door that opened it's empty? ... all of a sudden the floor drops it was a trap door!!!");
                }
                print("you open the door and walk into the room and see a trap door, you fall through and find yourself in");
            case "3":
                if (doorOpened == "3"){
                    print("you deside to further inspect the room with the door that opened with the goat?");
                }
                print("you open the door and see a goat, you have been tricked");
                break;
        }

    }

    private String input(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    private void print(String msg){
        System.out.println(msg);
    }
    
}
