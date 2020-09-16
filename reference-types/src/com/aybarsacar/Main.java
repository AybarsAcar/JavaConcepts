package com.aybarsacar;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

//    Value type example
    int myIntValue = 10;
    int anotherIntValue = myIntValue;

    System.out.println("myIntValue " + myIntValue);
    System.out.println("anotherIntValue " + anotherIntValue);

    anotherIntValue++;

    System.out.println("myIntValue " + myIntValue);
    System.out.println("anotherIntValue " + anotherIntValue);

//    reference type example
    int[] myArray = new int[5];
    int[] anotherArray = myArray;

    System.out.println(myArray);
    System.out.println(anotherArray);

    System.out.println("myArray" + Arrays.toString(myArray));
    System.out.println("anotherArray" + Arrays.toString(anotherArray));

    anotherArray[0] = 1;
    System.out.println("myArray" + Arrays.toString(myArray));
    System.out.println("anotherArray" + Arrays.toString(anotherArray));

    int[] anArray = modifyArray(myArray);
    System.out.println(myArray);
    System.out.println(anotherArray);
    System.out.println(anArray);
  }

  private static int[] modifyArray(int[] array) {
    array[0] = 2;
    array = new int[] {1, 2, 3, 4, 5};
    return array;
  }
}
