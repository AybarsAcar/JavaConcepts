package com.aybarsacar;

public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;


  //  we can get some of the super as defaild
  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;

  }

  private void chew() {
    System.out.println("chew chew");
  }

  private void run() {
    System.out.println("running");
  }
  private void walk() {
    System.out.println("walking");
  }


  @Override
  public void eat() {
    System.out.println("Dog eat is called");
    chew();
    super.eat();
  }

  @Override
  public void move(int speed) {
    if (speed > 50) {
      this.run();
    } else {
      this.walk();
    }
    super.move(speed);
  }

  public int getEyes() {
    return eyes;
  }

  public int getTeeth() {
    return teeth;
  }

  public int getLegs() {
    return legs;
  }

  public int getTail() {
    return tail;
  }

  public String getCoat() {
    return coat;
  }

}
