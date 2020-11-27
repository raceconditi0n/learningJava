package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer max Value =" + myMaxValue);


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte lowerst value = " + myMinByteValue);
        System.out.println("Byte Highest Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short lowerst value = " + myMinShortValue);
        System.out.println("Short Highest Value =" + myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long lowest value = " + myMinLongValue);
        System.out.println("Long Highest Value =" + myMaxLongValue);

        byte myChallengeByte = 10;
        short myChallengeShort = 5;
        int myChallengeInt = 2;
        long myChallengeLong = 5000 + ( 10 * (myChallengeByte + myChallengeInt + myChallengeShort));
        System.out.println( myChallengeLong);
        }

        double firstVar = 20.00;
        double secondVar = 80.00;
        double thirdVar = (firstVar + secondVar) * 100.00;
        double remainderVar = thirdVar % 40.00;
        boolean booleanOfVar = remainderVar == 0 ?  true : false;
        System.out.println()


}
