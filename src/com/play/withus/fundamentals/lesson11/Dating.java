package com.play.withus.fundamentals.lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dating {

    public static void main(String[] args) {
        System.out.println("displaying local date...");

        LocalTime localTime = LocalTime.now();
        System.out.println("local time is " + localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date is " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local date time is " + localDateTime);

        //local date

    }
}
