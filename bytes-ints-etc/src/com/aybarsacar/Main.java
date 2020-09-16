package com.aybarsacar;

public class Main {

    public static void main(String[] args) {

        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        System.out.println("Int min:" + minVal);
        System.out.println("Int max:" + maxVal);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println(minByte);
        System.out.println(maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println(minShort);
        System.out.println(maxShort);

        long longVal = 100L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println(minLong);
        System.out.println(maxLong);

        int myTotal = (minShort/2);

        byte myNewByte = (byte) (minByte/2);

    }
}
