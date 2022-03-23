package com.company;

public class Main {

    public static void main(String[] args) {
                //int Data Type
        int myValue = 10000;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("MY MAX VALUE IS =" + myMaxIntValue);
        System.out.println("MY MIN VALUE IS =" + myMinIntValue);
        /* OVERFLOW */
        System.out.println(myMaxIntValue +1);
        /* UNDERFLOW */
        System.out.println(myMinIntValue -1);

            //byte Data Type
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;

        System.out.println("My max byte is = " + myMaxByteValue);
        System.out.println("My min byte is = " + myMinByteValue);

        /*OVERFLOW DEMO  */
        int myMaxIntDemo = 21_474_8364_7;
        System.out.println("Demo -" + myMaxIntDemo);

        //short Data Type
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        System.out.println("My max Short is = " + myMaxShortValue);
        System.out.println("My min Short is = " + myMinShortValue);

                //long Data Type
        long myLongDemo = 100;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;

        System.out.println("Max long =" + myMaxLongValue);
        System.out.println("Min long =" + myMinLongValue);

        long bigLongLiteralValue = 21_474_8364_7L;
        System.out.println(bigLongLiteralValue);


                //casting
        int castingDemo = myMaxIntDemo/2;
        short shortDemo =(short) (myMaxShortValue/2);
    }
}
