package com.play.withus.fundamentals.lesson9;


// this is a situation where
// we have a private method that is setting the id
// to use it whe need to put it in the constructor

// also there is another technique : we want to count the instances of this class
// we have to use static (moreover private)
public class Item2 {
    private int id;
    private String desc;
    private double price;
    private static int nextId = 1; //use a static to keep count of the number


    // if we want a fine grain control of the order (to skip the case
    // when getter is called before setter than we have to use a custom constructor)
    public Item2() {
        setId();  // some kind of a setter (not a canonical one, but that will do)
        desc = "--description required--";
        price = 0.00;
    }

    private void setId() {
        id = Item2.nextId++;
    }

    @Override
    public String toString() {
        return "Item2{" +
            "id=" + id +
            ", desc='" + desc + '\'' +
            ", price=" + price +
            '}';
    }

    public static void main(String[] args) {
        Item2 item = new Item2();
        System.out.println(item);
        Item2 item2 = new Item2();
        System.out.println(item2);

    }
}
