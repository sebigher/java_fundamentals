package com.play.withus.fundamentals.lesson9;


public class Order {


    public static void main(String[] args) {
        Customer cust = new Customer(12);
        Item item = new Item();
        item.setPrice(cust);
    }
}
