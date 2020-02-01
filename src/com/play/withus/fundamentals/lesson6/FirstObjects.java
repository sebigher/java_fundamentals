package com.play.withus.fundamentals.lesson6;

public class FirstObjects {
    public static void main(String[] args) {
        //object -> properties + behaviours(methods)
        Customer c1 = new Customer(); //declare and instantiate


        Customer c2;//declare  a reference to a Customer instance
        c2 = new Customer(); // and instantiate and
        // assign the reference to the instance

        //properties for c1
        c1.age = 40;
        c1.name = "Duke";

        //properties for c2
        c2.age = 23;
        c2.name = "Momo";


        //igniting some behaviours for c1, c2
        // there is another way to say: "sending  messages" to an object
        c1.displayCustomer();
        c2.displayCustomer();

        //something in the STACK, feeding the GC
        new Customer(); // useless instance, we cannot handle it
        // as we don't have a reference


    }
}

