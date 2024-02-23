package com.example.javacodingpracticelatest.java_practice;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

public class SubStringOccurrenceCount {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void getSubStringOccurrenceCount() {
        String str = "this this is is done by google google";
        Map<String, Integer> wordCounts = countWords(str);

        System.out.println("Occurrences of each word:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            Log.e("inside", entry.getKey() + ": " + entry.getValue());
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
