package com.aybarsacar;

public class Challenges {

  public static int sumDigits(int num) {

    if (num < 0) return -1;
    if (num < 10) return num;

    int sum = 0;
    while (num > 0) {
//      extract the least significant digit
      int digit = num % 10;
      sum += digit;

//      drop the least significant digit
      num /= 10;
    }

    return sum;
  }

  //  PALINDROME
  public static boolean isPalindrome(int num) {
    return true;
  }


}
