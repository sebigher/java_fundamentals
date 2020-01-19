package com.play.withus.fundamentals.lesson5;

public class FirstContainer {
    public static void main(String[] args) {

        //declare and initialize
        String[] items = {"Shirt", "Trousers", "Scarf"};

        //another way
        int[] stocks = new int[3];
        stocks[0] = 12;
        stocks[1] = 133;
        stocks[2]  =  32;
        // stock[3] = 23; compiler is NOT STOPPING US

        for (int i = 0; i < items.length ; i++) {
            System.out.println("item " + (i + 1)); // possible bug without brackets
            System.out.println(items[i]);
        }

        int i = 0;
        for (String item : items) {
            System.out.println("item " + ++i);
            System.out.println(item);
        }

        //fixed length(size)
        // we cannot add a new element to an old array

        // getting out

        for (int k: stocks) {
            System.out.println("stocks: " + k);
            if(k == 133){
                System.out.println("going out");
                break;
            }
        }


    }
}
