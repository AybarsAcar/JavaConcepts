package com.aybarsacar;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Car bmw = new Car();
    bmw.setModel("x5");
    System.out.println(bmw.getModel());

//    create an account
    Account myAccount = new Account("1234", 100.00, "Aybars");
    Account defaultAccount = new Account();
    Account aybarsAccount = new Account("12345", "Aybars Acar");

    System.out.println(myAccount.getCustomerName());
    System.out.println(defaultAccount.getCustomerName());
    System.out.println(aybarsAccount.getCustomerName());
    System.out.println(aybarsAccount.getBalance());
    System.out.println(aybarsAccount.getNumber());

    aybarsAccount.setNumber(10.00);

    System.out.println(aybarsAccount.getBalance());



//    create an animal
    Animal animal = new Animal("Animal", 1, 1, 5, 5);
    Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "silky coat");

    dog.eat();

    Random rand = new Random();
    int randSpeed = rand.nextInt(100);

    dog.move(randSpeed);

  }
}
