package com.aybarsacar;

public class SpeedConverter {

  //    speed converter
  public static double speedConverter(double speed) {

    if (speed < 0) return -1;

    return Math.round(0.621371 * speed);

  }

  public static void printMPH(double speed) {
    if (speed < 0) {
      System.out.println("invalid number");
    } else {
      double mph = speedConverter(speed);
      System.out.println(mph + " MPH");
    }

  }



}
