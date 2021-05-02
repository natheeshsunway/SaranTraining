package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        char a[] = {'a', ' ', '8', '.', '9', '0', '^', 'a', ';', ','};

        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]);
        }

        System.out.println();

        String message = "Hi ,762@%'{} I am Natheeshkumar,Sarankumar,";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(5));
        System.out.println(message.contains("Natheeshkumar"));

        System.out.println();

        message = message.concat("Naveenkumar");

        System.out.println(message.concat("Naveenkumar"));

        if (message.contains("Naveenkumar")) {
            System.out.println("Natheesh is present");
        } else {
            System.out.println("Natheesh is not present");
        }
        /*
        In C,
        char a[]={'a',' ','8','.','9','0','^'};
        * */
    }
}
