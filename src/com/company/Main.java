package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Saran,Naveen,Natheesh,lion";

        String[] meaasgeArray = message.split(",");
        System.out.println(meaasgeArray.length);

        for (int i = 0; i < meaasgeArray.length; i++) {
            System.out.println(meaasgeArray[i]);
        }
    }
}
