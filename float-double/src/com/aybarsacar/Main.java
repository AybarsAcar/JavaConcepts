package com.aybarsacar;

public class Main {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min:" + minFloat);
        System.out.println("Float max:" + maxFloat);

        System.out.println("Double min" + Double.MIN_VALUE);
        System.out.println("Double max" + Double.MAX_VALUE);

        int myIntVal = 5;
        double myDouble = 5.25;
        float myFloat = 5.25f;

//        rounds it up
        System.out.println(myIntVal / 2);

//        Char and Booleans
        char myChar = 'A';
        char usingUnicode = '\u0044';

        String myName = "Aybars Acar";
        String appendedStr = "My name is " + myName;

        System.out.println(appendedStr);

        System.out.println(usingUnicode);

        boolean myBool = false;
        double randNumber = Math.round(Math.random()*100);
        

        if (!myBool) {
            System.out.println("passed");
        }

        if (myBool)  System.out.println("hello");

        String test = !myBool ? "passed" : "failed";

        System.out.println(test);
    }
}
