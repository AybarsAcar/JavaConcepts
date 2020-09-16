package com.aybarsacar;

public class Fish extends Animal {

  private int gills;
  private int eyes;
  private int fins;

  public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
    super(name, 1, 1, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }

  private void swim() {
    System.out.println("swimming");
  }

  public void makingSound() {
    System.out.println("blup blup");
  }

  @Override
  public void move(int speed) {
    this.swim();
    super.move(speed);
  }

  public int getGills() {
    return gills;
  }

  public int getEyes() {
    return eyes;
  }

  public int getFins() {
    return fins;
  }
}

