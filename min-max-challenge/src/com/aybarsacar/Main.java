package com.aybarsacar;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scanner = new Scanner(System.in);

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    while (true) {
      System.out.println("Enter a number:");
      boolean isInt = scanner.hasNextInt();

      if (isInt) {
        int number = scanner.nextInt();
        if (number > max) {
          max = number;
        }
        if (number < min) {
          min = number;
        }

      } else {
        break;
      }
      scanner.nextLine();
    }

    System.out.println("min = " + min + ", max = " + max);
    scanner.close();
  }
}
