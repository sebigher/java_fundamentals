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
    // the parameter phoneNumber it's like a local variable in the terms of the scope and the lifetime

    //constructors
    public Customer(int custId) {
        this.custId = custId;
    }

    //if there is no other constructorm, java(aka the compiler) consider there is one:
    // the default constructor
    public Customer() {
    }
    // the cheapest version of a constructor: you have to do all the work in
    // populating the objects using the fields/properties setters


    // behaviours/object method
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }

    public boolean hasLoyaltyDiscount() {
        return custId < 1000;
    }

    public double customerActualBasket() {
        double totalValue = 0.0; // the scope of total value is the method body
        Item item1 = new Item();
        totalValue += item1.getPrice();
        return totalValue;
    }
    // think about  {...} like some border
    // totalValue it's local to the method customerActualBasket
    // it cannot be externalized beyond the method's borders
    // the local variable totalValue it's bound to this method: it's created when entering in the method
    // and then destroyed once we come back from the method's frame on stack


    // in STACK
    // ----------------frame of customerActualBasket---------
    // double totalValue = 0.0
    // --------------------------------------------


    // a local variable cannot have access modifiers at is bound to a method and
    // has a too short lifetime  to bother
}
