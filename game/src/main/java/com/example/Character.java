package com.example;

import java.util.Scanner;

public class Character {
    
    public String input() {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      return input;
   }

   public void print(String msg) {
      System.out.println(msg);
   }
}
