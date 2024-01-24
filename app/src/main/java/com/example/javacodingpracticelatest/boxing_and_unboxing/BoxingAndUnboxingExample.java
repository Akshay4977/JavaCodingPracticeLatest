package com.example.javacodingpracticelatest.boxing_and_unboxing;

import android.util.Log;

public class BoxingAndUnboxingExample {

    public  void BoxingAndUnboxingExampleTemp() {
        boxingExample();

        unBoxingExample();

    }

    /*
     * The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing
     * */
    void boxingExample() {
        int a1 = 20;
        Integer a2 = new Integer(a1);//Boxing
        Integer a3 = 10;//Boxing

        Log.e("inside", "->" + (a2 + a3));
    }


    /*
     * The automatic conversion of  Wrapper type types into its equivalent primitive data is known as boxing
     * */
    void unBoxingExample() {
        Integer integer = new Integer(10);
        int a = integer; //Unboxing
        Log.e("inside", "->" + a);
    }
}
