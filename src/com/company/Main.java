package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Duplicates
        int a = 5, b = 9;
        int result1 = a + b;
        System.out.println(result1);

        int c = 15, d = -9;
        int result2 = c + d;
        System.out.println(result2);

        int e = 15, f = -19;
        int result3 = e + f;
        System.out.println(result3);

        // Reduce 1
        System.out.println(" FUNCTIONS v-1");
        int result4 = add(5, 9); //method call
        System.out.println(result4);
        int result5 = add(15, -9); //method call
        System.out.println(result5);
        int result6 = add(15, -19); //method call
        System.out.println(result6);

        System.out.println(" FUNCTIONS v-2");

        String result7 = v2(5, 9); //method call
        System.out.println(result7);
        String result8 = v2(15, -9); //method call
        System.out.println(result8);
        String result9 = v2(15, -19); //method call
        System.out.println(result9);

        //Direct call
// Reduce 2
        System.out.println(add(78, 9734));
        System.out.println(v2(78, 9734));
        System.out.println(add(78, 9734));
        System.out.println(v2(78, 9734));
        System.out.println(add(78, 9734));
        System.out.println(v2(78, 9734));
        System.out.println(add(78, 9734));
        System.out.println(v2(78, 9734));
        System.out.println(add(78, 9734));
        System.out.println(v2(78, 9734));
    }

    static int add(int arg1, int arg2) { // method definition
        return arg1 + arg2;
    }

    static String v2(int arg1, int arg2) { // method definition
        return "This result of arg1 = " + arg1 + " arg2" + arg2 + " = " + (arg1 * arg2);
    }
}
