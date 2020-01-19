package com.play.withus.fundamentals.lesson6;

public class MeetNPE {
    public static void main(String[] args) {
        DoomsDay day; // stupid reference
        // there is no object in the HEAP targeted by this reference
        //compiler error: variable might not have been initiazed
        // System.out.println(" the name of the doom:" + day.name);

        DoomsDay[] days = new DoomsDay[4];
        days[0] = new DoomsDay();
        days[0].name = "the end";
        // we create a reference days to an array of elements
        // there are no objects assigned
        // the compiler is not smart enough to check all the array elements
        //this will compile ...
        System.out.println(days[2].name); // Exception in thread "main" java.lang.NullPointerException

        //STACK                          HEAP
        // days ====>  [0x00099] [null] [null] [null]     0x00099: [name:"the end"]

        // the meaning of null: there is no data there
    }

}

class DoomsDay {
    String name;
}
