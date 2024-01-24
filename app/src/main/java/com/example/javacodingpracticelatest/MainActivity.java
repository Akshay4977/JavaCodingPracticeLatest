package com.example.javacodingpracticelatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.javacodingpracticelatest.rx_java_practice.RxJavaPracticeClass;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private FrameLayout frame_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textClick);
        frame_layout = findViewById(R.id.frame_layout);
        /*
        //not abstract method in interface from java 8
        InterfaceWithNonAbstractMethodAfterJava8 instance = new InterfaceWithNonAbstractMethodAfterJava8();
        instance.temp();
        */

        /*UpcastingExampleMainClass upcastingExampleMainClass = new UpcastingExampleMainClass();
        upcastingExampleMainClass.UpcastingExampleMainClassTemp();

        DownCastingExampleMainClass downCastingExampleMainClass = new DownCastingExampleMainClass();
        downCastingExampleMainClass.DownCastingExampleMainClassTemp();

        BoxingAndUnboxingExample boxingAndUnboxingExample = new BoxingAndUnboxingExample();
        boxingAndUnboxingExample.BoxingAndUnboxingExampleTemp();*/

        /*PermutationOfStringPractice permutationOfStringPractice = new PermutationOfStringPractice();
        permutationOfStringPractice.temp();*/

        RxJavaPracticeClass rxJavaPracticeClass = new RxJavaPracticeClass();
        rxJavaPracticeClass.video1();
    }
}