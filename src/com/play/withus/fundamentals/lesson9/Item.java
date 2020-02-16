package com.play.withus.fundamentals.lesson9;


public class Item {
    private double price = 15.50;
    private String name;

    // to what good is a setter(not like a standard setter, but a setter though)
    public void setPrice(Customer customer) {
        if (customer.hasLoyaltyDiscount()) {
            price = price * .85;
        }
    }

    // standard getter
    public double getPrice() {
        return price;
    }

    // we can use setter to enforce some values
    public void setName(String str) {
        if ((str != null)
            && (!str.equals(""))
            && (str.matches("^[a-zA-Z]*$"))) {
            this.name = str;
        }
    }

    // even if I have a smart setter,
    // what if we call getter before setter?
    //  the obvious solution is to use a constructor(smart constructor or use the setter in the constructor)
    public String getName() {
        //return name.toUpperCase(); // can be null
        if (this.name != null) {
            return this.name.toUpperCase();
        }
        return this.name;
    }
}

