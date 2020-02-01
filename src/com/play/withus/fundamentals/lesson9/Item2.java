package com.play.withus.fundamentals.lesson9;


// this is a situation where
// we have a private method that is setting the id
// to use it whe need to put it in the constructor
public class Item2 {
    private int id;
    private String desc;
    private double price;
    private static int nextId = 1; //use a static to keep count of the number

    public Item2() {
        setId();
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
