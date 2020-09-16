package com.aybarsacar;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // create the int array
    int[] myIntegers = getIntegers(5);
    int[] sortedArray = sortArray(myIntegers);
    printArray(sortedArray);

  }

  static public int[] getIntegers(int length) {
    int[] array = new int[length];
    System.out.println("Enter " + length + " integer values:\r");

    for (int i = 0; i < length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  static public void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }
  }

  static public int[] sortArray(int[] array) {
//    create an array with the same size
    int[] sortedArray = new int[array.length];

//    copy the array
    for (int i = 0; i < array.length; i++) {
      sortedArray[i] = array[i];
    }

    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArray;
  }
}
