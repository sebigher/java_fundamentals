package com.play.withus.fundamentals.lesson6;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Item item = new Item();
        item.itemId = "1";
        // item sits in STACK
        // referencing an Item object from HEAP


        Item[] items = {item, new Item()};
        // items reference is still in STACK
        // can reference only one address
        // but at this address there is a table
        // with the addresses of all the objects
        // located one after another


    }
}


class Item {
    String itemId;
    double price;
    int colorCode;

    @Override
    public String toString() {
        return "Item{" +
            "itemId='" + itemId + '\'' +
            ", price=" + price +
            ", colorCode=" + colorCode +
            '}';
    }
}
