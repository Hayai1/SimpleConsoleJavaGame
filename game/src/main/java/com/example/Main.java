package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Game game = new Game("Simple Game");
      game.Menu();    
    }
    public String input() {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      scanner.close();
      return input;
   }

   public void print(String msg) {
      System.out.println(msg);
   }
}   