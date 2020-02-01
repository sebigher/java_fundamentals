package com.play.withus.fundamentals.lesson6;

public class MeetNPE {
    public static void main(String[] args) {

        // not really a NPE: the compiler is smart this time(he knows we are pointing to an object)
        DoomsDay dayRef; // stupid reference
        // there is no object in the HEAP targeted by this reference
        //compiler error: variable might not have been initialized
        // System.out.println(" the name of the doom:" + dayRef.name);

        //STACk: dayRef             //HEAP: no object of type DoomsDay referenced by dayRef


        //NPE
        DoomsDay[] days = new DoomsDay[4];
        days[0] = new DoomsDay();
        days[0].name = "the end";
        //we can have the same bug as before (as array of primitives)
        // System.out.println(days[7]); // compiler remains silent.. but at RT: java.lang.ArrayIndexOutOfBoundsException: 7

        System.out.println("doomsdays are: " + days); //ARRAYS ARE  UGLY TO SEE: the array don't have a pretty print method
        System.out.println("pretty print: ");
        int indx = 0;
        for (DoomsDay day : days) {
            System.out.println("day[" + indx + "] = " + days[indx++]);
        }

        // we create a reference days to an array of elements
        // there are no objects assigned
        // the compiler is not smart enough to check all the array elements
        //this will compile ...but at RT:  day[2] = null
        System.out.println(days[2].name); // Exception in thread "main" java.lang.NullPointerException

        //STACK                          HEAP
        // days ====>  [0x00099] [null] [null] [null]     0x00099: [name:"the end"]

        // the meaning of null: there is no data there
    }

}

class DoomsDay {
    String name;

    @Override
    public String toString() {
        return "DoomsDay{" +
            "name='" + name + '\'' +
            '}';
    }
}
