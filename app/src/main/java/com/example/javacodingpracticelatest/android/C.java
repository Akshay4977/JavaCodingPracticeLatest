package com.example.javacodingpracticelatest.android;

import android.util.Log;

public class C implements  A, B {
    @Override
    public void add(int a, int b, String from ) {
        Log.e("inside",from + "  result ->"+(a+b));
    }

    @Override
    public void add(float a, float b) {

    }
}
