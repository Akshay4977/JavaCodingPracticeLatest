package com.example.javacodingpracticelatest.java_practice;

import android.util.Log;

public class PermutationOfStringPractice {

    static String swap(String input, int i, int j) {
        char[] inputCharArray = input.toCharArray();
        char temp = inputCharArray[i];
        inputCharArray[i] = inputCharArray[j];
        inputCharArray[j] = temp;

        return String.valueOf(inputCharArray);
    }

    static void permutationOfString(String input, int start, int end) {

        if (start == end - 1) {
            Log.e("inside", "-> " + input);
        } else {

            for (int i = start; i < end; i++) {

                input = swap(input, start, i);
                permutationOfString(input, start + 1, end);
                input = swap(input, start, i);
            }
        }
    }

    public void temp() {

        String str = "abcd";
        permutationOfString(str, 0, str.length());
    }

    /*  OUTPUT
 -> abcd
-> abdc
-> acbd
-> acdb
-> adcb
-> adbc
-> bacd
-> badc
-> bcad
-> bcda
-> bdca
-> bdac
-> cbad
-> cbda
-> cabd
-> cadb
-> cdab
-> cdba
-> dbca
-> dbac
-> dcba
-> dcab
-> dacb
-> dabc

    *
    * */
}
