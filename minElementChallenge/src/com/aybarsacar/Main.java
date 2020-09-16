package com.aybarsacar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // write your code here

    int[] myArray = readInts(5);
    System.out.println(Arrays.toString(myArray));
    System.out.println(minValue(myArray));

    int[] reversedArray = reverseArray(myArray);
    System.out.println(Arrays.toString(myArray));
    System.out.println(Arrays.toString(reversedArray));
    _reverseArray(myArray);
    System.out.println(Arrays.toString(myArray));

  }

  private static int[] readInts(int count) {
    int[] array = new int[count];

    for (int i = 0; i < count; i++) {
      System.out.println("Enter a number: ");
      array[i] = scanner.nextInt();
    }
    return array;
  }

  private static int minValue(int[] array) {
    int minValue = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
      }
    }
    return minValue;
  }

  private static int[] reverseArray(int[] array) {
    int[] reversedArray = new int[array.length];

    for (int i = 0; i < reversedArray.length; i++) {
      reversedArray[i] = array[array.length - i - 1];
    }
    return reversedArray;
  }


  private static void _reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }

}
