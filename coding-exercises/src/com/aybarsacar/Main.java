package com.aybarsacar;

public class Main {

//    final value is readonly in TS
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	// call the function
        double mph = SpeedConverter.speedConverter(200);
        System.out.println(mph);

        SpeedConverter.printMPH(200);

        boolean val = RoundTwo.areEqual(15.1489, 15.1532);

        System.out.println(val);

        System.out.println(MethodOverloading.getDuration(84, 19));

    }

}
