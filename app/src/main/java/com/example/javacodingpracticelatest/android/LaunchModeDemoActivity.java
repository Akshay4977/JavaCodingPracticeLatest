package com.example.javacodingpracticelatest.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.javacodingpracticelatest.MainActivity;
import com.example.javacodingpracticelatest.R;

public class LaunchModeDemoActivity extends AppCompatActivity {


    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode_demo);
        title = findViewById(R.id.title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp();
            }
        });
    }


    private void temp(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}