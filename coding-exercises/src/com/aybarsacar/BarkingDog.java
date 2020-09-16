package com.aybarsacar;

public class BarkingDog {

  public static boolean shouldWakeUp(boolean isBarking, int hour ) {

    if (hour < 0 || hour > 23) {
      return false;
    }

    if (isBarking && hour < 8 && hour > 22) {
      return true;
    }

    return false;

  }
}
