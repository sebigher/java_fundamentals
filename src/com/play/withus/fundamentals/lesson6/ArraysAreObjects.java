package com.play.withus.fundamentals.lesson6;

public class ArraysAreObjects {

    public static void main(String[] args) {

        //preferred
        int[] ages = new int[4];
        //we can also define like
        int order[] = new int[2];


        //int[]  this is a reference type
        //ages it's a reference variable

        //define reference type
        double[] volumes;

        // it needs an object of type
        // array of doubles

        // shortcut to initialize arrays
        int[] some = {2, 3};

        // will not work in 2 lines
        //aka we cannot write
        int[] sj;
        //sj = {2,3}; //compiler error:
        // array initializer is not allowed herer

        //arrays of primitives(!!!) elements are located in memory
        // in HEAP, one after another
        // so, the array reference knows about
        // the first element address
        // primitive types are stored in STACK

        // arrays of objects are something else

        int s = 12; //STACK
        int[] sumOfAllEvils; //STACK
        sumOfAllEvils = new int[3]; //HEAP


    }
}
