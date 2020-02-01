package com.play.withus.fundamentals.lesson5;

public class FirstContainer {
    public static void main(String[] args) {

        //declare and initialize
        String[] items = {"Shirt", "Trousers", "Scarf"};

        //another way and first hint that the compiler can be stupid
        //we are doing some booking here
        int[] stocks = new int[3];
        stocks[0] = 12;
        stocks[1] = 133;
        stocks[2] = 32;
        // java.lang.ArrayIndexOutOfBoundsException
        // stocks[3] = 23; //compiler is NOT STOPPING US !!!

        for (int i = 0; i < items.length; i++) {
            System.out.println("item " + (i + 1)); //  bug without brackets !!!
            System.out.println(items[i]);
        }

        int i = 0;
        for (String item : items) {
            System.out.println("item " + ++i);
            System.out.println(item);
        }

        //fixed length(size)
        // we extend an old array (there are no ops for that)

        // getting out
        for (int k : stocks) {
            System.out.println("stocks: " + k);
            if (k == 133) {
                System.out.println("going out");
                break;
            }
        }


    }
}
