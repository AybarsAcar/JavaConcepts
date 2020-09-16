package com.aybarsacar;

public class Main {

    public static void main(String[] args) {
	// write your code here

       SwitchStatement.printDay(5);

//       get 3 prime number
      int number = 0;
      for (int i = 100; i < 100000; i++) {
        if (number == 3) break;
        if (isPrime(i)) {
          System.out.println(i);
          number++;
        }
      }

       System.out.println(isPrime(1257));

       for (int i = 2; i <= 8; i++) {

         double result = calcIntRate(10000, i);
         System.out.println(result);

      }

//       get all the number 1 to 1000 that is div by 15
      int count = 0;
       for (int i = 0; i <= 1000; i++) {
         if (i % 15 == 0) {
           System.out.println(i);
           count += i;
           System.out.println(count);
         }
       }

    }

    public static double calcIntRate(double amt, double i) {

      return amt * i/100;

    }

    public static boolean isPrime(int num) {
      if (num == 1) return false;

      for (int i = 2; i < Math.sqrt(num); i++) {
        if (num % i == 0) return false;
      }
      return true;
    }

}
