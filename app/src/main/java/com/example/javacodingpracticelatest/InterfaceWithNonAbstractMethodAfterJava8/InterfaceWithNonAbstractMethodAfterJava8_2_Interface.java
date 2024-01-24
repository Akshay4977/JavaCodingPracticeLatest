package com.example.javacodingpracticelatest.InterfaceWithNonAbstractMethodAfterJava8;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

public interface InterfaceWithNonAbstractMethodAfterJava8_2_Interface {
    @RequiresApi(api = Build.VERSION_CODES.N)
    default void show() {
        Log.e("inside", "InterfaceWithNonAbstractMethodAfterJava8_2");
    }

}
