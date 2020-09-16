package com.aybarsacar;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Player player = new Player();
    player.name = "Aybars";
    player.health = 100;
    player.weapon = "Sword";

    player.loseHealth(10);
    System.out.println(player.healthRemaining());

    player.loseHealth(100);
    System.out.println(player.healthRemaining());
  }
}
