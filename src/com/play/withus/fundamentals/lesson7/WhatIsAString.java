package com.play.withus.fundamentals.lesson7;

public class WhatIsAString {
    public static void main(String[] args) {
        String name = "Hoe";

        //discouraged
        String lastName = "Wiz";

        // a string is IMMUTABLE
        // its value cannot be changed

        //using the new operator to create a String
        // is forcing the creation of another object
        // whereas the usage without new is trying to reuse
        // the same string from a dedicated pool
        // memory -efficiency


        //concatenating strings is making another string
        String x = "abc";
        String y = "cnd";
        String z = x + y;
        System.out.println(z);

        //STACK      HEAP
        //x -------> "abc"
        // y --------> "cnd"
        // z --------> "abccnd"

        // methods on String class
        //returning primitive value
        System.out.println(x.length());
        System.out.println(x.indexOf('c'));
        System.out.println(x.indexOf('v')); // -1 as it is not found


        // methods on String class
        // returning object
        System.out.println(" HOW".trim());
        System.out.println("HOW".toLowerCase());


    }
}
