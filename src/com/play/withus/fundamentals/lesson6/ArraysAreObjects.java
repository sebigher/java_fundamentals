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
        // array initializer is not allowed here

        // by comparison: simple primitive types are stored in STACK !!!
        //BUT an array of primitives(!!!) is located in HEAP
        // the elements of an array of primitives are stored one after another
        // so, the array reference knows about
        // the first element address


        // arrays of objects are something else

        int s = 12; //STACK
        int[] sumOfAllEvils; //STACK as it is a reference
        sumOfAllEvils = new int[3]; //HEAP as it's an object


    }
}
