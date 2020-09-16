package com.aybarsacar;

public class Exercise2 {

  public static double area(double radius) {
    if (radius < 0) return -1.0;

    return Math.PI * Math.pow(radius, 2);
  }

  public static double area (double h, double w) {

    if (h < 0 || w < 0) return -1.0;
    return h * w;

  }


  public static void printYearsAndDays (long min) {

    if (min < 0) System.out.println("Invalid input");

    long days = min / 24 * 60;
    long years = days / 365;
    long remainingYears = years % 365;

    System.out.println(min + " min = " + years + " years and " + days + " days");

  }


}
