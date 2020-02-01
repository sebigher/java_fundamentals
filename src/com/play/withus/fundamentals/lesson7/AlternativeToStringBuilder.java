package com.play.withus.fundamentals.lesson7;

public class AlternativeToStringBuilder {

    public static void main(String[] args) {
        // StringBuilder is mutable...
        //it can be changed in place...
        // better performance(it does not create new objects)


        // advantages: appending


        String myString = " Hello";
        //STACK              HEAP
        // myString ------> "Hello"
        myString += " World";

        //STACK            HEAP
        // myString        "Hello"
        //         |_____> "What? Hello World"
        System.out.println("What? " + myString);
        // another String "Hello World" is made
        // and the previous "Hello" is lost in the pool (HEAP)

        StringBuilder sb = new StringBuilder("Hello");
        //STACK      HEAP
        //sb --------->0x034009["Hello"]
        sb.append(" World"); //  at the same address
        // sb --------> 0x034009["Hello World"]

    }
}
