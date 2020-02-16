package com.play.withus.fundamentals.lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dating {

    //jdk 8
    // fastest way to deal with time
    public static void main(String[] args) {
        System.out.println("displaying local date...");

        LocalTime localTime = LocalTime.now();
        System.out.println("local time is " + localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date is " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local date time is " + localDateTime);

        //local date
        // formatting the date as a String
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //ops
        localDate.minusDays(23);
        localDate.minusMonths(3);
        localDate.plusDays(21);
        localDate.plusMonths(1);
        localDate.plusWeeks(23);
    }
}
