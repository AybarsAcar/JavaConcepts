package com.aybarsacar;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Dimensions dimensions = new Dimensions(20, 20, 20);
    Case theCase = new Case("22ob", "dell", "240", dimensions);

    Monitor theMonitor = new Monitor("27inc Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.22");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);

    thePC.getMonitor().drawPixlAt(1, 2, "black");
    thePC.getTheCase().pressPowerButton();
  }
}
