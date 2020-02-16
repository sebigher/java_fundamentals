package com.play.withus.fundamentals.lesson10;

import java.util.Scanner;


//MYTH BREAKER: switch cannot return anything aka you cannot assign switch to something
// because of the weird cases that can pop up
public class SwitchTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String zzz = scan.nextLine();
        double trouble; //COMPILER TALKS: I don't care if you declare it
        String defaulter;

        switch (zzz) {
            case "a":
                trouble = 2.0; //CT: I care if you assign some forbidden value(I'm checking the type....)
                System.out.println("it's a letter");
                break; // this is the floor for this condition and the ceiling of the next one

            case "x":
                trouble = 1.0;
                System.out.println("some other input");
                break;
            default:
                defaulter = "what";
                System.out.println("whatever");
                //CT: I care if you want to use trouble
                //  I was checking the switch, and it looks like there ia a branch where trouble is not used/assigned
                // it might be that it isn't initialized
                //  System.out.println("trouble: "+ trouble);
        }


        //another technique used
        // is to have this outside variable getting values from every branch

        //MyTH BREAKER: the usage of any enum in switch


        DEVICECAPS devicecaps;
        //System.out.println("enum: " + devicecaps); // again CT : you are trying to use something not really initialised


        devicecaps = DEVICECAPS.BETTER; // one of the enum values

        //can we have it null? YES
        devicecaps = null;
        System.out.println("enum value is: " + devicecaps); //BETTER

        // all the enum values
        DEVICECAPS[] allEnumValues = DEVICECAPS.values();
        System.out.println("all enum values are: " + allEnumValues); // do we have a toString() method for an array?


        devicecaps = DEVICECAPS.GOOD;
        System.out.println(devicecaps);

        // we are allowed to use this kind of simple enums
        switch (devicecaps) {
            case GOOD:
                System.out.println("life is good ");
                break;
            case BETTER:
                System.out.println("life gets better");
                break;
            default:
                ;
                ;
        }


    }

    //for the visibility
    enum DEVICECAPS {
        GOOD, BETTER;


        @Override
        public String toString() {
            System.out.println("===========");
            return super.toString();
        }
    }


}
