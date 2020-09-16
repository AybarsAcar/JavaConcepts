package com.aybarsacar;

public class Main {

    public static void main(String[] args) {

        int anInt = 50;

        System.out.println(anInt++);

//        rand
        double myRand = Math.random()*100;

        if (myRand > 80) {
            System.out.println("Its larger than 80");
        } else if (myRand > 40) {
            System.out.println("Its larger than 40");
        } else {
            System.out.println("small number");
        }

        calculateScore(10, "Basketball", false);


        int calculatedScore = calculatePlayerScore(550);
        System.out.println(calculatedScore);
    }


    //        METHODS
    public static void calculateScore(int score, String game, boolean gameOver) {

        if (game.equals("Basketball")) {
             System.out.println("The score was:" + score * 2);
        } else {
            System.out.println("The Score was:" + score * 2);
        }

    }

//
    public static int calculatePlayerScore(int playerScore) {

        if (playerScore > 1000 ) {
            return 1;
        }
        if (playerScore > 500) {
            return 2;
        }
        if (playerScore > 100) {
            return 3;
        }

        return 4;

    }

}
