package com.aybarsacar;

/*
this is to create a Car
this is a public class -- fully accessable
 */
public class Car {

  //  fields / props of the car
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  //  method to assign
  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if (validModel.equals("x5") || validModel.equals("4.20")) {
      this.model = model;
    }
  }

  public String getModel() {
    return this.model;
  }

}
