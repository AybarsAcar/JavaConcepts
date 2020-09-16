package com.aybarsacar;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return name;
  }
}

class Jaws extends Movie {

  public Jaws() {
    super("Jaws");
  }

  @Override
  public String plot() {
    return "A shark movie";
  }

}

class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot() {
    return "Aliens attemt to take ove planet earth";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot() {
    return "Imperial forces try to take over the universe";
  }
}

class Forgettable extends Movie {
  public Forgettable() {
    super("Forgettable");
  }

//    no plot
}

/*
MAIN METHOD
 */
public class Main {

  public static void main(String[] args) {
    // write your code here

    for (int i = 1; i < 9; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
          "Plot: " + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 4) + 1;
    switch (randomNumber) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependenceDay();
      case 3:
        return new StarWars();
      case 4:
        return new Forgettable();
    }
    return null;
  }
}
