package com.example.javacodingpracticelatest.android;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javacodingpracticelatest.R;
import com.example.javacodingpracticelatest.models.User;

public class DashboardActivity extends AppCompatActivity  {

    private TextView screen_name_text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        screen_name_text_view = findViewById(R.id.screen_name_text_view);
        screen_name_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp();
            }
        });


        A a = new C();
        a.add(2,3, "A");

        B b = new C();
        b.add(2,3 ,"B");

        if (getIntent().getExtras() != null) {
            Log.e("inside", "-->" + getIntent().getExtras().getString("key"));
            User user = (User) getIntent().getSerializableExtra("user");
            Log.e("inside", "-->" + user.getUserName());
        }
    }

    private void temp(){
        Intent intent = new Intent(this, LaunchModeDemoActivity.class);
        startActivity(intent);
    }
}


/*

        textView.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
        LinkedListDSACodePractice linkedListDSACodePractice=new LinkedListDSACodePractice();
        //linkedListDSACodePractice.start();
        //navigate();
        //navigateToFragment();
        }
        });
private void navigate(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("user name");
        Intent intent=new Intent(this,DashboardActivity.class);
        intent.putExtra("key","value");
        intent.putExtra("user",user);
        startActivity(intent);
        }

private void navigateToFragment(){

        Bundle bundle=new Bundle();
        bundle.putString("key","value 1");

        Fragment fragment=new MainFragment();
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout,fragment,"").commit();

        }*/
