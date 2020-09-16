package com.aybarsacar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /*
    create an integer array
    with 10 space
     */
    int[] myVariables = new int[10];

    myVariables[0] = 50;

    System.out.println(myVariables);

    int[] myIntArray = {1, 2, 3, 4, 5};

    System.out.println(myIntArray[2]);


    int[] myIntegers = getIntegers(5);
    for (int i = 0; i < myIntegers.length; i++) {
      System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
    }

    System.out.println("The average is: " + getAverage(myIntegers));
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values \r");
    int[] values = new int[number];

    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static double getAverage(int[] array) {
    int sum = 0;
    for (int j : array) {
      sum += j;
    }
    return (double) (sum / array.length);
  }
  

}
