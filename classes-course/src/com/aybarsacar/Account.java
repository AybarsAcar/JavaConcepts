package com.aybarsacar;

public class Account {
  private String number;
  private double balance;
  private String customerName;

  public Account() {
    this("0000", 0.00, "No Name");
  }


  public Account(String number, double balance, String customerName) {

    this.number = number;
    this.balance = balance;
    this.customerName = customerName;

  }

  public Account(String number, String customerName) {
    this.number = number;
    this.customerName = customerName;
  }

  String getNumber() {
    return this.number;
  }

  double getBalance() {
    return this.balance;
  }

  String getCustomerName() {
    return this.customerName;
  }

  public void setNumber(double balance) {
    this.balance = balance;
  }


}
