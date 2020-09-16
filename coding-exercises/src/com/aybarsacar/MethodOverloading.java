package com.aybarsacar;

public class MethodOverloading {

  public static void calcScore(String name, int score ) {
    System.out.println(name + " scored" + score + " goals");
  }
  public static void calcScore( int score ) {
    System.out.println("Someone scored" + score + " goals");
  }

  public static String getDuration(long min, long sec) {
    if (min < 0 || sec < 0 || sec > 59) return "Invalid input";

    long hours = min / 60;
    long remainingMin = min % 60;

    return hours + "h " + remainingMin + "m " + sec + "s";

  }

  public static String getDuration (long sec) {
    if (sec < 0) return "Invalid input";

    long min = sec / 60;
    long remainingSec = sec % 60;

    return getDuration(min, remainingSec);
  }

}
