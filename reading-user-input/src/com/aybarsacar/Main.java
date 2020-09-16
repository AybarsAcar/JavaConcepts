package com.aybarsacar;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  /*  // we use the scanner to get the input
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println(name + ", enter your year of birth?");

    boolean hasNextInt = scanner.hasNextInt();
//    check the type
    if (hasNextInt) {
      int yearOfBirth = scanner.nextInt();
      int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
      if (age >= 0 && age <= 140) {
        System.out.println(name + " is " + age + " years old");
      } else {
        System.out.println("Invalid year of birth");
      }

    } else {
      System.out.println("Please enter a valid year");

    }

    scanner.close();
*/

//    another scanner
    Scanner anotherScanner = new Scanner(System.in);

    int count = 1;
    int sum = 0;

    while (count <= 10) {
      System.out.println("Enter a number #" + count + ":");
      boolean isInt = anotherScanner.hasNextInt();

      if (isInt) {
        int number = anotherScanner.nextInt();
        count ++;
        sum += number;
      } else {
        System.out.println("Invalid nubmer");
      }

      anotherScanner.nextLine();
    }
    System.out.println(sum);
    anotherScanner.close();
  }
}
