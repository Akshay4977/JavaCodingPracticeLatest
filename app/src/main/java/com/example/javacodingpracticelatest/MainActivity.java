package com.example.javacodingpracticelatest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.javacodingpracticelatest.android.DashboardActivity;
import com.example.javacodingpracticelatest.android.MainFragment;
import com.example.javacodingpracticelatest.android.SecondFragment;
import com.example.javacodingpracticelatest.java_practice.SubStringOccurrenceCount;
import com.example.javacodingpracticelatest.rx_java_practice.RxJavaPracticeClass;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private FrameLayout frame_layout;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("inside","create");
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

        SubStringOccurrenceCount subStringOccurrenceCount = new SubStringOccurrenceCount();
        subStringOccurrenceCount.getSubStringOccurrenceCount();

        //rxJavaPracticeClass.video1();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*fragmentDemo();

                try {
                    Thread.sleep(1000);
                    fragmentToFragmentDemo();
                    Log.e("inside", "here1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Log.e("inside", "here3");*/
                //simpleDialog();
                checkDataUpdateAfterAcitivityIsNotInForeground();
            }
        });
    }

    private void fragmentDemo() {
        Log.e("inside", "here2");
        Fragment fragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key", "value");
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, fragment, fragment.getClass().getName())
                .commit();
    }

    private void fragmentToFragmentDemo() {
        Fragment fragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key", "value");
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, fragment, fragment.getClass().getName())
                .commit();
    }

    @Override
    protected void onRestart() {
        Log.e("inside","onRestart");
        super.onRestart();
        Log.e("inside","onRestart");
    }

    @Override
    protected void onResume() {
        Log.e("inside","onResume");
        super.onResume();
        Log.e("inside","onResume");
    }

    private void simpleDialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Alert message to be shown");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    private void checkDataUpdateAfterAcitivityIsNotInForeground(){
        Log.e("inside","0");
        /*try {
            Log.e("inside","1");
            Thread.sleep(2000);
            Log.e("inside","2");
            textView.setText("updated");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Log.e("inside","5");
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
        Log.e("inside","6");
    }
}