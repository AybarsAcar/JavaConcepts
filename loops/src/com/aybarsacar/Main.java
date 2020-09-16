package com.aybarsacar;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int count = 0;
    while (count < 10) {
      System.out.println(count);
      count++;
    }

    count = 0;
    do {
      System.out.println(count);
      count++;
    } while (count < 10);


    int start = 0;
    int finish = 20;
    int _count = 0;

    while (start <= finish) {
      if (_count == 5) break;
      start++;
      if (start % 2 != 0) {
        continue;
      }
      System.out.println("Even Number: " + start);
      _count++;
    }

    int sum = Challenges.sumDigits(132);
    System.out.println(sum);
  }
}
