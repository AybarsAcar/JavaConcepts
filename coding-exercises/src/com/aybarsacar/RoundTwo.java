package com.aybarsacar;

public class RoundTwo {

  public static boolean areEqual(double num1, double num2) {
    return (int) num1 * 1000 == (int) num2 * 1000;
  }

  public static boolean equalSum(int num1, int num2, int sum) {
    return sum == num1 + num2;
  }

  public static boolean teen(int num1, int num2, int num3) {
    if ((num1 <= 19 && num1 >= 13) || (num2 <= 19 && num2 >= 13) || (num3 <= 19 && num3 >= 13)) {

      return true;
    }
    return false;
  }


}
