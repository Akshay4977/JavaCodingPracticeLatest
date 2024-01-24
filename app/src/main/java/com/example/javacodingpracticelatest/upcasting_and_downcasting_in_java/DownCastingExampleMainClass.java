package com.example.javacodingpracticelatest.upcasting_and_downcasting_in_java;

import android.util.Log;


/*
 * Upcasting is another type of object typecasting. In Upcasting, we assign a parent class reference object to the child class. In Java, we cannot assign a parent class reference object to the child class, but if we perform downcasting, we will not get any compile-time error. However, when we run it, it throws the "ClassCastException". Now the point is if downcasting is not possible in Java, then why is it allowed by the compiler? In Java, some scenarios allow us to perform downcasting. Here, the subclass object is referred by the parent class.
 * */
public class DownCastingExampleMainClass {

    public void DownCastingExampleMainClassTemp() {
        // Performing Downcasting Implicitly
        //Child c = new Parent(); // it gives compile-time error


        Parent parent = new Child();
        parent.name = "Aks";

        // Performing Downcasting Explicitly
        Child child = (Child) parent;
        child.age = 11;
        Log.e("inside", "name ->" + child.age);
        Log.e("inside", "name ->" + child.name);
    }
}
