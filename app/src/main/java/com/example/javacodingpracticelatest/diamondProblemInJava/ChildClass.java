package com.example.javacodingpracticelatest.diamondProblemInJava;


/*
 * Multiple inheritance is when a child class is inherits the properties from more than one parents and the methods for the parents are same (Method name and parameters are exactly the same) then child gets confused about which method will be called. This problem in Java is called the Diamond problem.
 * */
class ChildClass //extends Parent2, /* here will be syntax error*/Parent1
{

    void test() {
        ChildClass childClass = new ChildClass();
        //childClass.fun();
    }
}
