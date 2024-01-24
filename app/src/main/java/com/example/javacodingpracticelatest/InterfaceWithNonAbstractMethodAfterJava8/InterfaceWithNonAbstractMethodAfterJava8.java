package com.example.javacodingpracticelatest.InterfaceWithNonAbstractMethodAfterJava8;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

public class InterfaceWithNonAbstractMethodAfterJava8 implements InterfaceWithNonAbstractMethodAfterJava8Interface, InterfaceWithNonAbstractMethodAfterJava8_2_Interface {


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void show() {
        InterfaceWithNonAbstractMethodAfterJava8Interface.super.show();

        InterfaceWithNonAbstractMethodAfterJava8_2_Interface.super.show();
    }

    @Override
    public void interfaceDemo() {
        Log.e("inside", "interfaceDemo");
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void temp() {

        InterfaceWithNonAbstractMethodAfterJava8 instance = new InterfaceWithNonAbstractMethodAfterJava8();
        instance.show();
        instance.interfaceDemo();

    }
}
