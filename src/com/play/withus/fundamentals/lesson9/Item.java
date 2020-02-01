package com.play.withus.fundamentals.lesson9;


/**
 * this is one of the first appearances of
 * "programming to the interface" due the encapsulation
 * of the price (this is de facto the encapsulation:
 * hiding object fields )
 */
public class Item {
    private double price = 15.50;

    public void setPrice(Customer customer) {
        if (customer.hasLoyaltyDiscount()) {
            price = price * .85;
        }
    }
}

