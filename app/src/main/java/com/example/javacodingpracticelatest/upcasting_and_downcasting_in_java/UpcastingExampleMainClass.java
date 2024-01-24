package com.example.javacodingpracticelatest.upcasting_and_downcasting_in_java;


/*
*
Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object. By using the Upcasting, we can easily access the variables and methods of the parent class to the child class. Here, we don't access all the variables and the method. We access only some specified variables and methods of the child class. Upcasting is also known as Generalization and Widening.
* */
public class UpcastingExampleMainClass {

    public void UpcastingExampleMainClassTemp() {
        Parent parent = new Child();
        parent.printData();
    }
}
