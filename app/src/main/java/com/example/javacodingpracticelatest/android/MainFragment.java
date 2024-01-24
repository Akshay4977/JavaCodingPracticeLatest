package com.example.javacodingpracticelatest.android;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.javacodingpracticelatest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String text = getArguments().getString("key");
        Log.e("inside", "data ->" + text);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}