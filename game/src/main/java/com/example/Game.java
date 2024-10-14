package com.example;

import java.util.Scanner;

public class Game {
    private String gameName;

    public Game(String gameName){
        this.gameName = gameName;
    }
    public void Menu(){
        System.out.println("Welcome to "+ this.gameName);
        System.out.println("1. Start Game");
        System.out.println("2. info");
        System.out.println("3. Credits");
        System.out.println("4. Exit");
        String userChoice = input();
        switch (userChoice) {
            case "1":                
                break;
            case "2":
                System.out.println("This is a " + this.gameName + " go through the story and choose your path to get to the your end");
                break;
            case "3":
                System.out.println("Created by: Dylan Hough");
                break;
            case "4":
                System.out.println("Goodbye");
                System.exit(0);
                break;
            default:
                break;
        }

    }
    public String input(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
}
