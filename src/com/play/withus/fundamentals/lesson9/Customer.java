package com.play.withus.fundamentals.lesson9;


/**
 * this is the situation when
 * the data for a property
 * is different than we are trying to set
 */
public class Customer {
    // properties
    public String name = "Junior Duke";
    public int custId = 1204;
    public String address;
    public int orderNum;
    public int age;
    private int phone;


    // we cannot consider a real setter
    // but this is the best we have to set the value
    public void setPhone(String phoneNumber) {
        this.phone = Integer.parseInt(phoneNumber); // throws RTE
    }

    //constructors
    public Customer(int custId) {
        this.custId = custId;
    }

    //if there is no other constructorm, java(aka the compiler) consider there is one:
    // the default constructor
    public Customer() {
    }
    // like a cheap version of a constructor: you have to do all the work in
    // populating the objects using the fields/properties setters


    // behaviours
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }

    public boolean hasLoyaltyDiscount() {
        return custId < 1000;
    }
}
