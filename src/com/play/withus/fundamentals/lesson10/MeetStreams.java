package com.play.withus.fundamentals.lesson10;

import java.util.List;

public class MeetStreams {

    public static void main(String[] args) {
        //source, 0-n intermediate ops, 1 final op
        //source: array, collection, generator function, I/O channel

        // intermediate ops : filter, map , peek
        // terminal : forEach, count, sum, average, collect

        // terminal short-circuit: findFirst, findAny, anyMatch, allMatch, noneMatch

        List<Employee> employeeList = Employee.createShortList();

        System.out.println("\n== CD bonuses ==");
        employeeList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach(salary -> System.out.printf("Bonus paid: $%, 6.2f %n", salary));
        

    }
}
